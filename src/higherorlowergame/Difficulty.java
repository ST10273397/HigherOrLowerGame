/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higherorlowergame;
import java.util.Random;

/**
 *
 * @author nicho
 */
public abstract class Difficulty
{
    int guesses;
    int answer;
    int maxnum;
    Random rando = new Random();
//------------------------------------------------------------------------------------------------------------------------------------------//
    public Difficulty()
    {
    }
//------------------------------------------------------------------------------------------------------------------------------------------//
    public int getGuess()
    {
        return this.guesses;
    }
//------------------------------------------------------------------------------------------------------------------------------------------//
    public abstract void setGuess(int guess);
//------------------------------------------------------------------------------------------------------------------------------------------//
    public int getAnswer()
    {
        return this.answer;
    }
//------------------------------------------------------------------------------------------------------------------------------------------//
    public abstract void setAnswer();
//------------------------------------------------------------------------------------------------------------------------------------------//
    public int getMaxNum()
    {
        return this.maxnum;
    }
}
//-----------------------------------------------------------------<<<<<END OF FILE>>>>>-------------------------------------------------------------------------//
