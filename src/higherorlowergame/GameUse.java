/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nicho
 */
public class GameUse
{
//Instantiating The Neccesary Variables And Objects

    Scanner scanner = new Scanner(System.in);
    String start;
    int playerans;
    String again;
//--------------------------------------------------------------------------------------//
//This Method Is The Start Of The Game And Asks Whether Or Not The Player Wants To Play

    public void Start()
    {
        System.out.println("WELCOME TO HIGHER OR LOWER! WANT TO PLAY? (Y/N)");
        start = scanner.next();
        while (!start.equalsIgnoreCase("Y") && !start.equalsIgnoreCase("N"))
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            start = scanner.next();
        }
        if (start.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            System.exit(0);
        }
        DifficultySetting();
    }
//--------------------------------------------------------------------------------------//
//This Method Prompts The Player What Difficulty They Want To Play

    public void DifficultySetting()
    {
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 20 Guesses, Numbers 1 - 50
                           (3) Hard - 30 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 40 Guesses, Numbers 1 - 200
                           (5) Impossible - 50 Guesses, Numbers 1 - 500
                           (6) Infinity - Unlimited Guesses, Numbers 1 -1000
                           """);
        while (true)
        {
            String menu = scanner.next();
            switch (menu)
            {
                case "1" ->
                    Easy();

                case "2" ->
                    Medium();

                case "3" ->
                    Hard();

                case "4" ->
                    ExtraHard();

                case "5" ->
                    Impossible();

                case "6" ->
                    Infinity();

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    continue;
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//
//This Method Is The Easy Option Where The Player Have 10 Guesses To Guess A Number Between 1 And 15

    public void Easy()
    {
        Easy easy = new Easy();
        easy.setAnswer();
        int guesses[] = new int[easy.getGuess()];

        for (int numGuesses = easy.getGuess(); numGuesses > 0; numGuesses--)
        {
            try
            {
                boolean validInput = false;
                while (!validInput)
                {
                    {
                        System.out.print("Enter your guess: ");
                        playerans = scanner.nextInt();
                        validInput = true;
                        guesses[easy.getGuess() - numGuesses] = playerans;
                        HigherOrLower(playerans, easy.getAnswer(), guesses);
                        System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
                    }
                }
            } catch (InputMismatchException e)
            {

                {
                    scanner.nextLine();
                    System.out.println("Please Enter A Valid Number");

                }
            }
        }
        Lost(easy.getAnswer(), guesses);
    }
//--------------------------------------------------------------------------------------//
//This Method Is The Medium Option Where The Player Have 7 Guesses To Guess A Number Between 1 And 50

    public void Medium()
    {
        Medium med = new Medium();
        med.setAnswer();
        int guesses[] = new int[med.getGuess()];
        for (int numGuesses = med.getGuess(); numGuesses > 0; numGuesses--)
        {
            try
            {
                boolean validInput = false;
                while (!validInput)
                {
                    {
                        System.out.print("Enter your guess: ");
                        playerans = scanner.nextInt();
                        validInput = true;
                        guesses[med.getGuess() - numGuesses] = playerans;
                        HigherOrLower(playerans, med.getAnswer(), guesses);
                        System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
                    }
                }
            } catch (InputMismatchException e)
            {
                {
                    scanner.nextLine();
                    System.out.println("Please Enter A Valid Number");

                }
            }
        }
        Lost(med.getAnswer(), guesses);
    }
//--------------------------------------------------------------------------------------//
//This Method Is The Hard Option Where The Player Have 5 Guesses To Guess A Number Between 1 And 100

    public void Hard()
    {
        Hard hard = new Hard();
        hard.setAnswer();
        int guesses[] = new int[hard.getGuess()];
        for (int numGuesses = hard.getGuess(); numGuesses > 0; numGuesses--)
        {
            try
            {
                boolean validInput = false;
                while (!validInput)
                {
                    {
                        System.out.print("Enter your guess: ");
                        playerans = scanner.nextInt();
                        validInput = true;
                        guesses[hard.getGuess() - numGuesses] = playerans;
                        HigherOrLower(playerans, hard.getAnswer(), guesses);
                        System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
                    }
                }
            } catch (InputMismatchException e)
            {

                {
                    scanner.nextLine();
                    System.out.println("Please Enter A Valid Number");

                }
            }
        }
        Lost(hard.getAnswer(), guesses);
    }
//--------------------------------------------------------------------------------------//
//This Method Is The Extra Hard Option Where The Player Have 3 Guesses To Guess A Number Between 1 And 200

    public void ExtraHard()
    {
        ExtraHard exhard = new ExtraHard();
        exhard.setAnswer();
        int guesses[] = new int[exhard.getGuess()];
        for (int numGuesses = exhard.getGuess(); numGuesses > 0; numGuesses--)
        {
            try
            {
                boolean validInput = false;
                while (!validInput)
                {
                    {
                        System.out.print("Enter your guess: ");
                        playerans = scanner.nextInt();
                        validInput = true;
                        guesses[exhard.getGuess() - numGuesses] = playerans;
                        HigherOrLower(playerans, exhard.getAnswer(), guesses);
                        System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
                    }
                }
            } catch (InputMismatchException e)
            {

                {
                    scanner.nextLine();
                    System.out.println("Please Enter A Valid Number");

                }
            }
        }
        Lost(exhard.getAnswer(), guesses);
    }
//--------------------------------------------------------------------------------------//
//This Method Is The Impossible Option Where The Player Have 1 Guess To Guess A Number Between 1 And 500

    public void Impossible()
    {
        Impossible imp = new Impossible();
        imp.setAnswer();
        int guesses[] = new int[imp.getGuess()];
        for (int numGuesses = imp.getGuess(); numGuesses > 0; numGuesses--)
        {
            try
            {
                boolean validInput = false;
                while (!validInput)
                {
                    {
                        System.out.print("Enter your guess: ");
                        playerans = scanner.nextInt();
                        validInput = true;
                        guesses[imp.getGuess() - numGuesses] = playerans;
                        HigherOrLower(playerans, imp.getAnswer(), guesses);
                        System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
                    }
                }
            } catch (InputMismatchException e)
            {

                {
                    scanner.nextLine();
                    System.out.println("Please Enter A Valid Number");

                }
            }
        }
        Lost(imp.getAnswer(), guesses);
    }
//--------------------------------------------------------------------------------------//
//This Method Determine Whether The Guess The Player Gives Is Either Higher, Lower Or Is The Answer

    public void HigherOrLower(int pans, int rans, int[] guesses)
    {
        if (pans > rans)
        {
            System.out.println("You Need To Guess Lower. Try Again.");
        } else
        {
            if (pans < rans)
            {
                System.out.println("You Need To Guess Higher. Try Again.");
            } else
            {
                System.out.println("Congratulations!!! You Won!! You Guessed Correctly!!");
                System.out.println("These Were Your Guesses ");
                for (int value : guesses)
                {
                    System.out.print(value + " ");
                }
                Again();
            }
        }
    }
//--------------------------------------------------------------------------------------//
//This Method Prompts The Player If They Want To Play Again

    public void Again()
    {
        System.out.println("Wanna Play Again? (Y/N)");
        again = scanner.next();
        while (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N"))
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            again = scanner.next();
        }
        if (again.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            System.exit(0);
        }
        DifficultySetting();
    }
//--------------------------------------------------------------------------------------//
// This Method Tells The User That They Lost    

    public void Lost(int ans, int guesses[])
    {
        System.out.println("Unfortunately, You Lost. Your Guesses were ");
        for (int value : guesses)
        {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("And The Answer Was " + ans);
        Again();
    }
//--------------------------------------------------------------------------------------//

    public void Infinity()
    {
        Infinity inf = new Infinity();
        inf.setAnswer();
        ArrayList<Integer> guesses = new ArrayList<>();
        boolean toQuit = false;
        int numGuesses = 0;
        System.out.println("To Quit Type 00");
        while (!toQuit)
        {
            System.out.print("Enter your guess: ");
            playerans = scanner.nextInt();
            guesses.add(playerans);
            numGuesses++;

            if (playerans == 0)
            {
                Lost(inf.getAnswer(), guesses);
                toQuit = true;
            } else
            {
                HigherOrLower(playerans, inf.getAnswer(), guesses);
                System.out.println("You used " + numGuesses + " Guesses!");
            }
        }
    }
//--------------------------------------------------------------------------------------//
//This Method Determine Whether The Guess The Player Gives Is Either Higher, Lower Or Is The Answer

    public void HigherOrLower(int pans, int rans, ArrayList guesses)
    {
        if (pans > rans)
        {
            System.out.println("You Need To Guess Lower. Try Again.");
        } else
        {
            if (pans < rans)
            {
                System.out.println("You Need To Guess Higher. Try Again.");
            } else
            {
                System.out.println("Congratulations!!! You Won!! You Guessed Correctly!!");
                System.out.println("These Were Your Guesses ");
                System.out.println(guesses.toString());
                Again();
            }
        }
    }
//--------------------------------------------------------------------------------------//
// This Method Tells The User That They Lost    

    public void Lost(int ans, ArrayList guesses)
    {
        System.out.println("Unfortunately, You Gave up. Your Guesses were ");
        System.out.println(guesses.toString());
        System.out.println();
        System.out.println("And The Answer Was " + ans);
        Again();
    }
}
//----------------------------------------------------------------<<<<END OF FILE>>>--------------------------------------------------------//
