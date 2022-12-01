
package milekpio;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    
    private Player player;
    private ArrayList<Player> playerList = new ArrayList();
    
    void addPlayer(Player player){
        Random number = new Random();
        
        for (Player p : playerList) {
            while(player.name.equals(p.name)){
            player.setName(player.getName()+ (number.nextInt(9)+1));
            }
        }
      
        playerList.add(player);
    }
     
    public void play(){
        
        Random dice=new Random();
        int guess;
        int roll;
        boolean success= false;
        roll=dice.nextInt(6)+1;
        System.out.println("Wylosowano liczbę: "+ roll);
                
       
        do{
            for (Player p : playerList) {
            System.out.println(p.getName()+ " Podaj zgadywana wartosc: ");
            guess=p.guess();
            System.out.println(p.getName()+": "+guess);
            if(guess==roll){
                System.out.println("Gra wygrana!");
                success= true;
            }
            else{
                    System.out.println("Źle! Spróbuj jeszcze raz!");
                }
            }

        }while(!success);        




                
        
       
}
}
