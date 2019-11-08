package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {
        int count1,Total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問要從1加到多少");
        count1 = scanner.nextInt();
        for(;count1>0;count1--){
            Total+=count1;
        }
        System.out.println("總共"+Total);
    }

}
