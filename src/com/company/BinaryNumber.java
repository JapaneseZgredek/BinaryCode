package com.company;

public class BinaryNumber {
    BinaryNumber(int number){
        this.number = number;
    }
    //--------------------------------------------
    private int number;
    public String binary;
    void setNumber(int number){
        this.number = number;
    }
    //--------------------------------------------
    int getNumber(){
        return this.number;
    }
    //--------------------------------------------
    void fromIntToBinary(){
        while(number>0){
            if(number%2==1){
                binary = binary + '1';
                number = (number-1)/2;
            }
            else {
                binary = binary + '0';
                number = number/2;
            }
        }
        System.out.println(binary);
        binary = reverseString(binary);
    }
    //--------------------------------------------
    String reverseString(String binary){
        StringBuilder sb = new StringBuilder(binary);
        sb.reverse();
        return sb.toString();
    }
}
