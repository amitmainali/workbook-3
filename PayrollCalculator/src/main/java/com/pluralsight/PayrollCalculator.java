package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line = bufReader.readLine();

            while ((line = bufReader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0].trim());
                String name = tokens[1].trim();
                double hours = Double.parseDouble(tokens[2].trim());
                double rate = Double.parseDouble(tokens[3].trim());

                Employee employee = new Employee(id, name, hours, rate);

                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
            }

            bufReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}