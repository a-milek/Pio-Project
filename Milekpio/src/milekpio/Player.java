
package milekpio;

import java.util.Random;

public class Player {
    private Random brain = new Random();
    public String name;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int guess(){
        return brain.nextInt(6)+1;
    }
    
    
}
