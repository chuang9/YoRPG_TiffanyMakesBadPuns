// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Fairy extends Character{
    public Fairy(){
	health = ((int)((Math.random()*100)+50));
        strength = ((int)((Math.random()*100)+55));
        defense = ((int)((Math.random()*30)+15));;
        atkRating = (Math.random());
    }

    public Fairy(String n){
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
	return "Hello, I am a Fairy and my name is " + name;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 30;
	}
	return 45;
	
    }
}
