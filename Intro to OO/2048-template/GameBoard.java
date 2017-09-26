import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard extends World
{

    //Instance Constants
    
    /* Note: 
     * Since these variables are definied at STATIC they will never change (aka are constant).
     * Normally when we have constant variables like this we name them in ALL CAPS
    */
    //Define some directions to make it easier to reference which way the blocks are moving
    private static final int UP = 0;
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(4, 4, 50); 
        
        //populate gameboard with x randomly placed objects
        //ADD CODE
    }
    
    
    /**
     * Place a block on a random location on the board
     * 
     * @return Returns true if successful, false if not successful
     */
    private boolean placeRandomBlock()
    {
        //Generate Random Location
        //ADD CODE
        
        //Check to ensure random location is not yet taken, if the spot is free add it to the world
        //ADD CODE
        return false;
    }
    
    /**
     * Act - Check for key presses and tell each block to move itsself.
     */
    public void act() 
    {
        //Add key press actoins here
        String key = Greenfoot.getKey();
        
        //If a key was pressed...do something
        if (key != null) {
            
            //Note: you should disable this, but I wanted to show how you can debug in greenfoot
            System.out.println(key);  
            
            switch(key) {
                case "up": 
                    //Tell the blocks to move up
                    //Start checking from the top, then move downwards

                    for (int i =0; i< getWidth(); i++) {
                        for (int j=0; j<getHeight(); j++) {
                            
                            List blockList = getObjectsAt(i,j,GameSquare.class);
            
                            //Tell the other block object we wish to merge with it.  If successful, delete this block from the game
                            if (blockList.size() == 1) { //Error checking
                                //Get the first (and only) entry in the list
                                //Convert it from the generic "Object" to a GameSquare Object
                                //Then move UP.  All the following was accomplished on the single line below
                                //It can be a bit confusing when code is all in one line.  Is this considered good form or bad form?
                                ( (GameSquare)( blockList.get(0) )).move(UP);  
                            }
                        }
                    }
                    break;
                //NOTE: The remaining cases are similar to the one above, but not exactly the same
                case "right":
                    //Tell the blocks to move right
                    //Start checking from the right most col, then move left                    
                    //ADD CODE
                    break;

                case "down":
                    //Tell the blocks to move down
                    //Start checking from the bottom, then move up
                    //ADD CODE
                    break;

                case "left":
                    //Tell the blocks to move left
                    //Start checking from the left, then move right
                    //ADD CODE
                    break;

                }
                

            //Since placeRandomBlock is not gaurenteed to work the first time, repeat the process until it does
            //May need to change this
            int count = 0;
            while (count < 1) {
                if (placeRandomBlock()) {
                    count++;
                }
            }            
        }
        
    }
}
