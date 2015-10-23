import greenfoot.*;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

   public static int point = 0;
    
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600 , 400, 1, false); 
        
       

        
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Bird Bird = new Bird();

        addObject (Bird, 100, getHeight()/2);
        toppipe toppipe = new toppipe();
        addObject(toppipe, 488, 3);
        bottompipe bottompipe = new bottompipe();
        addObject(bottompipe, 498, 396);
        toppipe.setLocation(496, 4);


        
    }
    int pipeTimer = Greenfoot.getRandomNumber(2000)+1000;
    long lastAdded = System.currentTimeMillis();
    public void act()
    {   
    pipeSpawn();
    
    
}

public void pipeSpawn() {
    
        long curTime  = System.currentTimeMillis();
       if (curTime >= lastAdded + pipeTimer) 
    {
        int y = Greenfoot.getRandomNumber(150)-100;
        addObject(new toppipe(),getWidth(),y);
        addObject(new bottompipe(),getWidth(),y+400);
     
        
        lastAdded  = curTime;

       
        
    }
    
}

public void removePipe() {
    
    if(point = point + 1) {
        removeObject(toppipe, bottompipe);
    }
}
}

 





