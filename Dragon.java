// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Dragon extends Character{
    public Dragon(){
	health = (int)(Math.random() * 100 + 250); // [250, 350)
	strength = (int)(Math.random() * 20 + 60); // [60, 80)
	defense = (int)(Math.random() * 15 + 25); // [25, 40)
	atkRating = (Math.random() / 2 + .5); // [0.5, 1.0)
	defaultDef = defense;
	defaultAR = atkRating;
    }

    public Dragon(String n){
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
	return "Hello, I am a Dragon and my name is " + name + "My size allows me to squash my opponents with my large body. I am also capable of burning the wretched monsters. RAWRRRR" ;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 80;
	}
	return 50;
	
    }
}
