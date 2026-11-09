void main() {
    int[] ventas = {120, 95, 140, 80, 160, 210, 0};
    int total = 0;
    for (int i = 0; i < ventas.length; i++) {
        total = total + ventas[i];
    }
    double promedio = (double) total / ventas.length;
    IO.println("Total: " + total);
    IO.println("Promedio: " + promedio);
}
