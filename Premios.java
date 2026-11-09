void main() {
    int[] puntajes = {850, 1200, 990, 1500, 400, 1000, 1350};
    int conPremio = 0;
    for (int p : puntajes) {
        if (p >= 1000) {
            conPremio++;
        }
    }
    IO.println(conPremio + " jugadores con premio");
}
