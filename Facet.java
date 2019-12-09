public class Facet {
        private R3Vector[] vertex = new R3Vector[4];
        //Color color;
        public Facet(R3Vector a, R3Vector b, R3Vector c, R3Vector d) {
            //vertex{a, b, c, d};
            vertex[0] = a;
            vertex[1] = b;
            vertex[2] = c;
            vertex[3] = d;
        }
        public void print(R3Vector a, R3Vector b, R3Vector c, R3Vector d) {
            //рисуем против часовой стрелки
            System.out.print("Первое ребро равно => ( " + a.x + ", " + a.y + ", " + a.z + " ) --- ");
            System.out.println("( " + b.x + ", " + b.y + ", " + b.z + " )");
            System.out.print("Второе ребро равно => ( " + b.x + ", " + b.y + ", " + b.z + " ) --- ");
            System.out.println("( " + c.x + ", " + c.y + ", " + c.z + " )");
            System.out.print("Третье ребро равно => ( " + c.x + ", " + c.y + ", " + c.z + " ) --- ");
            System.out.println("( " + d.x + ", " + d.y + ", " + d.z + " )");
            System.out.print("Четвертое равно => ( " + d.x + ", " + d.y + ", " + d.z + " ) --- ");
            System.out.println("( " + a.x + ", " + a.y + ", " + a.z + " )");
        }
//        public void rotatealfa(double alfax, double alfay, double alfaz) {
//            vertex[0].rotate(alfax, alfay, alfaz);
//            vertex[1].rotate(alfax, alfay, alfaz);
//            vertex[2].rotate(alfax, alfay, alfaz);
//            vertex[3].rotate(alfax, alfay, alfaz);
//        }
}
