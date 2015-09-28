public class Turno {

	private int turno;

	public Turno() {
		turno = 0;

	}

	public int toca() {

		int turnoImpri=turno;
		turnoImpri++;
		System.out.println("El turno es del jugador: " + turnoImpri);
		return turno;
	}

	public void cambiar() {

		turno = (turno + 1)% 2;
		//System.out.println("Le toca al jugador: " + turno);

	}

}
