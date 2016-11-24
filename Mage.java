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
	return "Hello, I am a Mage and my name is " + name;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 5;
	}

	return 10;
	
    }
}
