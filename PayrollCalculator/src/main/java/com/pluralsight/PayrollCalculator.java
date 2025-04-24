package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name of the file employee file to process: ");
            String importFile = scanner.nextLine();

            System.out.println("Enter the name of the payroll file to create: ");
            String exportFile = scanner.nextLine();

            FileReader fileReader = new FileReader(importFile);
            BufferedReader bufReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(exportFile);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            // Skip header row
            bufReader.readLine();

            String line;

            while ((line = bufReader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0].trim());
                String name = tokens[1].trim();
                double hours = Double.parseDouble(tokens[2].trim());
                double rate = Double.parseDouble(tokens[3].trim());

                Employee employee = new Employee(id, name, hours, rate);

                String outputLine = String.format("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());

                bufWriter.write(outputLine);
            }

            bufReader.close();
            bufWriter.close();

            System.out.println("File created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}