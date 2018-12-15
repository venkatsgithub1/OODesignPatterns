package learning.ooprinciples.aggregation;

import java.util.ArrayList;

public class City {
    private Tree tree;
    private Park park;

    public City(Tree tree, Park park) {
        // tree and park objects will not be destroyed
        // if city object is destroyed.
        this.tree=tree;
        this.park=park;
    }
}
