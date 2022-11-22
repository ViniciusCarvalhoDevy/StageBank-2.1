package br.com.login.servace.bank;



public class card_digital {
    public static Boolean Validity_number_card(String number_card) {
        int tam = number_card.length();
        if(tam >=14){
           return true;
        }else   
            System.out.println("Numero de Cartão Invalido!");
            return false;
        }
        
        public static Boolean Validity_Cod_security_card(int validity_card) {
            int cont=0;
            while(validity_card !=0) { validity_card = validity_card/10; cont++; }
            if(cont ==3){
               return true;
            }else   
                System.out.println("Codigo de Seguranca Invalido!");
                return false;
                
            }
        
        
        public static Boolean Validity_data(String validity_Data_card) {
            int tam = validity_Data_card.length();
            if(tam == 6){
                return true;
            }else  
                System.out.println("Data de Validade Invalida!");
                return false;
        
        }
        public static Boolean Validity_All(String number_card,String validity_Data_card,int validity_card){
           Boolean a = Validity_number_card(number_card);
           Boolean c =Validity_data(validity_Data_card);
           Boolean d =Validity_Cod_security_card(validity_card);
            if(a && c && d){
                return true;
            }else
                return false;


        }
       
}
