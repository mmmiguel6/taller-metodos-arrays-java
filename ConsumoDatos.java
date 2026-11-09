void main() {
    String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun"};
    double[] gigas = {4.5, 7.2, 3.1, 9.8, 6.0, 5.4};
    int posMayor = 0;
    for (int i = 1; i < gigas.length; i++) {
        if (gigas[i] > gigas[posMayor]) {
            posMayor = i;
        }
    }
    IO.println(meses[posMayor] + " · " + gigas[posMayor] + " GB");
}
