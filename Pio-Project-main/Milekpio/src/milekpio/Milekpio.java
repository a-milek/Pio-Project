
package milekpio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Milekpio {

    public static void main(String[] args) {
        
        Game game= new Game();
        for(int i=0; i<10;i++){
                game.addPlayer(new PlayerComp("Computer"));
       }     

       // game.addPlayer(new PlayerHuman("Fearne"));
        game.play();
            
      // try{
      //      player.setName("~~");
     //   }
      //  catch(IllegalArgumentException ex){
       //     System.err.println("BŁĄD: "+ex.getMessage());
      //  }
        
        
    }
    
}
