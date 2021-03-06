// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public abstract class Character{
    protected String name;
    protected int health;
    protected int strength;
    protected int defense;
    protected int defaultDef;
    protected double atkRating;
    protected double defaultAR;

    public boolean isAlive(){
        return health > 0;
    }
    public String getName(){
	return name;
    }
    public int getDefense(){
        return defense;
    }
    public void lowerHP(int damage){
        health -= damage;
    }
    public int attack(Character c){
        int d = (int)((strength * atkRating) - c.defense);
	if (d < 0)
	    d = 0;
        c.lowerHP(d);
        return d;
    }
    public int atk(Character c, int d){
	c.lowerHP(d);
	return d;
    }
    public abstract void normalize();
    public abstract void specialize();
    public abstract String about();
    public abstract int specialAtk(String s);
}
