package learning.solid.dependencyInversion.badExample;

public class Project {
    private BackendDeveloper be = new BackendDeveloper();
    private FrontendDeveloper fe = new FrontendDeveloper();

    public void implement() {
        be.writeInJava();
        fe.writeInJavascript();
    }

    /*
        The Project class is a high-level module,
        and it depends on low-level modules such
        as BackEndDeveloper and FrontEndDeveloper.
        We are actually violating the first part of
        the dependency inversion principle.


    */
}
