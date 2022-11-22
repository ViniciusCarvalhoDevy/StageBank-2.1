package br.com.login.model;

import java.util.HashMap;

public class test {
    
    public static void main(String[] args) {
      String [][] extracttStrings = new String[10][200]; 

        for(int i=0;i<10;i++){
            extracttStrings[1][i] = "usuario11111"; 
        }


    for(int i=0;i<10;i++){
        extracttStrings[2][i] = "usuario222222"; 
    }

    
int i=0;
    do{
        System.out.println(extracttStrings[1][i]);
        i++;
    }while(extracttStrings[1][i] != null);
       
    
           
        

    

}
}
