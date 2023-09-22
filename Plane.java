import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int rotationSpeed = 2;
    public void act()
    {
        move(7);
        if (isAtEdge())
        {
            
            setRotation(getRotation() + 225);
            
        }
        else
        {
            turn(rotationSpeed);
        }// Add your action code here.
    }
}
