
package milekpio;

import java.util.Random;

public class Game {
    
    private Player player;
    
    void addPlayer(Player player){
        this.player=player;
    }
     
    public void play(){
        
        Random dice=new Random();
        int guess;
        int roll;
        
        
        do{
            System.out.println("Podaj zgadywana wartosc: ");
            roll=dice.nextInt(6)+1;
            System.out.println("Wylosowane: "+ roll);
            guess=player.guess();
            System.out.println(player.getName()+": "+guess);
            if(guess==roll){
                System.out.println("Gra wygrana!");
            }
            else{
                System.out.println("Źle! Spróbuj jeszcze raz!");
            }
            
        }while(guess!=roll);
}
}
