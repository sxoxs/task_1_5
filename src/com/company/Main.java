package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        UserData user1 = new UserData();
        user1.outInConsoleUserLogin();
        user1.outConsoleUserPasword();
    }

    public static String inConsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}

class UserData {
    private String loginLine, paswordLine;
    public  UserData () throws IOException {
        getUserData();
    }

    private void getUserData () throws IOException{
        System.out.println("Введите логин: ");
        loginLine = Main.inConsole().trim();
        System.out.println("Введите пароль: ");
        paswordLine = Main.inConsole().trim();
    }

    public void outInConsoleUserLogin () {
        System.out.println("\n" + loginLine);
    }

    public void outConsoleUserPasword () {
        for (int i = 0; i < paswordLine.length(); i++) {
            System.out.print("*");
        }
    }
}
