
package milekpio;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    
    private Player player;
    private ArrayList<Player> playerList = new ArrayList();
    public final Statistics stats;
    
    public Game(Statistics stats){
        this.stats=stats;
    }
     public Game(){
        
    }
    void addPlayer(Player player){
        Random number = new Random();
        
        for (Player p : playerList) {
            while(player.name.equals(p.name)){
            player.setName(player.getName()+ (number.nextInt(9)+1));
            }
        }
      
        playerList.add(player);
    }
    
    public void printPlayers(){
        System.out.println("### players ###");
        for(Player player: playerList){
            System.out.println(player.getName());
        }
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
                stats.andTheWinnerIs();
            }
            else{
                    System.out.println("Źle! Spróbuj jeszcze raz!");
                }
            }

        }while(!success);           
       
    }
    
    public void removePlayer(String name){
        playerList.removeIf((Player player)->player.getName().equals(name));
    }
    
}
