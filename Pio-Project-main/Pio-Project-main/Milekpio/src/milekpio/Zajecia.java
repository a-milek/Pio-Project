
package milekpio;

import java.util.Random;

public class Zajecia {
    public static void main(String[] args) {
        
        Random dice = new Random();
        Player player = new Player();
        //player.setName(null);
        
        int number;
        int guess;
        do{
        
        number = dice.nextInt(6)+1;
        System.out.println(number);
        
        guess = player.guess();
        System.out.println(player.getName() + ": " + guess );
        
        if(guess == number){
            System.out.println("Zgadles");
        }else{
            System.out.println("Nie zgadles");
        }
        }while(guess != number);
    }
}

/*
zasady otwarte zamknięte
Regresja -
Refaktoryzacja +
Przeciążanie operatorów - można nadać operatorom inne znaczenie
Tak nie robić
    String t = "TEST";
t = t.toLowerCase();
if(t = "test")
    System.out.print("OK");
else
    System.out.print("NIE OK");
nigdy nie stosować "==" do Stringów
t.euquals() - to stosować
częste pytanie na inżynierce: czym są i co robią konstruktory
REGEX - wyrażenia regularne
    regex101.com
    ^[a-zA-Z0-9.\-_+]{3,}$
*/