public class TresEnRaya {
	private Tablero tablero;
	private Jugador[] jugadores;
	private Turno turno;

	public TresEnRaya() {
		tablero = new Tablero();
		turno = new Turno();
		jugadores=new Jugador[2];
		for (int i = 0; i < 2; i++) {
			jugadores[i] = new Jugador(i);			
		}
	}

	public void Jugar() {
		do {
			tablero.mostrar();
			if (tablero.completo()) {
				jugadores[turno.toca()].mover(tablero);
			} else {
				jugadores[turno.toca()].poner(tablero);
			}
			turno.cambiar();
		} while (!tablero.HayTresEnRaya());
	}

	public static void main(String [] args) {
		new TresEnRaya().Jugar();
	}
}