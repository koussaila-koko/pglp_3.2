package uvsq.pglp;

public class vendeur extends employe  {
	private int commission;
	
	public vendeur(int id , int salaire , int encienter, int commission) {
		super(id, salaire, encienter);
		this.commission = commission ; 
		
		
		
	}
	@Override
	public int  salaire_Calcul() {
	return super.salaire_Calcul()+commission ;
	
		
	}

}
