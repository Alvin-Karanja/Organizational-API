package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeesTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void EmployeesInstantiatesCorrectlyReturns_true() throws Exception{
        Employees employees = setUpEmployees();
        assertTrue(employees instanceof Employees);
    }

    @Test
    public void setEmployeesId() throws Exception {
        Employees employees = setUpEmployees();
        employees.setId(4);
        assertNotEquals(2,employees.getId());
    }

    @Test
    public void EmployeesInstantiatesCorrectlyWithCorrect_Values()throws Exception{
        Employees employees= setUpEmployees();
        assertEquals("Mark",employees.getEmp_name());
        assertEquals("Badge 1234",employees.getEmp_details());
        assertEquals("MD",employees.getEmp_position());
        assertEquals("Directs",employees.getEmp_role());
    }

    public Employees setUpEmployees() {
        return new Employees("Mark", "Badge 1234", "Directs", "MD");
    }
}
