package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        BinaryNumber mainNumber = new BinaryNumber(n1);
        System.out.println(mainNumber.getNumber());
        mainNumber.fromIntToBinary();
        System.out.println(mainNumber.binary);
    }
}
