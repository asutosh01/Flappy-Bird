import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pipe2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pipe2 extends Actor
{
    /**
     * Act - do whatever the pipe2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        setLocation(getX() + Pipe.ps, getY());
    }    
}
