package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int punchIn;
    private int punchOut;

    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHours() * payRate * 1.5;

        return regularPay + overTimePay;
    }

    public double getRegularHours(){
        if(hoursWorked > 40){
            return 40;
        }
        return hoursWorked;
    }
    // calculate the overtime hours
    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
    }
    //method for punchIn
    public void punchIn(int time) {
            punchIn = time;

    }
    //method for punchout
    public void punchOut(int time) {
            punchOut = time;

    }
    //method for timecard
    public int punchTimeCard() {
        return punchOut - punchIn;
    }
    //overload method
    public void punchIn() {
        LocalTime time = LocalTime.now();
        punchIn(time.getHour());
    }
    //overload method
    public void punchOut() {
        LocalTime time = LocalTime.now();
        punchOut(time.getHour());
    }


}
