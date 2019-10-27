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
}
