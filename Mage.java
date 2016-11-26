// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Mage extends Character{
    public Mage(){
	health = (int)(Math.random() * 100 + 150); // [150, 250)
	strength = (int)(Math.random() * 10 + 70); // [70, 80)
	defense = (int)(Math.random() * 20 + 10); // [10, 30)
	atkRating = (Math.random() * .5 + 1); // [1.0, 1.5)
       	defaultDef = defense;
	defaultAR = atkRating;
    }

    public Mage(String n){
        this();
        name = n;
    }
    public void normalize(){
        defense = defaultDef;
        atkRating = defaultAR;
    }
    public void specialize(){
        defense -= 8;
        atkRating += 0.5;
    }
    public String about(){
	return "Hello, I am a Mage and my name is " + name+". Monsters fear me because mages are capable of using very strong magic. However, the use of spells is extremely dangerous and the consequences are huge. After spending years studying magic, with no interaction with society my nails are sharp as glass and my aim has improved tremendously. I can scratch the monsters and they won't know what hit them. And in case I can't get that close to the wretched creatures, I can always toss my wand!!";
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 5;
	}

	return 10;
	
    }
    public String toString(){
	String ret;
	ret = "1. Scratch -- 5 HP\n";
	ret += "2. Wand Throw -- 10 HP";
	return ret;
    }
}
