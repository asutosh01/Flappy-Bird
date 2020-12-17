import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameclass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameclass extends Actor
{
    /**
     * Act - do whatever the gameclass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int t = 0;
    
    public static int score = 0;
    
    public void act() 
    {
        World f=(World)getWorld();
        
        
     
        
        if(t==100){
            
           Pipe p= new Pipe(); 
           
           getWorld().addObject(p, 547,476-Greenfoot.getRandomNumber((p.getImage().getHeight()/2)-60));
           
           
            
           pipe2 p2= new pipe2();  
            
           getWorld().addObject(p2, 547,p.getY()-500);
           
           t=0;
           
        }
        
        
        
        t++;
        
        if(Greenfoot.isKeyDown("space")){
           flapy_world fw=new flapy_world();
           fw.getObjects(Actor.class).clear();
            
        }
    }    
}
