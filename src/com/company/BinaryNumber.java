package com.company;

import java.util.Stack;

public class BinaryNumber {
    BinaryNumber(int number){
        this.number = number;
    }
    //--------------------------------------------
    private int number;
    Stack<String> binary = new Stack<>();
    public int[] fiveBitsInt = new int[5];
    public String[] fiveBitsString;
    int whichLetter=0;
    void setNumber(int number){
        this.number = number;
    }
    //--------------------------------------------
    int getNumber(){
        return this.number;
    }
    //--------------------------------------------
    void fromIntToBinary(){
        if(number%2==1){ // removing NULL from the binary by setting value
            binary.push("1");
            number = (number-1)/2;
        }
        else {
            binary.push("0");
            number = number/2;
        }
        while(number>0){ // Algorithm that converts from int to binary
            if(number%2==1){
                binary.push("1");
                number = (number-1)/2;
            }
            else {
                binary.push("0");
                number = number/2;
            }
        }
        while(binary.size()%5!=0) // Adding 0 till length of the binary can be divided by 5, cause one letter represents 5 bits
            binary.push("0");
    }
    //--------------------------------------------
    void convertFiveBitsFromStringToInt(){
        for(int i=0; i<5; i++){
            fiveBitsInt[i] = Integer.parseInt(binary.pop());
        }
    }
    int fromBinaryToInt(){
        int value = 0;
        for(int i=0; i<5; i++) {
            value = value + (int) (fiveBitsInt[i] * Math.pow(2,(4-i)));
        }
        return value;
    }
}
