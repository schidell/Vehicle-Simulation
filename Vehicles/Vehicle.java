import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Vehicle extends Actor
{   
    // Variables in abstract classes should be
    // implemented 
    protected int speed;
    /**
     * Abstract method declarations: 
     * This means that all Vehicles must have a
     * move() amd checkHitPedestrian() method with the same signature:
     * E.g: public void move ();
     * 
     * HINT:
     * However, in this current implementation, the drive()
     * method for all three subclasses is the same. Perhaps
     * one of these methods will change if you implement something
     * interesting that requires different drive methods. If not,
     * it would be more efficient to actually write the method
     * here, making it inherited by not abstract.
     */
    public abstract void drive ();
    
    public abstract void checkHitPedestrian ();
}










