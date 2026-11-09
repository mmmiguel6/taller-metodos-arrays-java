String[] jugadores = {"Zeus", "Luna", "Toro", "Kira"};
int[] puntos = {1200, 1850, 990, 1640};

int total(int[] p) {
    int suma = 0;
    for (int i = 0; i < p.length; i++) {
        suma += p[i];
    }
    return suma;
}

int posGanador(int[] p) {
    int posMayor = 0;
    for (int i = 1; i < p.length; i++) {
        if (p[i] > p[posMayor]) {
            posMayor = i;
        }
    }
    return posMayor;
}

void main() {
    int tot = total(puntos);
    double promedio = (double) tot / puntos.length;
    int pos = posGanador(puntos);
    IO.println("Total: " + tot);
    IO.println("Promedio: " + promedio);
    IO.println("Ganador: " + jugadores[pos] + " (" + puntos[pos] + ")");
}
