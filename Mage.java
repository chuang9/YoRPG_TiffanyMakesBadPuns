// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Mage extends Character{
    public Mage(){
        health = 125;
        strength = 100;
        defense = 20;
        atkRating = 0.4;
    }

    public Mage(String n){
        this();
        name = n;
    }
    public void normalize(){
        defense = 20;
        atkRating = 0.4;
    }
    public void specialize(){
        defense -= 5;
        atkRating += 0.4;
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
