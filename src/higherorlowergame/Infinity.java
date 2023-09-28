/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;

/**
 *
 * @author nicho
 */
public class Infinity extends Difficulty
{
    public Infinity()
    {
        super.maxnum = 500;
        setAnswer();
    }
//--------------------------------------------------------------------------------------//
    @Override
    public void setGuess(int guess)
    {
        super.guesses = guess;
    }
//--------------------------------------------------------------------------------------//
    //This Method Sets A Random Number Between 1 and 200
    @Override
    public void setAnswer()
    {
        super.answer = rando.nextInt(1000) + 1;
    }
}
//-----------------------------------------------------------------<<<<<END OF FILE>>>>>-------------------------------------------------------------------------//
