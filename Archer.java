class Archer extends Guerrier
{
	Archer () 
	{
		super(nom, nbrPtVie, ptAttaque);
	}
	
	public void message ()
		{
			if (attaquer == true) 
			{
				System.out.print("\EnvoieFleche");
			}
		}	
} 
