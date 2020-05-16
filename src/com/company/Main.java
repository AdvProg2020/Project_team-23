package com.company;

import com.company.view.CommandPro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        CommandPro.recognizeCommand(command);

    }
}
