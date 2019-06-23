package learning.dps.creational.builder.geeksForGeeksExample.housePlan;

public class House implements HousePlan {

    private String basement;
    private String structure;
    private String roof;
    private String interior;

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setRood(String roof) {
        this.roof = roof;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "[Basement is made of: " + basement + ", structure is made of: " + structure + ", roof is made of: " + roof + ", interior is made of: " + interior + "]";
    }
}
