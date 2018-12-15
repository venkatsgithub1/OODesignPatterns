package learning.ooprinciples.composition.personExample;

public class Hands {
    private Fingers fingers;

    public Hands() {
        // life span of fingers is valid only inside Hands object.
        this.fingers = new Fingers();
    }
}
