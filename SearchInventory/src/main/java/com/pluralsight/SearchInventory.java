package com.pluralsight;

import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = Product.getInventory();

        System.out.println("Store Inventory:");
        System.out.println("-------------------------------");

        for (Product p : inventory) {
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Price: $" + p.getPrice());
            System.out.println();
        }
    }
}