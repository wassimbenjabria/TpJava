class Medecin extends Soigneur
{
	Medecin () 
	{
		super(nom, nbrPtVie, ptSoin);
	}
	
	public void message ()
		{
			if (soigner == true) 
			{
				System.out.print("\nChirurgie");
			}
		}
	
} 
