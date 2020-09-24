Scanner sc = new Scanner(System.in);
        Random r = new Random();


        System.out.println("This is Rock Paper Scissor Game");
        System.out.println("Enter 1 for Rock\n2 for Paper\n3 for Scissor\n");
        int chances = 0;
        int user_guess, computer_guess;
        computer_guess = r.nextInt(3);
        int computer_score = 0;
        int user_score = 0;

        while (chances < 5) {
            System.out.print("Enter Your choice:");
            user_guess = sc.nextInt();
            chances += 1;

//1=rock
//2=paper
//3=scissors


            switch (user_guess) {
                case 1 -> System.out.println("You Choose Rock");
                case 2 -> System.out.println("You Choose Paper");
                case 3 -> System.out.println("You Choose Scissors");
                default -> {
                    System.out.println("Opps!Try Again!!");
                    return;
                }
            }
            System.out.println("----------------------------------------------------------");
            switch (computer_guess) {
                case 1 -> System.out.println("Computer Choose Rock\n");
                case 2 -> System.out.println("Computer Choose Paper\n");
                case 3 -> System.out.println("Computer Choose Scissors\n");
            }
            System.out.println("Computer Score is ");

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
            System.out.println(5 - chances + " Chances left\n");
            System.out.println("Computer score : " + computer_score);
            System.out.println("Your score : " + user_score);
        }

        if (computer_score > user_score) {
            System.out.print("Computer Won By ");
            System.out.print(computer_score-user_score);
            System.out.print(" points\n");
        } else if (computer_score < user_score) {
            System.out.print("You Won By ");
            System.out.print(user_score - computer_score);
            System.out.print(" points\n");
        }
        else if(computer_score==user_score){
            System.out.println("Ohh Tie!!\n");
        }
