// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Warrior extends Character{
    public Warrior(){
	health = ((int)((Math.random()*100)+50));
	strength = ((int)((Math.random()*100)+65));
	defense = ((int)((Math.random()*20)+10));;
	atkRating = ((Math.random()+.1));
    }

    public Warrior(String n){
        this();
        name = n;
    }
    public String getName(){
        return name;
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
	return "Hello, I am a Warrior and my name is " + name;
    }
}

