package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        BinaryNumber mainNumber = new BinaryNumber(n1);
        System.out.println(mainNumber.getNumber());
        mainNumber.fromIntToBinary();
        int size = mainNumber.binary.size()/5;
        int addingNumber;
        char letter;
        System.out.println(size);
        for(int j=0; j<size; j++){
            mainNumber.convertFiveBitsFromStringToInt();
            addingNumber = mainNumber.fromBinaryToInt();
            letter = (char)(64+addingNumber);
            System.out.print(letter);
        }

    }
}
