double promedio(double[] notas) {
    double suma = 0;
    for (int i = 0; i < notas.length; i++) {
        suma += notas[i];
    }
    return suma / notas.length;
}

void main() {
    double[] corte1 = {3.5, 4.0, 2.8, 4.5};
    double[] corte2 = {4.0, 3.5, 4.5};
    IO.println("Promedio corte 1: " + promedio(corte1));
    IO.println("Promedio corte 2: " + promedio(corte2));
}
