package com.ug11.loginregister;

import java.util.Scanner;

public class UsernameException extends Exception {
    public UsernameException(String user) {
    }

    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);
        System.out.println("Username: ");
        String username = in.nextLine();
    }

}
