/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;

import java.util.Scanner;

/**
 *
 * @author nicho
 */
public class Custom extends Difficulty
{
    Scanner scanner = new Scanner(System.in);
    public Custom()
    {
        setGuess(super.guesses);
        setMaxNum();
        setAnswer();
        
    }
//--------------------------------------------------------------------------------------//
    @Override
    public void setGuess(int guess)
    {
        super.guesses = guess;
    }
//--------------------------------------------------------------------------------------//
    @Override
    public void setAnswer()
    {
        super.answer = rando.nextInt(super.maxnum) + 1;
    }
//--------------------------------------------------------------------------------------//
    public void setMaxNum()
    {
        super.maxnum = scanner.nextInt();
    }
}
//------------------------------------------------------------------------------<<<<END OF FILE>>>------------------------------------------------------------//