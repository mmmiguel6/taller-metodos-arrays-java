void main() {
    String[] clientes = {"Ana", "Leo", "Sara", "Tom", "Eva"};
    String buscado = IO.readln("Cliente: ");
    int pos = -1;
    for (int i = 0; i < clientes.length; i++) {
        if (clientes[i].equals(buscado)) {
            pos = i;
            break;
        }
    }
    if (pos != -1) {
        IO.println("Encontrado en la posición " + pos);
    } else {
        IO.println("No es cliente");
    }
}
