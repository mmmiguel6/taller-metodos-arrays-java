void imprimirTicket(String cliente, int kilos) {
    IO.println("Cliente: " + cliente);
    IO.println("Kilos: " + kilos);
    IO.println("----------");
}

void main() {
    imprimirTicket("Ana", 6);
    imprimirTicket("Luis", 3);
}
