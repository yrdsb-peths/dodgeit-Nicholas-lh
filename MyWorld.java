import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //create new Hero
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 50, 100);
        
        bomb bomb = new bomb();
        addObject(bomb, 600, 100);
    }
}
