package br.com.login.servace.bank;



import br.com.login.model.Receptor;
import br.com.login.model.User;

public class Operation_Bank_Data {
    public static Boolean Valid_agency(int agency) {
        int cont=0;
        while(agency !=0) { agency = agency/10; cont++; }
        if(cont == 5){
            return true;
        }else{
            return false;
        }      
    }

    public static Boolean Valid_account(int account) {
        int cont=0;
        while(account !=0) { account = account/10; cont++; }
        if(cont == 5){
            return true;
        }else{
            return false;
        }      
    }
    public static Boolean Valid_digit(int digit) {
        int cont=0;
        while(digit !=0) { digit = digit/10; cont++; }
        if(cont == 1){
            return true;
        }else{
            return false;
        } 
    }
        public static Boolean Valid_Action(int agency,int account,int digit) {
            Boolean a,c,d;
            a= Valid_agency(agency);
            c= Valid_account(account);
            d= Valid_digit(digit);
            if(a && c && d){
                return true;
            }else
                return false;
         
    
}
public static void transfer(User user,String nameBank,float valueTransfer,int agency,int account,int digit) {

    if(valueTransfer <= user.get_Bank_Balance_Client()){
        /*Retira o valor do pix do saldo da conta*/
        user.set_Bank_Balance_Client(valueTransfer);
        Receptor.setBank_Balance_Recep(valueTransfer);
        /*Registra a Operação feita*/
      //user.setRegister("Feito do banco: "+nameBank+"\r\nCom a Agencia: "+agency+"\r\nCom a conta: "+account+"-"+digit+"\r\nCom o Valor: "+valueTransfer);
       // User.Extract.add("Feito do banco: "+nameBank+"\r\nCom a Agencia: "+agency+"\r\nCom a conta: "+account+"-"+digit+"\r\nCom o Valor: "+valueTransfer);
    }
}

    
}
