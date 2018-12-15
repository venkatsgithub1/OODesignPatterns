package learning.ooprinciples.composition;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Job job = new Job();

        job.setRole("Accountant");
        job.setId(1);
        job.setSalary(10000);

        // person has a job.
        person.setJob(job);

        System.out.println(person);
    }
}
