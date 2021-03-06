// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Fairy extends Character{
    public Fairy(){
	health = (int)(Math.random() * 100 + 300); // [300, 400)
	strength = (int)(Math.random() * 10 + 30); // [30, 40)
	defense = (int)(Math.random() * 10 + 40); // [30, 40)
	atkRating = (Math.random() / 4 + .75); // [0.75, 1.0)
	defaultDef = defense;
	defaultAR = atkRating;
    }

    public Fairy(String n){
        this();
        name = n;
    }
    public void normalize(){
        defense = defaultDef;
        atkRating = defaultAR;
    }
    public void specialize(){
        defense -= 5;
        atkRating += 0.6;
    }
    public String about(){
	return "Hello, I am a Fairy and my name is " + name +". Don't let my small size fool you, it works against the monsters. They don't see me and when I sprinkle Fairydust in their eyes they can't see anything hehehe. I can also flap my wings at unimaginable speeds and blow the wretched creatures far far away. Ha, they won't ever know what hit them hehehe.";
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 30;
	}
	return 45;
    }
    public String toString(){
	String ret;
	ret = "1. Sprinkle Fairy Dust -- 30 HP\n";
	ret += "2. Whirlwind -- 45 HP";
	return ret;
    }
}
