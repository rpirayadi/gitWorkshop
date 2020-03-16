package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x , n;
        Scanner scanner = new Scanner(System.in);
        x= scanner.nextInt();
        n= scanner.nextInt();
        if(n==0)
            System.out.println(20);
        else if(n==7)
            System.out.println(x);
        else{
            x= x-n;
            if(x<0)
                System.out.println(0);
            else
                System.out.println(x);
        }
        System.out.println("hi");
    }
}
