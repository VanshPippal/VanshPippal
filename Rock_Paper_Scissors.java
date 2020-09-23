package com.company;
import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int user_guess,computer_guess;

        computer_guess = r.nextInt(3);
        System.out.println("This is Rock Paper Scissor Game");
        System.out.println("Enter 1 for Rock\n2 for Paper\n3 for Scissor\n");
        System.out.print("Enter Your choice:");
        user_guess = sc.nextInt();
//1=rock
//2=paper
//3=scissors



        switch (user_guess) {
            case 1 -> System.out.println("You Choose Rock");
            case 2 -> System.out.println("You Choose Paper");
            case 3 -> System.out.println("You Choose Scissors");
            default -> System.out.println("Opps!Try Again!!");
        }
        switch (computer_guess) {
            case 1 -> System.out.println("Computer Choose Rock");
            case 2 -> System.out.println("Computer Choose Paper");
            case 3 -> System.out.println("Computer Choose Scissors");
        }

        if(user_guess==computer_guess) {
            System.out.println("Tie");
        }


        else if(user_guess==1 && computer_guess==2) {
            System.out.println("You Lose");
        }
        else if(user_guess==3 && computer_guess==2){
            System.out.println("You Win");
        }

        else if(user_guess==2 && computer_guess==1){
            System.out.println("You Win");
        }
        else if(user_guess==3 && computer_guess==1){
            System.out.println("You Lose");
        }
        else if(user_guess==1 && computer_guess==3){
            System.out.println("You Win !");
        }
        else if(user_guess==2 && computer_guess==3){
            System.out.println("You Lose !");
        }
    }
}

