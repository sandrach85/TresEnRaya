import java.util.Scanner;

public class Jugador {

	private char ficha;

	public Jugador(int i) {

		// Scanner entrada = new Scanner(System.in);
		if (i == 0) {
			i++;
			System.out.println("El jugador " + i + " tiene la ficha x");
			i--;
			this.ficha = 'x';
		} else {
			i++;
			System.out.println("El jugador " + i + " tiene la ficha o");
			i--;
			this.ficha = 'o';
		}

		// char ent = (char) entrada.next().charAt(0);
		// String fic;
		// fic= entrada.next();
		// this.ficha = ent;
		// entrada.close();
	}

	public char getFicha() {
		return ficha;
	}

	public void mover(Tablero tablero) {

		Scanner ent = new Scanner(System.in);
		int fil;
		int col;

		if (!tablero.HayTresEnRaya()) {
			System.out.println("Escriba la fila para la ficha a mover:");
			fil = ent.nextInt();
			System.out.println("Escriba la columna para la ficha a mover:");
			col = ent.nextInt();
			char fic = tablero.casillas[fil][col];
			tablero.casillas[fil][col] = '-';
			System.out.println("Escriba la fila para poner la ficha:");
			fil = ent.nextInt();
			System.out.println("Escriba la columna para poner la ficha:");
			col = ent.nextInt();

			if (tablero.CasillaLibre(fil, col)) {
				tablero.casillas[fil][col] = fic;
			}
		}
		// ent.close();

	}

	public void poner(Tablero tablero) {

		Scanner in = new Scanner(System.in);
		int fil;
		int col;

		if (!tablero.HayTresEnRaya()) {
			System.out.println("Escriba la fila para poner la ficha:");
			fil = in.nextInt();
			System.out.println("Escriba la columna para poner la ficha:");
			col = in.nextInt();
			if (tablero.CasillaLibre(fil, col)) {
				tablero.casillas[fil][col] = this.ficha;
			} else {
				System.out.println("Casilla ocupada");
				this.mover(tablero);
			}
		}
		// in.close();
	}

}
