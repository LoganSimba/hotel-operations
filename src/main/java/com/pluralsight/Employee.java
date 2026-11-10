package com.pluralsight;

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

    public void punchIn(int time) {
            punchIn = time;

    }

    public void punchOut(int time) {
            punchOut = time;

    }

    public int punchTimeCard() {
        return punchOut - punchIn;
    }

}
