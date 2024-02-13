package com.example.thymeleafformdemo;
import java.io.Serializable;

public class SignUpPOJO {
    private String uname;
    private String password;
    private String emailAddress;

    public SignUpPOJO() {
    }

    public SignUpPOJO( String uname, String password, String emailAddress) {
        this.uname=uname;
        this.password=password;
        this.emailAddress=emailAddress;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }
}
