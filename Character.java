// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-21
public abstract class Character{
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected double atkRating;
    public boolean isAlive() {
        return health > 0;
    }
    public String getName(){
	return name;
    }
    public int getDefense(){
        return defense;
    }
    public void lowerHP(int damage){
        health-=damage;
    }
    public int attack(Character c){
        int d = (int)(strength * atkRating)-c.defense;
        c.lowerHP(d);
        return d;
    }
    public abstract void specialize();
    
    public abstract void normalize();

    public abstract String about();

}
