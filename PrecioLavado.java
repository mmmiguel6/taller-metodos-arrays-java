final int PRECIO_KILO = 4500;

int calcularPrecio(int kilos) {
    int precio = kilos * PRECIO_KILO;
    if (kilos > 10) {
        precio = (int) (precio * 0.9);
    }
    return precio;
}

void main() {
    int kilos = Integer.parseInt(IO.readln("Kilos: "));
    int precio = calcularPrecio(kilos);
    IO.println("A pagar: $" + precio);
}
