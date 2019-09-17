import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ambulance extends Vehicle
{
    public Ambulance ()
    {
        speed = 3;
    }

    public void act ()
    {
        drive();
        checkHitPedestrian ();  // not implemented 
    }

    public void drive ()
    {
        move (speed);
    }

    public void checkHitPedestrian ()
    {
        // Check collision for a pedestrian one pixel ahead
        // of the Vehicle
        Pedestrian p = (Pedestrian)getOneObjectAtOffset((this.getImage().getWidth() / 2) + 1, 0, Pedestrian.class);
        if (p != null)
        {
            p.healMe();
        }
    }
}
