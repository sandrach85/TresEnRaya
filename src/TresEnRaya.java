public class TresEnRaya {
    private Tablero tablero;

    private StartController start;

    private Turno turno;

    public TresEnRaya() {
        tablero = new Tablero();
        turno = new Turno();
        start = new StartController();
    }

    public void Jugar() {
        do {
            tablero.mostrar();
            if (tablero.completo()) {
                start.getPutMoveControllers()[turno.toca()].put(tablero);
            } else {
                start.getMoveControllers()[turno.toca()].move(tablero);
            }
            turno.cambiar();
        } while (!tablero.HayTresEnRaya());
    }

    public static void main(String[] args) {
        new TresEnRaya().Jugar();
    }
}
