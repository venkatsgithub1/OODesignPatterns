package learning.ooprinciples.composition.personExample;

public class Person {
    String name;
    Long age;
    private Hands hands;

    public Person() {
        // life span of hands is valid only inside Person object.
        hands = new Hands();
    }
}
