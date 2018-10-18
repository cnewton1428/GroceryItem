package com.company;
	import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

        public class Main {
            public static void main (String[] args){


                Scanner sc=new Scanner(System.in);
                String mygrocerylist = "";
                Random rn=new Random();
                ArrayList <GroceryItem>groceryList = new ArrayList<>();

                do {

                    System.out.println("enter the item name");
                    String userInputItemName = sc.next();

                    System.out.println("enter the price");
                    double userInputPrice = sc.nextDouble();

                    // System.out.println("enter the quantity purchase");
                    int userInputQuantity = rn.nextInt(10);

                    groceryList.add(new GroceryItem(userInputItemName, userInputPrice, userInputQuantity));

                    System.out.println("would you like enter more Item Y(yes) or N(no");
                    mygrocerylist = sc.next();

                }while (!mygrocerylist.equalsIgnoreCase("no"));


                System.out.println("Item Name"+"\t\t\t"+"Price"+"\t\t\t"+"Quantity"+"\t\t\t"+"Cost");

                double purchaseAmount = 0;

                for (GroceryItem newList : groceryList) {
                    System.out.println(newList.getName() + "\t\t\t\t" + newList.getPrice() + "\t\t\t" + newList.getQuantity() + "\t\t" + "\t" + newList.getCost());

                    purchaseAmount += newList.getCost();
                }

                System.out.println("Total Purchase Amount =" + purchaseAmount);
                System.out.println("Total Items Purchased:" + groceryList.size());

                if (purchaseAmount > 20){
                    System.out.println("You spent too much today");
                }
                else {
                    System.out.println("Thank you for shopping!");
                }


            }
        }
