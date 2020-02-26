package uvsq.pglp;

public class manager extends employe {
	private int nbSousorder;
		public manager(int id, int salaire, int encienter,int nbSousorder) {
		super(id, salaire, encienter);
		this.nbSousorder=nbSousorder;
		// TODO Auto-generated constructor stub
	}

		
		
		@Override
		public int  salaire_Calcul() {
			return super.salaire_Calcul() + nbSousorder * 100;
		}
}
