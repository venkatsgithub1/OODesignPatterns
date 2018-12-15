package learning.solid.dependencyInversion.goodExample;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(new FrontendDeveloper());
        developers.add(new BackendDeveloper());
        Project project = new Project(developers);
        project.implement();
    }
}
