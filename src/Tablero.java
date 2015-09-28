public class Tablero {
	public char[][] casillas;

	public Tablero() {
		casillas = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.casillas[i][j] = '-';
			}
		}
	}

	public void mostrar() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(casillas[i][j]);
			}
			System.out.println();
		}
	}

	public boolean completo() {
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (this.casillas[i][j] != '-') {
					cont++;
				}
			}
		}
		if (cont > 5) {
			return true;
		} else{
			return false;
		}
	}

	public boolean CasillaLibre(int fil, int col) {
		if (casillas[fil][col] != '-') {
			return false;
		} else {
			return true;
		}
	}

	public boolean HayTresEnRaya() {
		for (int i = 0; i < 3; i++) {
			if (((this.casillas[i][0]) == (this.casillas[i][1])) && ((this.casillas[i][0]) == (this.casillas[i][2]))
					&& (this.casillas[i][1]) != '-') {
				System.out.println("　HAY TRES EN RAYA!!");
				this.mostrar();
				return true;
			}
		}

		for (int j = 0; j < 3; j++) {
			if (((this.casillas[0][j]) == (this.casillas[1][j])) && ((this.casillas[0][j]) == (this.casillas[2][j]))
					&& (this.casillas[1][j]) != '-') {
				System.out.println("　HAY TRES EN RAYA!!");
				this.mostrar();
				return true;
			}
		}
		if ((this.casillas[0][0]) == (this.casillas[1][1]) && (this.casillas[0][0]) == (this.casillas[2][2])
				&& (this.casillas[1][1]) != '-') {
			System.out.println("　HAY TRES EN RAYA!!");
			this.mostrar();
			return true;
		}
		if ((this.casillas[0][2]) == (this.casillas[1][1]) && (this.casillas[0][2]) == (this.casillas[2][0])
				&& (this.casillas[0][2]) != '-') {
			System.out.println("　HAY TRES EN RAYA!!");
			this.mostrar();
			return true;
		}
		return false;
	}

}
