import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flapy_world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flapy_world extends World
{

    /**
     * Constructor for objects of class flapy_world.
     * 
     */
    public flapy_world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FlappyBird flappyBird = new FlappyBird();
        addObject(flappyBird,258,78);
        Pipe pipe = new Pipe();
        addObject(pipe,535,329);
        pipe.setLocation(529,274);

        pipe.setLocation(593,152);
        pipe.setLocation(573,325);
        pipe2 pipe2 = new pipe2();
        addObject(pipe2,405,143);
        pipe2.setLocation(457,78);
        pipe2.setLocation(511,102);
        pipe2.setLocation(522,108);
        pipe2.setLocation(504,107);
        pipe2.setLocation(509,108);
        pipe.setLocation(496,186);
        pipe.setLocation(547,476);
        pipe2.setLocation(473,101);
        removeObject(pipe2);
        removeObject(pipe);
        gameclass gameclass = new gameclass();
        addObject(gameclass,367,383);
    }
}
