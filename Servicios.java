String[] servicios = {"Lavado", "Secado", "Planchado", "Tintoreria"};
int[] precios = {8000, 5000, 6000, 15000};

int buscar(String servicio) {
    for (int i = 0; i < servicios.length; i++) {
        if (servicios[i].equals(servicio)) {
            return i;
        }
    }
    return -1;
}

void main() {
    String pedido = IO.readln("Servicio: ");
    int pos = buscar(pedido);
    if (pos != -1) {
        IO.println(pedido + ": $" + precios[pos]);
    } else {
        IO.println("No existe");
    }
}
