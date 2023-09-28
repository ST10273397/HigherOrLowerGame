/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;


/**
 *
 * @author nicho
 */
public class Easy extends Difficulty
{
    public Easy()
    {
        super.guesses = 10;
        super.maxnum = 15;
        setAnswer();
    }
//--------------------------------------------------------------------------------------//
    @Override
    public void setGuess(int guess)
    {
        super.guesses = guess;
    }
//--------------------------------------------------------------------------------------//
    //This Method Sets A Random Number Between 1 and 15
    @Override
    public void setAnswer()
    {
        super.answer = rando.nextInt(15) + 1;
    }
}
//-----------------------------------------------------------------<<<<<END OF FILE>>>>>-------------------------------------------------------------------------//

