class Epeiste extends Guerrier
{
	Epeiste () 
	{
		super(nom, nbrPtVie, ptAttaque);
	}
	
	public void message ()
		{
			if (attaquer == true) 
			{
				System.out.print("\nCoupEpee");
			}
		}
} 
