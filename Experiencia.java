int calcularXP(int enemigos, int monedas) {
    return enemigos * 50 + monedas * 10;
}

String rango(int xp) {
    if (xp >= 1000) {
        return "Leyenda";
    } else if (xp >= 500) {
        return "Guerrero";
    } else {
        return "Novato";
    }
}

void main() {
    int xp = calcularXP(12, 30);
    IO.println(xp + " XP · " + rango(xp));
}
