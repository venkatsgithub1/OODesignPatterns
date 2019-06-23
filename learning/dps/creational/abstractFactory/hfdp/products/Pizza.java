package learning.dps.creational.abstractFactory.hfdp.products;

public abstract class Pizza {

    String name;
    Sauce sauce;
    Clam clam;
    Cheese cheese;
    Pepperoni pepperoni;
    Veggies[] veggies;
    Dough dough;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking at 350 for 20 minutes");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal pieces");
    }

    public void box() {
        System.out.println("Packaging the pizza");
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();

        result.append(name + "\n");
        if (dough != null) {
            result.append(dough.toString() + "\n");
        }
        if (sauce != null) {
            result.append(sauce.toString() + "\n");
        }
        if (clam != null) {
            result.append(clam.toString() + "\n");
        }
        if (cheese != null) {
            result.append(cheese.toString() + "\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(",");
                }
            }
            result.append("\n");
        }

        if (pepperoni != null) {
            result.append(pepperoni.toString() + "\n");
        }

        return result.toString();
    }

    public void setName(String name) {
        this.name = name;
    }
}
