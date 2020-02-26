package uvsq.pglp;

public class employe {

	private   int id ; 
	private int salaire ;  
	private int encienter;  
	 
	 
	
	
	public employe(int id , int salaire , int encienter) { 
		
		this.id = id ; 
		this.salaire = salaire; 
		this.encienter = encienter; 
		
		// TODO Auto-generated constructor stub
	}

	
	 public int  salaire_Calcul() {
		return encienter * 20 + 1500 ; 
		// TODO Auto-generated constructor stub
	}
	 
	 
	 public void modifier_encienter(int nbr) {
		 encienter = encienter + nbr ; 
		 
	 }
	 
	 
}
 