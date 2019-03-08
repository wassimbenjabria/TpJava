class Infirmier extends Soigneur

{
	Infirmier (int nbrPtVie,String nom,int ptSoin ) 
	{
		super(nom, nbrPtVie, ptSoin);
	}
	
	
	public void message ()
		{
			if (soigner == true) 
			{
				System.out.print("\nPanssement");
			}
		}
	
} 
 
 
