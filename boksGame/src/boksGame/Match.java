package boksGame;

public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	int start;
	
	Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}
	public void run() {
				if(checkWeight()) {
					System.out.println("Sporcular siklete uygun");
				int start = (int) (Math.random()*2); // Maça kimin baslayacagını belirliyor
				if(start==1) {
					System.out.println("Maça "+ f1.name+ " başlıyor");
					System.out.println("==============================");
				}
				else {
					System.out.println("Maça "+ f2.name+ " başlıyor");
					System.out.println("==============================");
				}
				while(f1.hp>0 && f2.hp>0) {
					System.out.println("YENİ ROUND");
					fight(start);					
					System.out.println("==============================");
				}
			
				if(f1.hp>0) {
				System.out.println("Maçı kazanan "+f1.name);
				}
				if(f2.hp>0) {
				System.out.println("Maçı kazanan "+f2.name);
				}}
				else {
					System.out.println("Sporcular siklete uygun değil");
				}
				
				
	}
			
		
	
	
	public boolean checkWeight() {
		return (f1.weight<=maxWeight && f1.weight>=minWeight)&&(f2.weight<=maxWeight && f2.weight>=minWeight); 
		}
	
	void fight(int start) { 
	
	if(start == 1) {
		int aparkat = (int) (Math.random() *10);
		int aparkat1 = (int) (Math.random() *10);
		if(f1.aparkatSansi == aparkat ) {
			System.out.println(f1.name+" aparkat vuruyor");
			f2.hp = f2.hp - 2*f1.damage;
		}
		if(f2.aparkatSansi == aparkat1) {
			System.out.println(f2.name+" aparkat vuruyor");
			f1.hp = f1.hp - 2*f2.damage;
		}
		System.out.println(f1.name+" vuruyor");
		if(f2.dodge()) {
			System.out.println(f2.name+" Vuruştan kaçtı");
		}
		else {
			f2.hp = f2.hp - f1.damage;			
		}
		System.out.println(f2.name+" vuruyor");
		if(f1.dodge()) {
			System.out.println(f1.name+" Vuruştan kaçtı");
		}
		else {
			f1.hp = f1.hp - f2.damage;			
		}
		System.out.println(f1.name+"'in canı:"+f1.hp);
		System.out.println(f2.name+"'in canı:"+f2.hp);
}
	if(start == 0) {
		int aparkat = (int) (Math.random() *10);
		int aparkat1 = (int) (Math.random() *10);
		if(f1.aparkatSansi == aparkat ) {
			System.out.println(f1.name+" aparkat vuruyor");
			f2.hp = f2.hp - 2*f1.damage;
		}
		if(f2.aparkatSansi == aparkat1) {
			System.out.println(f2.name+" aparkat vuruyor");
			f1.hp = f1.hp - 2*f2.damage;
		}
		System.out.println(f2.name+" vuruyor");
		if(f2.dodge()) {
			System.out.println(f1.name+" Vuruştan kaçtı");
		}
		else {
			f1.hp = f1.hp - f2.damage;	
					
		}
		System.out.println(f1.name+" vuruyor");
		if(f1.dodge()) {
			System.out.println(f2.name+" Vuruştan kaçtı");
		}
		else {
			f2.hp = f2.hp - f1.damage;			
		}
		System.out.println(f1.name+"'in canı:"+f1.hp);
		System.out.println(f2.name+"'in canı:"+f2.hp);
		
}
	}
	
	
}
