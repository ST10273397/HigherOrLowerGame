/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package higherorlowergame;

/**
 *
 * @author nicho
 */
public class HigherOrLowerGame
{

    /**
     * @param args the command line arguments
     * In This Game You Will Be Asked To Guess A Number And Your Number Will Either Be Higher Or Lower Than The Answer or It Might Be The Answer.
     * There Are 5 Different Difficulty Settings, Each With An Increasing Difficulty Starting With Easy And Ending With Impossible.
     * Each Difficulty Have A Different Number Of Guesses And A Different Range of Numbers, With Easy Having 10 Guesses And A Range of 1 - 15 and Impossible With 1 Guess And A Range of 1 - 500
     */
    public static void main(String[] args)
    {
       GameUse play = new GameUse();
       play.Start();
    }
    
}
