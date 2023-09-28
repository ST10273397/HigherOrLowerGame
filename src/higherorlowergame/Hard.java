/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;

/**
 *
 * @author nicho
 */
public class Hard extends Difficulty
{
    public Hard()
    {
        super.guesses = 7;
        super.maxnum = 100;
        setAnswer();
    }
//--------------------------------------------------------------------------------------//
    @Override
    public void setGuess(int guess)
    {
        super.guesses = guess;
    }
//--------------------------------------------------------------------------------------//
    //This Method Sets A Random Number Between 1 and 100
    @Override
    public void setAnswer()
    {
        super.answer = rando.nextInt(100) + 1;
    }
}
//-----------------------------------------------------------------<<<<<END OF FILE>>>>>-------------------------------------------------------------------------//
