package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter tedade daneshamoozan : ");
        int n=sc.nextInt();
        double sum=0;
        double temp;
        double ave=0;
        for(int i=1; i<=n; i++){
            System.out.print("Student " +i + " : ");
            temp=sc.nextDouble();
            sum+=temp;
        }
        ave=sum/n;
        System.out.println("Average is : " + ave);

    }
}
