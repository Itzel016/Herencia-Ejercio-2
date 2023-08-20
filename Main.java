public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Aragorn", 10, "Guerrero");
        Enemigo enemigo1 = new Enemigo("Esqueleto Oscuro", 5, "Esqueleto");

        jugador1.atacar();
        jugador1.usarHabilidadEspecial();

        enemigo1.atacar();
        enemigo1.gritar();
    }
}



