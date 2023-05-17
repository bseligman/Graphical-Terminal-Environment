//2 File For Main Loop

// Imports
import java.util.*;
import java.time.*;

// Main
public class main {
  public static void main(String[] args) {

    // Declare Screen
    Screen as = new Screen();
    as.DeclareMe();
    int counter = 0;
    
    // Main Loop
    while(true){
    	//Print Current Graph
      as.printScr();
      // Draw Bounds
      //as.DrawLine('-', -20, 0, 20, 0);
      //as.DrawLine('|', 0, -20, 0, 20);
      
      // Example Slope (rotates)
      // Cords: (5,10) (10,15)
      int FirstLineX = 0;
      int FirstLineY = 0;
      int SecondLineX = 10;
      int SecondLineY = 15;
      as.DrawLine('*', FirstLineX, FirstLineY, SecondLineX, SecondLineY);
      as.CordChange('A', FirstLineX, FirstLineY);
      as.CordChange('B', SecondLineX, SecondLineY);
      
      // Another Example Slope
      FirstLineX = -20;
      FirstLineY = -5;
      SecondLineX = 40;
      SecondLineY = -17;
      as.DrawLine('*', FirstLineX, FirstLineY, SecondLineX, SecondLineY);
      as.CordChange('C', FirstLineX, FirstLineY);
      as.CordChange('D', SecondLineX, SecondLineY);
           
      // Center Test
      as.CordChange('O', 0,0);
      as.getCen();
            
      // Wait and clear frame
  		System.out.flush();
  		for(int clear = 0; clear < 0; clear++) {
  			System.out.println(" ");
  		}
      try{
    	System.out.print("\033[H\033[2J");
        Thread.sleep(100);
      } catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    } }

    
  }
}