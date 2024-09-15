import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class bomb extends Actor
{
    
    public void act()
    {
        move(-8);
        
        if(getX() <= 0)
        {
            resetBomb();
        }
        
        if(isTouching(Hero.class))
        {
            Potato potato = new Potato();
            getWorld().removeObject(sadFace,300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBomb()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(x == 0){
            setLocation(600,100);
        }
        else
        {
            setLocation(600, 300);
        }
        
    }
}
