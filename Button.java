import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World lnk;

    public Button(String image, World lnk)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2/3;
        int myNewWidth = (int)myImage.getWidth()/2/3;
        myImage.scale(myNewWidth, myNewHeight);
        this.lnk = lnk;
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(this.lnk);
        }
    }
}