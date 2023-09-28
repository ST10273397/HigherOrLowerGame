/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;

/**
 *
 * @author nicho
 */
public class ExtraHard extends Difficulty
{
    public ExtraHard()
    {
        super.guesses = 5;
        super.maxnum = 200;
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
        super.answer = rando.nextInt(200) + 1;
    }
}
//-----------------------------------------------------------------<<<<<END OF FILE>>>>>-------------------------------------------------------------------------//

