package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;
    private LocalDateTime punchInTime;


    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularPay(){
        return getRegularHours() * payRate;
    }

    public double getOvertimePay(){
        return getOvertimeHours() * payRate * 1.5;
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;

    }

    public float getOvertimeHours(){
        return (hoursWorked > 40 ) ? hoursWorked - 40 : 0 ;
    }
    // method to punch in and get start time
    public void punchIn() {
        punchInTime = LocalDateTime.now(); // set the current time as punch in time with using LocalDatetime Utility
        System.out.println("punched in at" + punchInTime);// indicate when user punches in
    }

    public void punchOut() {
        if(punchInTime != null) {
            LocalDateTime punchOutTime =LocalDateTime.now();
            float hoursWorkedToday = (float) java.time.Duration.between(punchInTime,punchOutTime).toHours();
            hoursWorked += hoursWorkedToday;
            System.out.println(name + " punched out at " + punchOutTime + ", hours worked today: " + hoursWorkedToday);
            punchInTime = null; // Reset punch-in time after punching out
        } else {
            System.out.println(name + " has not punched in yet.");
        }


}
}