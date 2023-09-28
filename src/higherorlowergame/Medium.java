/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;

/**
 *
 * @author nicho
 */
public class Medium extends Difficulty
{
    public Medium()
    {
        super.guesses = 20;
        super.maxnum = 50;
        setAnswer();
    }
//--------------------------------------------------------------------------------------//
    @Override
    public void setGuess(int guess)
    {
        super.guesses = guess;
    }
//--------------------------------------------------------------------------------------//
    //This Method Sets A Random Number Between 1 and 50
    @Override
    public void setAnswer()
    {
        super.answer = rando.nextInt(50) + 1;
    }
}
//-----------------------------------------------------------------<<<<<END OF FILE>>>>>-------------------------------------------------------------------------//
