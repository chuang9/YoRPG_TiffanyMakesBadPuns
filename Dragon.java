// Team Tiffany Makes Bad Puns -- Bayan Berri, Chester Huang, Tiffany Moi
// APCS1 pd5
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-21
public class Dragon extends Character{
    public Dragon() {
	health = ((int)((Math.random()*100)+50));
        strength = ((int)((Math.random()*100)+60));
        defense = ((int)((Math.random()*30)+15));;
        atkRating = (Math.random());
    }

    public Dragon(String n) {
        this();
        name = n;
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
	return "Hello, I am a Dragon and my name is " + name;
    }
    public int specialAtk(String s){
	int num = Integer.parseInt(s);
	if (num == 1){
	    return 80;
	}
	return 50;
	
    }
}
