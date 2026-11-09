void main() {
    int[] stock = new int[5];
    for (int i = 0; i < stock.length; i++) {
        stock[i] = Integer.parseInt(IO.readln("Producto " + (i + 1) + ": "));
    }
    for (int i = 0; i < stock.length; i++) {
        if (stock[i] < 5) {
            IO.println("Pedir producto " + (i + 1));
        }
    }
}
