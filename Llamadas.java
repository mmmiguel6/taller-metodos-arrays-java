int costoLlamada(int minutos, boolean internacional) {
    int tarifa = 150;
    if (internacional) {
        tarifa = 900;
    }
    return minutos * tarifa;
}

void main() {
    int nac = costoLlamada(10, false);
    int inter = costoLlamada(5, true);
    IO.println(nac);
    IO.println(inter);
    IO.println(nac + inter);
}
