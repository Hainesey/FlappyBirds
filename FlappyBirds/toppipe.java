import greenfoot.*;

/**
 * Write a description of class toppipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toppipe extends Actor
{
  int point = 0;

    /**
     * Act - do whatever the toppipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-3);
         if(getX() == 100){
            
             point = point + 1;
        
             
        }
      }      
    }
 


            // System.out.println("───────────▄██████████████▄───────");
            //System.out.println("───────▄████░░░░░░░░█▀────█▄──────");
           //System.out.println("──────██░░░░░░░░░░░█▀──────█▄─────");
           //System.out.println("─────██░░░░░░░░░░░█▀────────█▄────");
           //System.out.println("───██░░░░░░░░░░░░░█──────██──██───");
           //System.out.println("──██░░░░░░░░░░░░░░█▄─────██──██───");
           // System.out.println("─████████████░░░░░░██────────██───");
           //System.out.println("██░░░░░░░░░░░██░░░░░█████████████─");
           //System.out.println("██░░░░░░░░░░░██░░░░█▓▓▓▓▓▓▓▓▓▓▓▓▓█");
           //System.out.println("██░░░░░░░░░░░██░░░█▓▓▓▓▓▓▓▓▓▓▓▓▓▓█");
           //System.out.println("─▀███████████▒▒▒▒█▓▓▓███████████▀─");
           //System.out.println("────██▒▒▒▒▒▒▒▒▒▒▒▒█▓▓▓▓▓▓▓▓▓▓▓▓█──");
           //System.out.println("─────██▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▓▓▓▓▓▓▓█──");
           //System.out.println("──────█████▒▒▒▒▒▒▒▒▒▒██████████───");
           //System.out.println("─────────▀███████████▀────────────");
            

