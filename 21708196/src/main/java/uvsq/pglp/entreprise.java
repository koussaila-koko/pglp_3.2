package uvsq.pglp;

import java.util.ArrayList;
import java.util.List;
/**
 * la classe entreprise.
 * @author koussiala HAMMOUCHE .
 */
public class entreprise {
	/**
	 * la liste des salairiers entreprise.
	 */
	private List<interface_salaire> salarieList;

	/**
	 * le constroctor de entreprise.
	 */
	public entreprise() {
		salarieList = new ArrayList<interface_salaire>();
	}

	/**
	 * methode Somme_tota_des_Salaires. qui retourn la somme de tous les emplyeurs
	 * apres avoir calculer le salaire commision
	 * @return sum la somme des salaires des emplyeurs
	 */
	public double Somme_tota_des_Salaires() {
		double sum = 0;
		for (interface_salaire s : salarieList) {
			sum += s.salaire_Calcul();
		}
		return sum;
	}
}
