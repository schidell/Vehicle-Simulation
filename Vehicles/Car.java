import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Car extends Vehicle
{
    private int offset;
    private Pedestrian p;
    
    public Car ()
    {
        speed = 4;
    }
    
    public void act()
    {
        drive();
        checkHitPedestrian();
    }
    
    /**
     * Method that deals with movement
     */
    public void drive() 
    {
        move (speed);
    }    

    /**
     * check if I hit a Pedestrian, and if so, act
     * accordingly
     */
    public void checkHitPedestrian ()
    {
        // Check collision for a pedestrian one pixel ahead
        // of the Vehicle
        offset = (this.getImage().getWidth() / 2) + 1;

        p = (Pedestrian)getOneObjectAtOffset(offset, 0, Pedestrian.class);
        if (p != null)
        {
            //System.out.println("got here");
            p.knockMeOver();
        }
    }
}
