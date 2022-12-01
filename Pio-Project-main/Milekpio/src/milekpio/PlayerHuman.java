package milekpio;

import java.util.Scanner;

public class PlayerHuman extends Player{

    private Scanner scanner= new Scanner (System.in);

    @Override
    public int guess(){
   
        return scanner.nextInt();
    }

    public PlayerHuman(String name){
       super(name); //odwołanie się do wyżej konstruktora z parametrem name
    }
    public PlayerHuman (){
    }

}
