package org.launchcode.techjobs.oo;
import org.junit.Test;
import org.testng.AssertJUnit;

import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job test1 = new Job();
        Job test2 = new Job();
        assertFalse(test1.getId() == test2.getId());
    }
@Test
    public void testJobConstructorSetsAllFields(){
        Job test3 = new Job("Product Tester", new Employer("ACME"),new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test3.getName(),"Product Tester");
        assertTrue(test3.getEmployer() instanceof Employer);
       assertTrue(test3.getLocation() instanceof Location);
       assertTrue(test3.getPositionType() instanceof PositionType);
       assertTrue(test3.getCoreCompetency() instanceof CoreCompetency);

}


    }


