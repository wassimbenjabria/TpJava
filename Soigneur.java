abstract class Soigneur  extends Personnage implements Soigner
{	
	protected int ptSoin;	
	
	public Soigneur(String nom, int nbrPtVie, int ptSoin)
	{
		super(nom,nbrPtVie);
		this.ptSoin = ptSoin; 
	}
	
	/**public boolean soigner ()
	{
		nbrPtVie = nbrPtVie + ptSoin;
	    return true;
	}	**/
} 
