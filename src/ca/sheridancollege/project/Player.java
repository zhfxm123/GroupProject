/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 */
public abstract class Player {

    private String playerID; 

    
    public Player() {

    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    public abstract void hit();
        
    

    public abstract void stand(); 
        
    

}
