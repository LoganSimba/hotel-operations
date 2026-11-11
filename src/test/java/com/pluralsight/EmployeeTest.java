package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test//testing the checkIn method by calculating time card
    void punchIn_should_Get_theTime_by_calculating_the_time_card() {

        //Arrange
        Employee employee = new Employee();
        employee.punchOut(17);

        //act
        employee.punchIn(9);

        //assert
        assertEquals(8, employee.punchTimeCard());
    }
}