import java.util.Random ;

class Jouer {
	
	static Random rnd=new Random();
	
	
    public static void main(String[] args) {
		int pointDeVie = rnd.nextInt (100); 
		//int pointDeCombat = rnd.nextInt (100); 
		int pointDeSoin = rnd.nextInt (100); 
		
       Infirmier i= new Infirmier (pointDeVie, "wassim",pointDeSoin);
	   System.out.println(i.ptSoin);  
        
    }
}


