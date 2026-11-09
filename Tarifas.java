void aumentar(int[] tarifas, double porcentaje) {
    for (int i = 0; i < tarifas.length; i++) {
        tarifas[i] = (int) (tarifas[i] * (1 + porcentaje / 100));
    }
}

void main() {
    int[] planes = {30000, 45000, 60000};
    aumentar(planes, 10);
    for (int plan : planes) {
        IO.println(plan);
    }
}
