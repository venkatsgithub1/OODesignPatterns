package learning.solid.dependencyInversion.goodExample;

import java.util.List;

public class Project {
    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(developer -> developer.develop());
    }

    /*
        The code doesn't directly depend on the lower modules, but
        uses interface to work.
     */
}
