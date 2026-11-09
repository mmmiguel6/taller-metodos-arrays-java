int horasCobradas(int minutos) {
    int horas = minutos / 60;
    if (minutos % 60 > 0) {
        horas++;
    }
    return horas;
}

int cobrar(int minutos) {
    return horasCobradas(minutos) * 3000;
}

void main() {
    int min = Integer.parseInt(IO.readln("Minutos: "));
    int horas = horasCobradas(min);
    int pago = cobrar(min);
    IO.println("Horas: " + horas + " · Pagar: $" + pago);
}
