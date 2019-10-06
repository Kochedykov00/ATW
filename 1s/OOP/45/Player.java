package ru.kfpu.itis.group801.Kochedykov.basicClasses;

public class Player {

	String name;
	int hp;
	
	
	
	public double hit(Player p,int power, double chance) {
		p.hp = p.getHp() - (double) power / chance;
		return p.hp; 		
	}
		
		
	
	public Player(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	
	public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
	
	public String toString() {
        return name + hp;
    }
	
}
	
	
	
	
	