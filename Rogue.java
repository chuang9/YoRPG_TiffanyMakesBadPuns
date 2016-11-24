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
	return "Hello, I am a Rogue and my name is " + name;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 75;
	}
	return 25;
	
    }
}
