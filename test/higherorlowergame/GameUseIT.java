/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package higherorlowergame;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicho
 */
public class GameUseIT
{

    public GameUseIT()
    {
    }

    /**
     * This Test Tests If the Yes Option Works
     */
    @Test
    public void testStart_Yes()
    {
        System.out.println();
        System.out.println("Test Start - Yes");
        System.out.println("WELCOME TO HIGHER OR LOWER! WANT TO PLAY? (Y/N)");
        String start = "Y";
        if (!start.equalsIgnoreCase("Y") && !start.equalsIgnoreCase("N")) //While would be used for actual Program
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            // start = scanner.next(); Would Prompt The User To Re-Enter The Response
        }
        if (start.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            System.exit(0);
        }
        //DifficultySetting(); The Method would then continue to the next method linked
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If the No Option Works
     */

    @Test
    public void testStart_No()
    {
        System.out.println();
        System.out.println("Test Start - No");
        System.out.println("WELCOME TO HIGHER OR LOWER! WANT TO PLAY? (Y/N)");
        String start = "N";
        if (!start.equalsIgnoreCase("Y") && !start.equalsIgnoreCase("N")) //While would be used for actual Program
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            // start = scanner.next(); Would Prompt The User To Re-Enter The Response
        }
        if (start.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            //System.exit(0); Program Would Close After
        }
        //DifficultySetting(); The Method would then continue to the next method linked
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If An Invalid Option Would Work
     */
    @Test
    public void testStart_InvalidOption()
    {
        System.out.println();
        System.out.println("Test Start - Invalid Option");
        System.out.println("WELCOME TO HIGHER OR LOWER! WANT TO PLAY? (Y/N)");
        String start = "Sure";
        if (!start.equalsIgnoreCase("Y") && !start.equalsIgnoreCase("N")) //While would be used for actual Program
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            // start = scanner.next(); Would Prompt The User To Re-Enter The Response
        }
        if (start.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            //System.exit(0); Program Would Close After
        }
        //DifficultySetting(); The Method would then continue to the next method linked
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If The Easy Option Works
     */
    @Test
    public void testDifficultySetting_Easy()
    {
        System.out.println();
        System.out.println("Test Difficulty Setting - Easy");
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 7 Guesses, Numbers 1 - 50
                           (3) Hard - 5 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 3 Guesses, Numbers 1 - 200
                           (5) Impossible - 1 Guess, Numbers 1 - 500
                           """);
        //while (true) This Would Be Active In The Program
        {
            String menu = "1";
            switch (menu)
            {
                case "1" ->
                    //Easy(); Would Go To The Next Method
                    System.out.println("Going To Easy Difficulty");

                case "2" ->
                    //Medium(); Would Go To The Next Method
                    System.out.println("Going To Medium Difficulty");

                case "3" ->
                    //Hard(); Would Go To The Next Method
                    System.out.println("Going To Hard Difficulty");

                case "4" ->
                    //ExtraHard(); Would Go To The Next Method
                    System.out.println("Going To Extra Hard Difficulty");

                case "5" ->
                    //Impossible(); Would Go To The Next Method
                    System.out.println("Going To Impossible Difficulty");

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    //continue; Would Loop Back To The Switch
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If The Medium Option Works
     */
    @Test
    public void testDifficultySetting_Medium()
    {
        System.out.println();
        System.out.println("Test Difficulty Setting - Medium");
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 7 Guesses, Numbers 1 - 50
                           (3) Hard - 5 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 3 Guesses, Numbers 1 - 200
                           (5) Impossible - 1 Guess, Numbers 1 - 500
                           """);
        //while (true) Would Be Active in The Program
        {
            String menu = "2";
            switch (menu)
            {
                case "1" ->
                    //Easy(); Would Go To The Next Method
                    System.out.println("Going To Easy Difficulty");

                case "2" ->
                    //Medium(); Would Go To The Next Method
                    System.out.println("Going To Medium Difficulty");

                case "3" ->
                    //Hard(); Would Go To The Next Method
                    System.out.println("Going To Hard Difficulty");

                case "4" ->
                    //ExtraHard(); Would Go To The Next Method
                    System.out.println("Going To Extra Hard Difficulty");

                case "5" ->
                    //Impossible(); Would Go To The Next Method
                    System.out.println("Going To Impossible Difficulty");

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    //continue; Would Loop Back To The Switch
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If The Hard Option Works
     */
    @Test
    public void testDifficultySetting_Hard()
    {
        System.out.println();
        System.out.println("Test Difficulty Setting - Hard");
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 7 Guesses, Numbers 1 - 50
                           (3) Hard - 5 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 3 Guesses, Numbers 1 - 200
                           (5) Impossible - 1 Guess, Numbers 1 - 500
                           """);
        //while (true) Would Be Active in The Program
        {
            String menu = "3";
            switch (menu)
            {
                case "1" ->
                    //Easy(); Would Go To The Next Method
                    System.out.println("Going To Easy Difficulty");

                case "2" ->
                    //Medium(); Would Go To The Next Method
                    System.out.println("Going To Medium Difficulty");

                case "3" ->
                    //Hard(); Would Go To The Next Method
                    System.out.println("Going To Hard Difficulty");

                case "4" ->
                    //ExtraHard(); Would Go To The Next Method
                    System.out.println("Going To Extra Hard Difficulty");

                case "5" ->
                    //Impossible(); Would Go To The Next Method
                    System.out.println("Going To Impossible Difficulty");

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    //continue; Would Loop Back To The Switch
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If The Extar Hard Option Works
     */
    @Test
    public void testDifficultySetting_ExtraHard()
    {
        System.out.println();
        System.out.println("Test Difficulty Setting - Extra Hard");
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 7 Guesses, Numbers 1 - 50
                           (3) Hard - 5 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 3 Guesses, Numbers 1 - 200
                           (5) Impossible - 1 Guess, Numbers 1 - 500
                           """);
        //while (true) Would Be Active in The Program
        {
            String menu = "4";
            switch (menu)
            {
                case "1" ->
                    //Easy(); Would Go To The Next Method
                    System.out.println("Going To Easy Difficulty");

                case "2" ->
                    //Medium(); Would Go To The Next Method
                    System.out.println("Going To Medium Difficulty");

                case "3" ->
                    //Hard(); Would Go To The Next Method
                    System.out.println("Going To Hard Difficulty");

                case "4" ->
                    //ExtraHard(); Would Go To The Next Method
                    System.out.println("Going To Extra Hard Difficulty");

                case "5" ->
                    //Impossible(); Would Go To The Next Method
                    System.out.println("Going To Impossible Difficulty");

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    //continue; Would Loop Back To The Switch
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If The Impossible Option Works
     */
    @Test
    public void testDifficultySetting_Impossible()
    {
        System.out.println();
        System.out.println("Test Difficulty Setting - Impossible");
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 7 Guesses, Numbers 1 - 50
                           (3) Hard - 5 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 3 Guesses, Numbers 1 - 200
                           (5) Impossible - 1 Guess, Numbers 1 - 500
                           """);
        //while (true) Would Be Active in The Program
        {
            String menu = "5";
            switch (menu)
            {
                case "1" ->
                    //Easy(); Would Go To The Next Method
                    System.out.println("Going To Easy Difficulty");

                case "2" ->
                    //Medium(); Would Go To The Next Method
                    System.out.println("Going To Medium Difficulty");

                case "3" ->
                    //Hard(); Would Go To The Next Method
                    System.out.println("Going To Hard Difficulty");

                case "4" ->
                    //ExtraHard(); Would Go To The Next Method
                    System.out.println("Going To Extra Hard Difficulty");

                case "5" ->
                    //Impossible(); Would Go To The Next Method
                    System.out.println("Going To Impossible Difficulty");

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    //continue; Would Loop Back To The Switch
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Test Tests If The Invalid Option Would Work
     */
    @Test
    public void testDifficultySetting_InvalidOption()
    {
        System.out.println();
        System.out.println("Test Difficulty Setting - Invalid Option");
        System.out.println("SELECT YOUR DIFFICULTY");
        System.out.println("***************************************************");
        System.out.println(""" 
                           (1) Easy - 10 Guesses, Numbers 1 - 15
                           (2) Medium - 7 Guesses, Numbers 1 - 50
                           (3) Hard - 5 Guesses, Numbers 1 - 100
                           (4) Extra Hard - 3 Guesses, Numbers 1 - 200
                           (5) Impossible - 1 Guess, Numbers 1 - 500
                           """);
        //while (true) Would Be Active in The Program
        {
            String menu = "Easy";
            switch (menu)
            {
                case "1" ->
                    //Easy(); Would Go To The Next Method
                    System.out.println("Going To Easy Difficulty");

                case "2" ->
                    //Medium(); Would Go To The Next Method
                    System.out.println("Going To Medium Difficulty");

                case "3" ->
                    //Hard(); Would Go To The Next Method
                    System.out.println("Going To Hard Difficulty");

                case "4" ->
                    //ExtraHard(); Would Go To The Next Method
                    System.out.println("Going To Extra Hard Difficulty");

                case "5" ->
                    //Impossible(); Would Go To The Next Method
                    System.out.println("Going To Impossible Difficulty");

                default ->
                {
                    System.out.println("Please enter a number displayed");
                    //continue; Would Loop Back To The Switch
                }
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would See If The Easy Game Play Would Work
     */
    @Test
    public void testEasy()
    {
        System.out.println();
        System.out.println("Test Easy");
        Easy easy = new Easy();
        easy.setAnswer();
        int guesses[] = new int[easy.getGuess()];
        for (int numGuesses = easy.getGuess(); numGuesses > 0; numGuesses--)
        {
            System.out.print("Enter your guess: ");
            int playerans = 1;
            guesses[easy.getGuess() - numGuesses] = playerans;
            //HigherOrLower(playerans, easy.getAnswer(), guesses); This Method Would Determine If The Guess The Player Gave Is Higher Or Lower
            System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
        }
        //Lost(); This Method Would Tell Them The Player Has Lost
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would See If The Medium Game Play Would Work
     */
    @Test
    public void testMedium()
    {
        System.out.println();
        System.out.println("Test Medium");
        Medium med = new Medium();
        med.setAnswer();
        int guesses[] = new int[med.getGuess()];
        for (int numGuesses = med.getGuess(); numGuesses > 0; numGuesses--)
        {
            System.out.print("Enter your guess: ");
            int playerans = 2;
            guesses[med.getGuess() - numGuesses] = playerans;
            //HigherOrLower(playerans, med.getAnswer(), guesses); This Method Would Determine If The Guess Is Higher Or Lower Than The Answer
            System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
        }
        //Lost(); This Method Would Tell Them The Player Has Lost
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would See If The Hard Game Play Would Work
     */
    @Test
    public void testHard()
    {
        System.out.println();
        System.out.println("Test Hard");
        Hard hard = new Hard();
        hard.setAnswer();
        int guesses[] = new int[hard.getGuess()];
        for (int numGuesses = hard.getGuess(); numGuesses > 0; numGuesses--)
        {
            System.out.print("Enter your guess: ");
            int playerans = 3;
            guesses[hard.getGuess() - numGuesses] = playerans;
            //HigherOrLower(playerans, hard.getAnswer(), guesses); This Method Would Determine If The Guess Is Higher Or Lower Than The Answer
            System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
        }
        //Lost(); This Method Would Tell Them The Player Has Lost
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would See If The Extra Hard Game Play Would Work
     */
    @Test
    public void testExtraHard()
    {
        System.out.println();
        System.out.println("Test Extra Hard");
        ExtraHard exhard = new ExtraHard();
        exhard.setAnswer();
        int guesses[] = new int[exhard.getGuess()];
        for (int numGuesses = exhard.getGuess(); numGuesses > 0; numGuesses--)
        {
            System.out.print("Enter your guess: ");
            int playerans = 4;
            guesses[exhard.getGuess() - numGuesses] = playerans;
            //HigherOrLower(playerans, exhard.getAnswer(), guesses); This Method Would Determine If The Guess Is Higher Or Lower Than The Answer
            System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
        }
        //Lost(); This Method Would Tell Them The Player Has Lost
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would See If The Impossible Game Play Would Work
     */
    @Test
    public void testImpossible()
    {
        System.out.println();
        System.out.println("Test Impossible");
        Impossible imp = new Impossible();
        imp.setAnswer();
        int guesses[] = new int[imp.getGuess()];
        for (int numGuesses = imp.getGuess(); numGuesses > 0; numGuesses--)
        {
            System.out.print("Enter your guess: ");
            int playerans = 5;
            guesses[imp.getGuess() - numGuesses] = playerans;
            //HigherOrLower(playerans, imp.getAnswer(), guesses); This Method Would Determine If The Guess Is Higher Or Lower Than The Answer
            System.out.println("You have " + (numGuesses - 1) + " Guesses left!");
        }
        //Lost(); This Method Would Tell Them The Player Has Lost
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would Test To See If The Number That The Player Guessed Is
     * Higher Than The Answer
     */
    @Test
    public void testHigherOrLower_Higher()
    {
        System.out.println();
        System.out.println("Test Higher Or Lower - Higher");
        int pans = 52;
        int rans = 108;
        int guesses[] =
        {
            0, 0, 0, 0, 0
        };
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
                //Again(); This Method Would Ask The Player If They Want To Play Again
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would Test To See If The Number That The Player Guessed Is
     * Lower Than The Answer
     */
    @Test
    public void testHigherOrLower_Lower()
    {
        System.out.println();
        System.out.println("Test Higher Or Lower - Lower");
        int pans = 108;
        int rans = 52;
        int guesses[] =
        {
            0, 0, 0, 0, 0
        };
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
                //Again(); This Method Would Ask The Player If They Want To Play Again
            }
        }
    }
//--------------------------------------------------------------------------------------//    

    /**
     * This Method Would Test To See If The Number That The Player Guessed Is
     * The Answer
     */
    @Test
    public void testHigherOrLower_Won()
    {
        System.out.println();
        System.out.println("Test Higher Or Lower - Won");
        int pans = 52;
        int rans = 52;
        int guesses[] =
        {
            0, 0, 0, 0, 0
        };
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
                //Again(); This Method Would Ask The Player If They Want To Play Again
            }
        }
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would Test To See If Yes Option Would Work
     */
    @Test
    public void testAgain_Yes()
    {
        System.out.println();
        System.out.println("Test Again - Yes");
        System.out.println("Wanna Play Again? (Y/N)");
        String again = "Y";
        while (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N"))
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            //again = scanner.next(); Not Needed For This Test
        }
        if (again.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            System.exit(0);
        }
        //DifficultySetting(); If Yes, The Player Would Go To The Difficulty Setting Again
        System.out.println("Going To Play Again");
    }
//--------------------------------------------------------------------------------------//    

    /**
     * This Method Would Test To See If No Option Would Work
     */
    @Test
    public void testAgain_No()
    {
        System.out.println();
        System.out.println("Test Again - Yes");
        System.out.println("Wanna Play Again? (Y/N)");
        String again = "N";
        while (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N"))
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            //again = scanner.next(); Not Needed For This Test
        }
        if (again.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            //System.exit(0); This Would Close The Method
        }
        //DifficultySetting(); If Yes, The Player Would Go To The Difficulty Setting Again
    }
//--------------------------------------------------------------------------------------//

    /**
     * This Method Would Test To See If The Invalid Option Would Work
     */
    @Test
    public void testAgain_InvalidAnswer()
    {
        System.out.println();
        System.out.println("Test Again - Yes");
        System.out.println("Wanna Play Again? (Y/N)");
        String again = "yes";
        if (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N")) // While Would Be Used In The Program
        {
            System.out.println("Please Enter either Y for Yes or N for No");
            //again = scanner.next(); This Would Prompt The User For An Acceptable
        }
        if (again.equalsIgnoreCase("N"))
        {
            System.out.println("OK! COME AGAIN! BYE BYE!!");
            System.exit(0);
        }
        //DifficultySetting(); If Yes, The Player Would Go To The Difficulty Setting Again
    }
//--------------------------------------------------------------------------------------//
    public void testLost()
    {
        int ans = 51;
        int guesses[] = {0,0,0,0,0};
        System.out.println("Unfortunately, You Lost. Your Guesses were ");
        for (int value : guesses)
        {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("And The Answer Was " + ans);
        //Again(); This Method Would Ask The Player If They Want To Play Again
    }
}
//----------------------------------------------------------------<<<<END OF FILE>>>--------------------------------------------------------//
