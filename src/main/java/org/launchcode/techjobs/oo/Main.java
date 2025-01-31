package org.launchcode.techjobs.oo;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
             Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        Job job4 = new Job("Groundskeeper", new Employer("StLouisCardinals"), new Location("St. Louis"),new PositionType("full time"), new CoreCompetency("Knowledge") );
        Job job5 = new Job("Brisket aficianado", new Employer(null), new Location(""), new PositionType("Sauce King"), new CoreCompetency("Staying Up All Night"));
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);
        for (Job job : jobs){
            System.out.println(job);
        }
        //System.out.println(job1);
    }



}
