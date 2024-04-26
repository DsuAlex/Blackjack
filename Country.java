import greenfoot.*;
/**
 * Write a description of class Country here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Country extends Actor 
{
    // instance variables - replace the example below with your own
   
    private GreenfootImage flag;

    /**
     * Constructor for objects of class Country
     */
    public Country(Background input)
    {
         flag = new GreenfootImage("Flag_of_"+input+".svg.png");
         
    }
}
