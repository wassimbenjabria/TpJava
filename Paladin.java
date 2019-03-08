abstract class Paladin extends Personnage implements Soigner, Attaquer 
{
	private int ptAttaque;
	private int ptSoin;	
	
	public Paladin(int ptAttaque, int ptSoin)
	{
		this.ptAttaque=ptAttaque;
		this.ptSoin = ptsoin; 
	}
	public boolean soigner (String nom)
	{
		nbrPtVie = nbrPtVie + ptSoin; 
		return true; 
	}	
	
	public boolean attaquer (String nom)
	{
		nbrPtVie = nbrPtVie - ptAttaque;
		return true; 
	}	
} 
