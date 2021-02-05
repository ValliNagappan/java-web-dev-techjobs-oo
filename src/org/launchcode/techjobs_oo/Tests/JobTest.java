package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job myJob1;
    Job myJob2;
    Job myJob3;
    Job myJob4;
    Job myJob5;

    @Before
    public void  beforeTests(){
        myJob1 = new Job();
        myJob2 = new Job();
        myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        myJob4 = new Job("Product tester", new Employer("ACME"), new Location("Denver"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        myJob5 = new Job("Product tester", new Employer("ACME"), new Location("Denver"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(myJob2.getId(), myJob1.getId(), 1);
        assertTrue(myJob1.getId()!= myJob2.getId());
        assertFalse(myJob1.getId() == myJob2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){

        assertEquals("Product tester", myJob3.getName());
        assertTrue(myJob3.getEmployer() instanceof Employer);
        assertTrue(myJob3.getLocation() instanceof Location);
        assertTrue(myJob3.getPositionType() instanceof PositionType);
        assertTrue(myJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(myJob3.getEmployer().getValue(), "ACME");
        assertEquals(myJob3.getLocation().getValue(), "Desert");
        assertEquals(myJob3.getPositionType().getValue(), "Quality control");
        assertEquals(myJob3.getCoreCompetency().getValue(),"Persistence");

    }
    @Test
    public void testJobsForEquality(){

        //assertEquals(myJob4.getEmployer().getValue(),myJob5.getEmployer().getValue());
        //comparing whole job4 with job5
        assertFalse(myJob4.equals(myJob5));
    }

    @Test
    public void TestForToString(){

        assertEquals("\n ID:"+ 3 +"\n Name:"+"Product tester" + "\n Employer:"+"ACME"+"\n Location:"+"Denver"+"\n Position Type:"+"Quality control"+"\n Core Competency:"+"Persistence", myJob4.toString());
    }
    @Test
    public void TestForLabel(){

        String output = "\n ID:" + myJob3.getId() + "\n Name:" + myJob3.getName()  + "\n Employer:" + myJob3.getEmployer() + "\n Location:" + myJob3.getLocation() + "\n Position Type:" + myJob3.getPositionType() + "\n Core Competency:" + myJob3.getCoreCompetency() ;
        assertEquals(output,myJob3.toString());

    }
    @Test
    public void TestForFieldEmpty(){
        Job myJob6 = new Job("Java Devloper", new Employer(""), new Location("Houston"), new PositionType("Devloper"), new CoreCompetency("Persistent"));
        //assertEquals("Data not available", myJob6.toString());
        String output = "\n ID:" + myJob6.getId() + "\n Name:" + myJob6.getName()  + "\n Employer: Data not available" + "\n Location:" + myJob6.getLocation() + "\n Position Type:" + myJob6.getPositionType() + "\n Core Competency:" + myJob6.getCoreCompetency() ;
        System.out.println(myJob6.toString());
        //System.out.println(output);
        assertEquals(output,myJob6.toString());
    }

}
