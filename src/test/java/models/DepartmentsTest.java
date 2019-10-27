package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getDepartmentNameReturnsCorrectName() throws Exception {
        Departments testDepartments = setUpDepartments();
        assertEquals("Fire Department", testDepartments.getDpt_name());
    }

    public Departments setUpDepartments() {
        return new Departments("Fire Department", "Responsible for fire issues", 12);
    }

    @Test
    public void getDepartmentDescriptionReturnsCorrectDescription() throws Exception {
        Departments testDepartments = setUpDepartments();
        assertEquals("Responsible for fire issues", testDepartments.getDpt_description());
    }

    @Test
    public void getDepartmentEmployeesNumbersReturnsCorrectDescription() throws Exception {
        Departments testDepartments = setupDepartments();
        assertEquals(12, testDepartments.getDpt_empNo());
    }
    @Test
    public void setEmployeesNumberCorrectNumber(){
        Departments testDepartments = setupDepartments();
        testDepartments.setDpt_empNo(12);
        assertNotEquals(10, testDepartments.getDpt_empNo());

    }
    @Test
    public void setDptNameCorrectName(){
        Departments testDepartments = setupDepartments();
        testDepartments.setDpt_name("Fire Department");
        assertNotEquals("Water Department", testDepartments.getDpt_name());

    }
}
