package com.company;
import java.util.Scanner;
public class exe1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your History Marks");
        int his1 = sc1.nextByte();
        System.out.println("Enter Your Computer Marks");
        int comp2 = sc1.nextByte();
        System.out.println("Enter Your Maths Marks");
        int maths3 = sc1.nextByte();
        System.out.println("Enter Your English Marks");
        int eng4 = sc1.nextByte();
        System.out.println("Enter Your Hindi Marks");
        int hindi5 = sc1.nextByte();
        int perc1 = his1+comp2+maths3+eng4+hindi5;
        int perc2 = perc1/5;
        System.out.println("Your Percentage is :"+perc2);
    }
}
