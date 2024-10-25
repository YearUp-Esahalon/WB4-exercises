package com.pluralsight;

public class NameFormatter {

    // create an empty constructor to prevent making instances of this class
    private NameFormatter() {

    }

// method to format a name with first name and last name
    public static String format(String firstName, String lastName) {
        // return a formatted name
        return firstName + " " + lastName;
    }

    // method to format a name with prefix, first name, middle name, and last name
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
      // make the full name using the parameters
      return prefix + " " + firstName + " " + middleName + " " + lastName + " " + suffix;
    }
}
