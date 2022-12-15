
package milekpio;


public class Milekpio {

    public static void main(String[] args) {
        
       Game game= new Game(new Statistics());
       
       game.addPlayer(new PlayerComp("aaa"));
       game.addPlayer(new PlayerComp("aba"));
       game.addPlayer(new PlayerComp("aaa"));
       game.addPlayer(new PlayerComp("aba"));

      
       game.printPlayers();
       
       for(int i=0;i<100;i++){
           game.play();
       }
       
       game.stats.print();
    
    }
    
}
