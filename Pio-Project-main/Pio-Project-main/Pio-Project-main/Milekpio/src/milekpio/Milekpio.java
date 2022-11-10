
package milekpio;

import java.util.Random;

public class Milekpio {

    public static void main(String[] args) {
        Player player=new PlayerHuman();
        Random dice=new Random();
        int guess;
        int roll;
              
        try{
            player.setName("~~");
        }
        catch(IllegalArgumentException ex){
            System.err.println("BŁĄD: "+ex.getMessage());
        }
        
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
