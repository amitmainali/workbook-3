package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SearchInventory {

    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim());

                Product product = new Product(id, name, price);
                inventory.add(product);
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("Store Inventory:");
        System.out.println("-------------------------------");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Price: $" + p.getPrice());
            System.out.println();
        }
    }
}