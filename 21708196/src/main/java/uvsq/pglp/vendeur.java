package uvsq.pglp;

/**
 * la classe vendeur.
 * 
 * @author koussiala HAMMOUCHE .
 */
public class vendeur extends employe {
	/**
	 * commission .
	 */
	private int commission;

	/**
	 * le constroctor vendeur .
	 * @param id         de vendeur .
	 * @param salaire    .
	 * @param encienter  .
	 * @param commission .
	 */
	public vendeur(int id, int salaire, int encienter, int commission) {
		super(id, salaire, encienter);
		this.commission = commission;
	}

	@Override
	/**
	 * methede qui calcul le salaire, avec la commission .
	 * @return le salaire plus la commission
	 */
	public int salaire_Calcul() {
		return super.salaire_Calcul() + commission;
	}
}
