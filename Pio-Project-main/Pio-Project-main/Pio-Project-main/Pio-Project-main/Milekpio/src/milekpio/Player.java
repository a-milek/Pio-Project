
package milekpio;

import java.util.Random;

abstract public class Player{
        
       
        protected String name = "Player";
        
        public Player(){}
        public Player(String name){
            setName(name);
        }
        
        public final void setName(String name){
            //if(name != null && !name.isEmpty())
            if(name != null && name.matches("^[a-zA-Z0-9.\\-_+]{3,}$")) 
                this.name = name;
            else{
                
                throw new IllegalArgumentException();
            }
        }
        
        public final String getName(){
            return name;
        }
        
        abstract public int guess();
        
}

/*  REGEX - wyrażenia regularne
    regex101.com
    ^[a-zA-Z0-9.\-_+]{3,}$
*/
