import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class GameSquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSquare extends Actor
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
    
    //Instance Variables    
    private boolean firstRun = true;
    private int value = 2;
    private boolean debug=false;
    
        
    //Constructor
    public GameSquare()
    {
        displayValue();
    }
    
    /**
     * Tell the block to move in the given direction until it hits an obstacle
     * 
     * @param The direction in which the block is to move (UP = 0; RIGHT = 1; DOWN = 2; LEFT = 3;
     */
    public void move(int direction) 
    {
        //check if can move
        int movable = canMove(direction);

        //if moveable, start a loop
        while (movable > 0)
        {
            //Get current coordinates
            //ADD CODE
            
            //Change x and y values to the "new" location based on direction
            //ADD CODE
            
            //If Nothing in the way - move the block
            if (movable == 1) {  
                setLocation(x,y);
                movable = canMove(direction);
                continue;
                //return;
            }
            //Merge the blocks
            else {
                //Find which block we need to merge with
                //ADD CODE
                
                //Tell the other block object we wish to merge with it.  If successful, delete this block from the game
                //ADD CODE
                
                
                
                
                return;
            }
        }
        
        
        //can't move, so don't move.
        return;
    }

    /**
     * Merge with another block and combine values.
     * Will only work if the two blocks are of the same value
     * 
     * @param The value of the block to be merged with
     * 
     * @return Return true if the merge is successful.
     */
    public boolean merge(int valueIn)
    {
        //ADD CODE
    }
    
    /**
     * Returns the current value of the gameSquare
     * 
     * @return The current value (int) of the game square
     */
    
    public int getValue()
    {
        //ADD CODE
    }

    /**
     * Checks to see if the block can move
     * 
     * @return int value representing what is in the space to be moved to.  0 -> Path Blocked, 1 -> Empty Space, int>1 value of block in the space to be moved to.
     */
    private int canMove(int direction)
    {
        //Get World
        //ADD CODE
        
        //Get x and y values of current object
        //ADD CODE        
        
        //Change x and y values to the "new" location based on direction
        //ADD CODE
        
        //Test for outside border
        //ADD CODE   
        
        //Check to see if there is a block in the way
        //ADD CODE
        
        return 1;
    }
    
    /**
     * displayValue - Displays the current value of a block in an image, then sets that image to the block display image
     */    
    private void displayValue() 
    {
        //Create an image consisting of the display value using built in greenfoot commands
        GreenfootImage displayImage;
        displayImage = new GreenfootImage( Integer.toString(value), 20, Color.BLACK, Color.WHITE);
        
        //Add the image as the new image for this object
        setImage(displayImage);
        
    }
}
