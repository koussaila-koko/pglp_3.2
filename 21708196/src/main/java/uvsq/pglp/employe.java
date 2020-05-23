package uvsq.pglp;
/**
 * la classe employe.
 * @author koussiala HAMMOUCHE .
 */
public class employe {
	/**
	 * le identifiant de l employe id.
	 */
	private int id;
	/**
	 * le salaire de l employe salaire.
	 */
	private int salaire;
	/**
	 * lencienter de l employe encienter.
	 */
	private int encienter;

	/**
	 * le constroctor de employe .
	 * @param id        de employe .
	 * @param salaire   .
	 * @param encienter .
	 */
	public employe(int id, int salaire, int encienter) {

		this.id = id;
		this.salaire = salaire;
		this.encienter = encienter;
	}

	/**
	 * methede qui calcul le salaire, pour employe la commission .
	 * @return encienter * 20 + 1500
	 */

	public int salaire_Calcul() {
		return encienter * 20 + 1500;
	}

	/**
	 * methode modifier_encienter encienter = encienter + nbr
	 */
	public void modifier_encienter(int nbr) {
		encienter = encienter + nbr;
	}
}
