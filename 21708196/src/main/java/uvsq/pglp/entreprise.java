package uvsq.pglp;

import java.util.ArrayList;
import java.util.List;

public class entreprise  {
 
private List<interface_salaire> salarieList;
	
	public void entreprise() {
		salarieList = new ArrayList<interface_salaire>();
	}
	
	public double Somme_tota_des_Salaires() {
		double sum = 0;
		for (interface_salaire s : salarieList) {
			sum += s.salaire_Calcul();
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	public entreprise() {
		
		
		
		}
	
	public void  calcul_salair () {
		
				 
		// TODO Auto-generated constructor stub
	}

}
