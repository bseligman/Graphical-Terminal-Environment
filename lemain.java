// File For Main Loop

// Imports
import java.util.*;
import java.time.*;

// Main
public class lemain {
  public static void main(String[] args) {

    // Declare Screen
    Screen as = new Screen();
    as.DeclareMe();

    int pos = 0;
    // Main Loop
    while(true){
      as.printScr();

      // change at cords
      pos = pos + 1;
      as.CordChange('v', pos, 0);



      if (pos>20){
        pos = 0;
      }

      
      // Wait, for cpu sake
      try{
        System.out.print("\033[H\033[2J");
        Thread.sleep(100);
      } catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    } }

    
  }
}