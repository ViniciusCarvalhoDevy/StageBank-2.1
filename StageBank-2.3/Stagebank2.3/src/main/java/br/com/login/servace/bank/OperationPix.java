package br.com.login.servace.bank;

import java.io.PrintWriter;

import br.com.login.model.ADM;
import br.com.login.model.Receptor;
import br.com.login.model.User;

public class OperationPix {
   
   
    /*Operation transfer*/
    public static void Transfer(User user,String key_pix,float valuePix,int type,PrintWriter out ) {
        
        String type_String ="";
        if(type == 1){
            type_String= "CPF";
        }else if(type == 2){
            type_String = "CNPJ";
        }else if(type == 3){
            type_String = "Numero de Celular";
        }else if(type == 4){
            type_String = "E-mail";
        }else if(type == 5){
            type_String = "Aleatória";
        }
        if(valuePix <= user.get_Bank_Balance_Client()){
            /*Retira o valor do pix do saldo da conta*/
            user.set_Bank_Balance_Client(valuePix);
            Receptor.setBank_Balance_Recep(valuePix);
            /*Registra a Operação feita*/
           //user.setRegister("\r\nFeito para a Chave "+type_String+":" +key_pix+"\r\nCom o valor: "+valuePix);
          // User.cadastroList.get(User.ID_Reference_page).setRegister("\r\nFeito para a Chave "+type_String+":" +key_pix+"\r\nCom o valor: "+valuePix);
           /*Salva as Chaves para quem foi feito o pix*/
          // user.setKeyPix(key_pix);
           out.println("<script>alert('Transição Via Pix Feita Com Sucesso!!')</script>");
           }else{
            out.println("<script>alert('Valor da Transação é Maior que o Valor Do Saldo!!')</script>");
           }

           System.out.println("Valor do Saldo Receptor: "+Receptor.getBank_Balance_Recep());
        }
    
        public static int Type_pix_validity(String key_pix) {
            if(Valid_Cpf_Pix(key_pix)){
               return 1;
            }else if(Valid_CNPJ_Pix(key_pix)){
                return 2;
            }else if(Valid_Phone_Pix(key_pix)){
                return 3;
            }else if(Valid_Email_Pix(key_pix)){
                return 4;
            }else if(Valid_Random_Pix(key_pix)){
                return 5;
            }else 
                return -1;
        }

        
        public static Boolean Valid_Key_Pix(String key_pix) {
            if(Valid_Cpf_Pix(key_pix)){
               return true;
            }else if(Valid_CNPJ_Pix(key_pix)){
                return true;
            }else if(Valid_Phone_Pix(key_pix)){
                return true;
            }else if(Valid_Email_Pix(key_pix)){
                return true;
            }else if(Valid_Random_Pix(key_pix)){
                return true;
            }else 
                return false;
        }
        /*Method for validate  pix key*/
        public static Boolean Valid_Cpf_Pix(String key_pix) {
            int tam= key_pix.length();
            if(tam == 11){
                return true;
            }else{
                return false;
            }      
        }

        public static Boolean Valid_CNPJ_Pix(String key_pix) {
            int tam= key_pix.length();
            if(tam == 14){
                return true;
            }else{
                return false;
            }      
        }
        public static Boolean Valid_Random_Pix(String key_pix) {
            int tam= key_pix.length();
            if(tam == 32){
                return true;
            }else{
                return false;
            }      
        }
        public static Boolean Valid_Email_Pix(String key_pix) {            
            CharSequence hotmail = "@hotmail.com";
            CharSequence gmail = "@gmail.com";
            if(key_pix.contains(gmail)){
                return true;
            }else if(key_pix.contains(hotmail)){
                return true;
            }else
                return false; 
        }
        public static Boolean Valid_Phone_Pix(String key_pix) {
            int tam= key_pix.length();
            
            if(tam == 13){
                return true;
            }else{
                return false;
            }      
        }
      
        /*Ação do ADM de retirar o dinheiro da conta do cliente*/
        public static void Transfer_withdrawal(ADM adm,User user,int cod,float value) {
        	if(value <= user.get_Bank_Balance_Client()){ 
                adm.setBalance_bank_adm(value);
                user.set_Bank_Balance_Client(value);
                /*Registra a Operação feita */
               adm.setRegister_adm("\r\nRetirada de dinheiro do cliente com o codigo '"+cod+"'\r\nCom o valor: "+value);
               System.out.println("Transacao Nao Aconselhada Feita Com Sucesso! GOOD LUCK!!");
            }else {
                System.out.println("O Valor Escolhido e Maior que o saldo do Usuario");
            }
    }
   
    public static void Cell_Recharge(User user,String number,float value,PrintWriter out){
        if(user.get_Bank_Balance_Client() > value){
        user.set_Bank_Balance_Client(value);
        out.println("<script>alert('Recarga Feita Com Sucesso!!')</script>");
         // Data_bank.setExtract("\r\nRecarga feita para o Numero:"+number+"\r\nCom o Valor: "+value);
               }else{
                out.println("<script>alert('Valor da Transação é Maior que o Valor Do Saldo!!')</script>");
               
       }
    }
        
        
}
