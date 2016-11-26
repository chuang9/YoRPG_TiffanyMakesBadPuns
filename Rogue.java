// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Rogue extends Character{
    public Rogue(){
	health = (int)(Math.random() * 100 + 200); // [200, 300)
	strength = (int)(Math.random() * 25 + 25); // [25, 50)
	defense = (int)(Math.random() * 20 + 10); // [10, 30)
	atkRating = (Math.random() / 2 + 1); // [1.0, 1.5)
	defaultDef = defense;
	defaultAR = atkRating;
    }

    public Rogue(String n){
	this();
	name = n;
    }
    public void normalize(){
        defense = defaultDef;
        atkRating = defaultAR;
    }
    public void specialize(){
        defense -= 10;
        atkRating += 0.8;
    }
    public String about(){
	return "Hello, I am a Rogue and my name is " + name+". I'm a sneaky one. Your opponents will never see me coming because I live in the darkness... or some might say... the darkness lives in me. Anyway, that's besides the point. I can use that to my advantage and channel the dark energy to fight against the monsters. Not only do I throw a mean shadow ball but I can also kick the monsters back to where they came from if I can get close enough!!";
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 95;
	}
	return 25;
	
    }
    public String toString(){
	String ret;
	ret = "1. Shadow Ball -- 95 HP\n";
	ret += "2. Kick -- 25 HP";
	return ret;
    }
}
