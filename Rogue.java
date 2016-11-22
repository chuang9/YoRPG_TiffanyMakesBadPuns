// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-21
public class Rogue extends Character{
    public Rogue(){
	health = ((int)((Math.random()*100)+50));
	strength = ((int)((Math.random()*100)+55));
	defense = ((int)((Math.random()*20)+10));;
	atkRating = ((Math.random()+.1));
    }
    public Rogue(String n ) {
	this();
	name=n;
    }
    public void normalize(){
        defense = 20;
        atkRating = 0.4;
    }
    public void specialize(){
        defense-=5;
        atkRating+=0.4;
    }
    public String about(){
	return "Hello, I am a Rogue and my name is " + name;
    }
}
