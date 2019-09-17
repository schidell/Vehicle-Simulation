import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld functions as the Controller for this Greenfoot
 * project which helps students understand inheritance
 * 
 * INSERT YOUR WRITTEN TASK HERE:
 * 
 * @version March 2017
 */
public class MyWorld extends World
{
    private int randomize;
    /**
     * Spawn Rates:
     * Lower number means more spawns
     * 3:spawnRate chance per act of spawning a random Vehicle
     * 1:pedSpawn chance per act of spawning a Pedestrian
     */
    private int spawnRate = 200; // must be higher than 3 ... should be higher than 30
    private int pedSpawn = 100; 
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
    }

    public void act ()
    {
        // Rum methods to see if any pedestrians or vehicles are going to be 
        // spawned this act:
        spawnPedestrians();
        spawnVehicles();       
    }
    
    private void spawnVehicles()
    {
        // Generate a random number to add a random element
        // to Vehicle spawning
        randomize = Greenfoot.getRandomNumber(spawnRate);
        
        
        // Chose a random lane in case a vehicle spawns
        int lane = Greenfoot.getRandomNumber (6);
        int spawnY = getYPosition (lane);

        // spawn vehicles
        if (randomize == 1)
        {
            // spawn a Car
            addObject (new Car(), 10, spawnY);
        }
        else if (randomize == 2)
        {
            // spawn a Bus
            addObject (new Bus(), 10, spawnY);
        }

        else if (randomize == 3)
        {
            // spawn a Car
            addObject (new Ambulance(), 10, spawnY);
        }
        
        else if (randomize == 4)
        {
            //spawn a food truck
            addObject (new foodTruck(), 10, spawnY);
        }
    }
    
    private void spawnPedestrians()
    {
        // spawn pedestrians
        if (Greenfoot.getRandomNumber(pedSpawn) == 1)
        {
            addObject (new Person(), Greenfoot.getRandomNumber(600), 395);
        }
        else if (Greenfoot.getRandomNumber(pedSpawn) ==2)
        {
            addObject (new Chicken(), Greenfoot.getRandomNumber(600), 395);
        }
    }
    
    
    /**
     * Returns the appropriate y coordinate for a given lane
     */
    private int getYPosition (int inLane)
    {
        // Manually input values based on the background graphic
        switch (inLane)
        {
            case 0: 
            return 79;

            case 1:
            return 127;

            case 2:
            return 175;

            case 3:
            return 222;

            case 4:
            return 272;

            case 5: 
            return 320;

        }  
        // In case an invalid value is passed in
        return 0;
    }
}

