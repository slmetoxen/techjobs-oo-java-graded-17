package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();//int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){

        Job testData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testData.getName() instanceof String);
        assertEquals(testData.getName(), "Product tester");

        assertTrue(testData.getEmployer() instanceof Employer);
        assertEquals(testData.getEmployer().getValue(), "ACME");

        assertTrue(testData.getLocation() instanceof Location);
        assertEquals(testData.getLocation().getValue(), "Desert");

        assertTrue(testData.getPositionType() instanceof PositionType);
        assertEquals(testData.getPositionType().getValue(), "Quality control");

        assertTrue(testData.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testData.getCoreCompetency().getValue(), "Persistence");

    }
    @Test
    public void testJobsForEquality(){
        Job testId1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testId2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testId1.getId(), testId2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringValue = test.toString();

        //assertTrue(toStringValue.startsWith(System.lineSeparator()));
        //assertTrue(toStringValue.endsWith(System.lineSeparator()));
        assertEquals(System.lineSeparator()+ toStringValue + System.lineSeparator(), System.lineSeparator() + test + System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringValue = testJob.toString(); //assertEquals(testJob.toString(), String.valueOf(testJob);
        assertEquals(System.lineSeparator()+ toStringValue + System.lineSeparator(), System.lineSeparator() + testJob + System.lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job emptyEmployerValue = new Job ("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringValue = emptyEmployerValue.toString();
        assertEquals(System.lineSeparator()+ toStringValue + System.lineSeparator(), System.lineSeparator() + emptyEmployerValue + System.lineSeparator());

    }


}
//    public void testToStringHandlesEmptyField() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Jobjob = createJob("Web Developer", "", "StL", "", "Java");
//        String jobString = getJobString(job);
//        assertEquals(jobString, job.toString());
//    }


