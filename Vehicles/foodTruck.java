import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class foodTruck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foodTruck extends Vehicle
{
    public foodTruck ()
    {
        speed = 3;
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 10, image.getHeight() - 10);
        setImage(image);
        //image.setLocation(getX(), getY()+5);
    }

    public void act()
    {
        drive();
        checkHitPedestrian (); 
    }

    public void drive()
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
             if (p instanceof Chicken){
                Chicken c = (Chicken)p;
                c.chickenMeat();
            }
            else
            {
                Person m = (Person)p;
                m.holdBurger();
            }
            
        }
    }
}
