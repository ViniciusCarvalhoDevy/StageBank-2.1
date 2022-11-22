package br.com.login.servace.bank;

import java.util.ArrayList;

public class Data_bank {
    public static ArrayList<String> Funcionario = new ArrayList<>();

public static ArrayList<String> Extract_All_Operation = new ArrayList<>();
    
    


   
   public static ArrayList<String> getExtract() {
        return Extract_All_Operation;
    }
    public static void setExtract(String extract) {
        Extract_All_Operation.add(extract);
     } 
   

}

