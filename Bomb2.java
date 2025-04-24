import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb2 extends Actor
{
    public void act()
    {
        move(-4);
        
        if(getX() <= 0) {
            resetBomb();
        }
        
        if(isTouching(Hero.class)) {
            // Add a gameover symbol
            LoserBee loserBee = new LoserBee();
            getWorld().addObject(loserBee, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBomb() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
        setLocation(600, 100);
        } else {
        setLocation(600, 300);
        }
    }
}