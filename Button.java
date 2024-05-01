import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World link;

    public Button(String image, World link)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2/3;
        int myNewWidth = (int)myImage.getWidth()/2/3;
        myImage.scale(myNewWidth, myNewHeight);
        this.link = link;
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(this.link);
        }
    }
}