public class Cube {
    private Facet[] facets;
    public Cube() {
        //грани описываем в любом порядке
        //точки берем в любом порядке, НО по часовой стрелке лицевой стороной
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0), new R3Vector(0,1,0));
        facets[1] = new Facet(new R3Vector(0,0,1), new R3Vector(1,0,1), new R3Vector(1,0,0), new R3Vector(0,0,0));
        facets[2] = new Facet(new R3Vector(0,1,0), new R3Vector(0,1,1), new R3Vector(0,0,1), new R3Vector(0,0,0));
        facets[3] = new Facet(new R3Vector(0,1,1), new R3Vector(1,1,1), new R3Vector(1,1,1), new R3Vector(0,0,1));
        facets[4] = new Facet(new R3Vector(0,1,0), new R3Vector(1,1,0), new R3Vector(1,1,1), new R3Vector(0,1,1));
        facets[5] = new Facet(new R3Vector(1,1,1), new R3Vector(1,1,0), new R3Vector(1,0,0), new R3Vector(1,0,1));
    }
}
