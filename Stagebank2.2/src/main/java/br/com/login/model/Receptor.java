package br.com.login.model;

public class Receptor {
    private String register;
    private static float bankBalance = 0;
    private String keyPix;
    
    public Receptor() {
        bankBalance =100;
    }
    public String getRegister_Recep() {
        return register;
    }
    public void setRegister_Recep(String register) {
        this.register = register;
    }
    public static float getBank_Balance_Recep() {
        return bankBalance;
    }
    public  static void setBank_Balance_Recep(float bankBalance1) {
        bankBalance += bankBalance1;
    }
    public String getKey_Pix_Recep() {
        return keyPix;
    }
    public void setKey_Pix_Recep(String keyPix) {
        this.keyPix = keyPix;
    }
}
