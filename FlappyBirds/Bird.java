import greenfoot.*;

/**
 * Write a description of class Bird here.
 * 
 * Lewis Haines (your name) 
 * 0.01 (a version number or a date)
 */
public class Bird extends Actor
{ 

double dy = 0.2;   
double g = 1.1;   
double BOOST_SPEED = -0.1;

public void act() 
    {


        setLocation( getX(), getY() + (int) dy);
      
       
      dy = ( dy + g ); 
     
      Greenfoot.isKeyDown("Space");
      setLocation( getX(), getY() - 8);
      if(Greenfoot.isKeyDown("Space")==true)
    {
       dy = BOOST_SPEED;   
       
    } 
    if(dy > 0.1){
    
      setRotation(-30);  
    }
    if(dy > -4){
        
        setRotation(0);
        }    
     if(dy > 15){
        
        setRotation(30);
        }        
        if(getY() > 400){
          
          gameover gameover = new gameover();
          getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
          Greenfoot.stop();
        }
          if(getY() < 0){
          
          gameover gameover = new gameover();
          getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
          Greenfoot.stop();
        }
    Actor bird;
    bird = getOneIntersectingObject(toppipe.class);
if(bird != null) {
   setRotation(30);
    gameover gameover = new gameover();
          getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
 
          
   Greenfoot.stop();
}

    bird = getOneIntersectingObject(bottompipe.class);
if(bird != null) {
   setRotation(180);
    gameover gameover = new gameover();
          getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
       

          
   Greenfoot.stop();
}
}
}



