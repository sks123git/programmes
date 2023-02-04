package com.employee;

public class EmployeeBuilderUsingSwitchCase {
    public static final int IS_FULL_TIME = 1;//constants
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        //Variables
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        switch (empCheck) { //checking if part time
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME: //checking if full time or not
            empHrs = 8;
            break;
            default:
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empWage);
    }
}
