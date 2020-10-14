package com.company;


import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

//        1=ROCK
//        2=PAPER
//        3=SCISSOR



        System.out.println("Hello This is a Rock-Paper-Scissor Game!");
        System.out.println("Please Enter \n 1 For Rock \n 2 For Paper \n 3 For Scissor");
        int computer_score = 0;
        int user_score = 0;

        int chances = 0;

        while (chances<10){
            int computer_guess = rd.nextInt(3);
            int user_guess = sc.nextInt();
            switch (user_guess){
                case 1 -> System.out.println("You Choose Rock");
                case 2 -> System.out.println("You Choose Paper");
                case 3 -> System.out.println("You Choose Scissor");
                default -> {
                    System.out.println("Opps Try Again");
                    continue;
                }
            }
            System.out.println("-----------------------------------------");
            switch (computer_guess) {
                case 1 -> System.out.println("Computer Choose Rock\n");
                case 2 -> System.out.println("Computer Choose Paper\n");
                case 3 -> System.out.println("Computer Choose Scissors\n");
            }

            if (user_guess == computer_guess) {
                System.out.println("Tie");
            } else if (user_guess == 1 && computer_guess == 2) {
                System.out.println("You Lose");
                computer_score += 1;
            } else if (user_guess == 3 && computer_guess == 2) {
                System.out.println("You Win");
                user_score += 1;
            } else if (user_guess == 2 && computer_guess == 1) {
                System.out.println("You Win");
                user_score += 1;
            } else if (user_guess == 3 && computer_guess == 1) {
                System.out.println("You Lose");
                computer_score += 1;
            } else if (user_guess == 1 && computer_guess == 3) {
                System.out.println("You Win !");
                user_score += 1;
            } else if (user_guess == 2 && computer_guess == 3) {
                System.out.println("You Lose !");
                computer_score += 1;
            }
            chances++;
            System.out.println(10 - chances + " Chances left\n");
            System.out.println("Computer score : " + computer_score);
            System.out.println("Your score : " + user_score);

            if(chances>9){
                System.out.println("Game Over");
                if(user_score>computer_score) {
                    System.out.print("You won By ");
                    System.out.print(user_score - computer_score);
                    System.out.print(" points ");
                    break;
                }

                else if(computer_score>user_score){
                    System.out.print("Computer Won By ");
                    System.out.print(computer_score-user_score);
                    System.out.print(" points ");
                    break;
                }
            }


























        }


    }
}
