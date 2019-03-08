class Guerrier  extends Personnage implements Attaquer 
{
		protected int ptAttaque;
	
		public Guerrier(String nom, int nbrPtVie, int ptAttaque)
		{
			super(nom,nbrPtVie);
			this.ptAttaque=ptAttaque;
		
		}
		
		public boolean attaquer (String nom)
		{
			nbrPtVie = nbrPtVie - ptAttaque;
			return true; 
		}		
} 
