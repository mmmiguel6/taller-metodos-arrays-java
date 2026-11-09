void main() {
    String[] canciones = {"Intro", "Sol", "Ruta", "Final"};
    for (int i = 0; i < canciones.length; i++) {
        IO.println((i + 1) + ". " + canciones[i]);
    }
    IO.println("Total: " + canciones.length + " canciones");
}
