// File For The Screen Class
public class Screen {
  private char[][] m_screen = new char[20][20];

  public void DeclareMe(){
    for(int b = 0; b < 20; b++){
      for(int i = 0; i < 20; i ++){
          m_screen[b][i] = '•';
        }      
      }
  }

  // Update at cords given Method
  public void CordChange(char newV, int posX, int posY){
    m_screen[posX][posY] = newV;
  }

  // Print Screen Method
  public void printScr(){
    for(int b = 0; b < 20; b++){
      for(int i = 0; i < 20; i ++){
          System.out.print(m_screen[b][i]);
        }      
        System.out.println("");
    }
  }

}