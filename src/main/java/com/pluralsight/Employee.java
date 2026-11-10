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
            hoursWorked = 40;
        }
        return hoursWorked;
    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            hoursWorked = hoursWorked - 40;
            return hoursWorked;
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
//    //method for timecard
//    public int punchTimeCard() {
//        return punchOut - punchIn;
//    }
//
//    public int punchIn() {
//        LocalTime time = LocalTime.now();
//        return time.getHour
//    }
//
//    public int punchOut() {
//        LocalTime time = LocalTime.now();
//        return punchOut(time.getHour(), time.getMinute());
//    }



}
