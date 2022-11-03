/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package milekpio;

import java.util.Random;

/**
 *
 * @author Ania
 */
public class Milekpio {

    public static void main(String[] args) {
        Player player=new Player();
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
