package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        UserData user = new UserData();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите логин: ");
        user.setLoginLine(br.readLine());
        System.out.println("Введите пароль: ");
        user.setPasswordLine(br.readLine());

        System.out.println("Пользователь: ");
        System.out.println(user.getLoginLine());
        System.out.println(user.getHiddenPassword());
    }
}

class UserData {
    private String loginLine;
    private String passwordLine;

    public void setLoginLine (String login) {
        this.loginLine = login;
    }
    public void setPasswordLine (String password) {
        this.passwordLine = password;
    }
    public String getLoginLine () {
        return this.loginLine;
    }
    public String getPasswordLine () {
        return this.passwordLine;
    }
    public String getHiddenPassword () {
        String hidPass = "";
        for (int i = 0; i < passwordLine.length(); i++) {
            hidPass += "*";
        }
        return hidPass;
    }
}
