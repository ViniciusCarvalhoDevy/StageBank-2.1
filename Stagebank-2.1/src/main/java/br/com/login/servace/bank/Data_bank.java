package br.com.login.servace.bank;

import java.util.ArrayList;

public class Data_bank {
    public static ArrayList<String> Extract = new ArrayList<>();
    public static ArrayList<String> Funcionario = new ArrayList<>();
    


   
    public static ArrayList<String> getExtract() {
        return Extract;
    }
    public static void setExtract(String extract) {
        Extract.add(extract);
    }

}

