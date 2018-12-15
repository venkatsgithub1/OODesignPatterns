package learning.solid.dependencyInversion.goodExample;

public class BackendDeveloper implements Developer {
    private void writeInJava() {
        System.out.println("writing code in Java.");
    }

    @Override
    public void develop() {
        writeInJava();
    }
}
