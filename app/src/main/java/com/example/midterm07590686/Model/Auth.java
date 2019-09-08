package com.example.midterm07590686.Model;

public class Auth {

    private static final String user1 = "aaa";
    private static final String pass1 = "111";
    private static final String user2 = "bbb";
    private static final String pass2 = "222";
    private String nUser;
    private String nPassword;
    public boolean checkU1(){
        if(nUser.equals(user1)&&nPassword.equals(pass1)){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkU2(){
        if(nUser.equals(user2)&&nPassword.equals(pass2)){
            return true;
        }else{
            return false;
        }
    }

    public Auth(String nUser, String nPassword) {
        this.nUser = nUser;
        this.nPassword = nPassword;
    }
}
