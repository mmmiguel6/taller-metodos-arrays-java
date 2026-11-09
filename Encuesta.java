void main() {
    int[] votos = {5, 4, 5, 3, 1, 5, 4, 2, 5, 4};
    int[] conteo = new int[6];
    for (int v : votos) {
        conteo[v]++;
    }
    for (int e = 5; e >= 1; e--) {
        IO.println(e + ": " + "#".repeat(conteo[e]));
    }
}
