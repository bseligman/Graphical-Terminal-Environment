// File For The Screen Class
import java.lang.Math.*;

//Ben's note:
// You need to add screen size detection to have a constant size!
public class Screen {
	int sizeX = 200;
	int sizeY = 200;
	int lastquad;
	
  private char[][] m_screen = new char[sizeX][sizeY];
  public void DeclareMe(){
    for(int b = 0; b < sizeX; b++){
      for(int i = 0; i < sizeY; i ++){
          m_screen[b][i] = ' ';
        }      
      }
  }

  // Update at cords given Method
  public void CordChange(char newV, int posX, int posY){
		//Quad 1 (+,+)
		if(posX>=0 && posY>=0) {
		    m_screen[(sizeX/2)-posY][(sizeY/2)-posX] = newV;
		    lastquad=1;
		}
		//Quad 2 (-,+)
		else if(posX<=0 && posY>=0) {
		    m_screen[(sizeX/2)-posY][(sizeY/2)+posX] = newV;
		    lastquad=2;
		}
		//Quad 3 (-,-)
		else if(posX<=0 && posY<=0) {
		    m_screen[(sizeX/2)-posY][(sizeY/2)+posX] = newV;
		    lastquad=3;
		}
		//Quad 4 (+,-)
		else if(posX>=0 && posY<=0) {
		    m_screen[(sizeX/2)-posY][(sizeY/2)+posX] = newV;
		    lastquad=4;
		}

		else {
			System.out.println(""+ posX + "," + posY + " is not valid!");
		}

  }

  // Print Screen Method
  public void printScr(){
    for(int b = 0; b < sizeX; b++){
      for(int i = 0; i < sizeY; i ++){
          System.out.print(m_screen[b][i]);
        }      
        System.out.println("");
    }
  }
  
  // Get Fake Center Point
  public void getCen() {
      System.out.print("Center: " + (sizeX/2) + "," + (sizeY/2));
  }

  // Draw Line
  public void DrawLine(char newV, int a_X, int a_Y, int b_X, int b_Y){
	  // distance formula	  
	  double distance = Math.sqrt((Math.pow((double)b_Y-(double)a_Y,2)+(Math.pow((double)b_X-(double)a_X,2))));
	  // slope formula
	  double slope = ( (double) b_Y - (double)a_Y)/((double)b_X-(double)a_X);
	  
	  // fix for rounding to 0 
	  System.out.println(distance);
	  System.out.println(slope);
	  //fix?
	  // drawing line
		  for(double i = 0.0; i < distance; i++) {
			  this.CordChange(newV, (int)(a_X+i), (int)(a_Y+(i*slope)));
		  }	 
	}

  
  
  
  
  
}