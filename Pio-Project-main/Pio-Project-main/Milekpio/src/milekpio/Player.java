
package milekpio;

import java.util.Random;

public class Player{
        
        private Random brain = new Random();
        private String name = "Player";
        
        public Player(){}
        public Player(String name){
            setName(name);
        }
        
        public void setName(String name){
            //if(name != null && !name.isEmpty())
            if(name != null && name.matches("^[a-zA-Z0-9.\\-_+]{3,}$")) 
                this.name = name;
            else{
                
                throw new IllegalArgumentException();
            }
        }
        
        public String getName(){
            return name;
        }
        
        public int guess(){
            return brain.nextInt(6)+1;
        }
        
}

/*  REGEX - wyrażenia regularne
    regex101.com
    ^[a-zA-Z0-9.\-_+]{3,}$
*/
