
package milekpio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Milekpio {

    public static void main(String[] args) {
        Player player=new PlayerHuman();
       // Game game= new Game();
       // game.addPlayer(new PlayerComp());
      //  game.play();
        
        ArrayList<String> list = new ArrayList();
        list.add("aaaa");
        list.add("baaa");
        list.add("caaa");
        list.add("daaa");
       
        for (String el : list) {
            System.out.println(el);
        }
              
        try{
            player.setName("~~");
        }
        catch(IllegalArgumentException ex){
            System.err.println("BŁĄD: "+ex.getMessage());
        }
        
        
    }
    
}
