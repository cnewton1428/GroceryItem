package com.company;

public class GroceryItem {
        private String name;
        private double price;
        private int quantity;

        public GroceryItem(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

    public GroceryItem() {


    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }



        public double getCost() {
            double cost = (price * quantity);
            return cost;
        }

    }

