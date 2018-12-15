package learning.solid.dependencyInversion.badExample;

public class Test {
    public static void main(String[] args) {
        Project project = new Project();
        project.implement();
    }
}
