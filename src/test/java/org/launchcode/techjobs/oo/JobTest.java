package org.launchcode.techjobs.oo;
import org.junit.Test;
import org.testng.AssertJUnit;
//import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job test1 = new Job();
        Job test2 = new Job();
        assertFalse(test1.getId() == test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test3.getName(), "Product Tester");
        assertTrue("test instance of job", test3 instanceof Job);
        String expected = "ACME";
        String actual = String.valueOf(test3.getEmployer());
        assertEquals("testing Employer values", expected, actual);
        assertTrue(test3.getEmployer() instanceof Employer);
    }



    @Test
    public void testJobConstructorLocation() {
        Job test5 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedLocation = "Desert";
        String actualLocation = String.valueOf(test5.getLocation());
        assertEquals("testing object location", expectedLocation, actualLocation);
        assertTrue(test5.getLocation() instanceof Location);
    }

    @Test
    public void testJobConstructorPositionType() {
        Job test6 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedPositionType = "Quality control";
        String actualPositionType = String.valueOf(test6.getPositionType());
        assertEquals("testing position type value", expectedPositionType, actualPositionType);
        assertTrue(test6.getPositionType() instanceof PositionType);
    }

    @Test
    public void testJobConstructorCoreCompetency() {
        Job test7 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedCoreCompetency = "Persistence";
        String actualCoreCompetency = String.valueOf(test7.getCoreCompetency());
        assertEquals(("testing core competency"), expectedCoreCompetency, actualCoreCompetency);
        assertTrue(test7.getCoreCompetency() instanceof CoreCompetency);
    }


    @Test
    public void testJobsForEquality() {
        String msg = "Testing equals method with different ID's";
        Job test8 = new Job("Mower", new Employer("Cardinals"), new Location("Saint Louis"), new PositionType("Full Time"),
                new CoreCompetency("Turf"));
        Job test9 = new Job("Mower", new Employer("Cardinals"), new Location("Saint Louis"), new PositionType("Full Time"),
                new CoreCompetency("Turf"));
        boolean condition = test8.equals(test9);
        assertFalse("do Id's match",condition);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String newLine = System.lineSeparator();
        Job stringTest = new Job("Mower", new Employer("Cardinals"), new Location("Saint Louis"), new PositionType("Full Time"),
                new CoreCompetency("Turf"));

        String toStringExpected = newLine +
                "ID: " + stringTest.getId() + newLine +
                "Name: " + stringTest.getName() + newLine +
                "Employer: " + stringTest.getEmployer() + newLine +
                "Location: " + stringTest.getLocation() + newLine +
                "Position Type: " + stringTest.getPositionType() + newLine +
                "Core Competency: " + stringTest.getCoreCompetency() + newLine;
        String toStringActual = stringTest.toString();
        assertEquals("Test spaces before and after",toStringExpected,toStringActual);
        System.out.println(stringTest);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String newLine = System.lineSeparator();
        Job stringTest = new Job("Mower", new Employer("Cardinals"), new Location("Saint Louis"), new PositionType("Full Time"),
                new CoreCompetency("Turf"));
        String toStringExpected = newLine +
                "ID: " + stringTest.getId() + newLine +
                "Name: " + stringTest.getName() + newLine +
                "Employer: " + stringTest.getEmployer() + newLine +
                "Location: " + stringTest.getLocation() + newLine +
                "Position Type: " + stringTest.getPositionType() + newLine +
                "Core Competency: " + stringTest.getCoreCompetency() + newLine;
        String toStringActual = String.valueOf(stringTest);
        assertEquals("test fields and values",toStringExpected,toStringActual);
    }


}

