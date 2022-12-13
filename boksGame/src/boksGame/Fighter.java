package boksGame;

public class Fighter {
	String name;
	int damage;
	int hp;
	int weight;
	int dodge;
	int aparkatSansi;
	
	
	
	public Fighter(String name,int damage,int hp,int weight,int dodge,int aparkatSansi) {
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.weight = weight;
		this.dodge = dodge;
		
	}
	
	public boolean dodge() {
		int randomnumber = (int) (Math.random() *5);
		return this.dodge <= randomnumber;

}

}
