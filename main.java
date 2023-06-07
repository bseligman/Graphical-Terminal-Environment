//2 File For Main Loop

// Imports
import java.util.*;
import java.io.IOException;
import java.time.*;

// Main
public class main {
  public static void main(String[] args) {

    // Declare Screen
    Screen as = new Screen();
    as.DeclareMe();
    
    // Main Loop

      
    // Declaration, to make everything work aaaaaa  
    as.DeclareMe();
    
    // Example Line
    int cordA_X = -15;
    int cordA_Y = 2;
    int cordB_X = 19;
    int cordB_Y = 18;
    as.DrawLine('|', cordA_X,cordA_Y,cordB_X,cordB_Y);
    as.CordChange('A', cordA_X, cordA_Y);
    as.CordChange('B', cordB_X, cordB_Y);
    
    // Example Center
    as.CordChange('C', 0, 0);

      
    //Print Current Graph
     as.printScr();
      
      // Center Test
      //as.getCen();
            
      // Wait and clear frame
      /*

    	
      try{
        Thread.sleep(1);
      } catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    } 
*/
  }

}