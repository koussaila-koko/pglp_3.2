package uvsq.pglp;

/**
 * la classe manager.
 * @author koussiala HAMMOUCHE .
 */
public class manager extends employe {
	/**
	 * nbSousorder c'est le nombre, sous order de manager.
	 */
	private int nbSousorder;

	/**
	 * le constroctor de manager .
	 * @param id          de manager .
	 * @param salaire     .
	 * @param encienter   .
	 * @param nbSousorder .
	 */
	public manager(int id, int salaire, int encienter, int nbSousorder) {
		super(id, salaire, encienter);
		this.nbSousorder = nbSousorder;
	}

	@Override
	/**
	 * methede qui calcul le salaire, avec la commission .
	 * @return le salaire plus la commission
	 */
	public int salaire_Calcul() {
		return super.salaire_Calcul() + nbSousorder * 100;
	}
}
