// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-23

public class Monster extends Character{
    public Monster(){
	health = ((int)((Math.random()*100)+50));
        strength = ((int)((Math.random()*100)+55));
        defense = ((int)((Math.random()*30)+15));;
        atkRating = (Math.random()-.1);
    }

    public String getName(){
        return "bayan";
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
	return "Hello, I am a Monster and my name is " + name;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 5;
	}
	return 10;
	
    }
}
