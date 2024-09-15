import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    boolean atTop = true;
    public void act()
    {
        // Add your action code here
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
            setLocation(200,100);
        }
        
        if(atTop)
        {
            setLocation(200,100);
            
        }
        else
        {
            setLocation(200,300);
        }
    }
}
