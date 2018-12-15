package learning.solid.dependencyInversion.goodExample;

public class FrontendDeveloper implements Developer {
    private void writeInJavascript() {
        System.out.println("coding in javascript");
    }

    @Override
    public void develop() {
        writeInJavascript();
    }
}
