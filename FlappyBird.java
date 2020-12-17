import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public double ki=0;
    public double b=0.7;
    public double BOAST_SPEED=-4;
    public int k = 0;
    public void act() 
    {
        setLocation(getX(),(int)(getY()+ki));
        
        
        if(getOneIntersectingObject(Pipe.class)!=null){
                      GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();  
            
            
            
        }
        if(getOneIntersectingObject(pipe2.class)!=null){
                      GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();  
            
            
            
        }
        
        if(k<60){ k=k+5;}
                  setRotation(k);
        if(Greenfoot.isKeyDown("up")){
       
          
        ki = BOAST_SPEED;
            k=-20;
        
        
        
       
            
        }
        if(getY()>getWorld().getHeight()){
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
            
        }

        gravityfab();
        ki=ki+b;
    }
    
    public void gravityfab(){
   
        
    }
}
