package learning.ooprinciples.composition;

public class Person {
    // Person has a job, this is composition.
    private Job job;

    public Person() {
        this.job = new Job();
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return this.job.toString();
    }
}
