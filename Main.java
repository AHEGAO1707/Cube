public class Main {
    public static void main(String[] args) {
        R3Vector a = new R3Vector(0, 0, 0);
        R3Vector b = new R3Vector(1, 0, 0);
        R3Vector c = new R3Vector(1, 1, 0);
        R3Vector d = new R3Vector(0, 1, 0);
//        slozheniye(a, b);
//        vichitaniye(a, b);
//        nachislo(a);
//        skalyarnoe(a, b);
//        vectornoye(a, b);
//        smeshannoye(a, b, c);
        Facet gran = new Facet(a, b, c, d);
        gran.print(a, b, c, d);
    }
}
