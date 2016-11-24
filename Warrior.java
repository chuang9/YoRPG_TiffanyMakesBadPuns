// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Warrior extends Character{
    public Warrior(){
	health = (int)(Math.random() * 100 + 250); // [250, 350)
	strength = (int)(Math.random() * 10 + 60); // [50, 60)
	defense = (int)(Math.random() * 10 + 20); // [20, 30)
	atkRating = (Math.random() / 2 + .5); // [0.5, 1.0)
	defaultDef = defense;
	defaultAR = atkRating;
    }

    public Warrior(String n){
        this();
        name = n;
    }
    public void normalize(){
        defense = defaultDef;
        atkRating = defaultAR;
    }
    public void specialize(){
        defense -= 5;
        atkRating += 0.4;
    }
    public String about(){
	return "Hello, I am a Warrior and my name is " + name;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 90;
	}
	return 90;
    }
}
