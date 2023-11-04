package application;

import application.service.Operations;
import application.service.OperationsImpl;

import java.util.Scanner;

public class MainApp {
    private static final Operations operations = new OperationsImpl();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT OPERATION !!");
        System.out.println("1. FIND PART BY ID ");
        System.out.println("2. NUMBER OF PARTS GREATER THEN AVERAGE PART PRICE ");
        int ch = sc.nextInt() ;
       if (ch ==1 )
       {
           System.out.println("ENTER PART ID :- ");
           Integer PartNumber = sc.nextInt();
           String output = operations.getInventoryLocationByPartNumber(PartNumber);
           System.out.println(output);
       } else if (ch == 2) {
           Integer output = operations.getNumberOfPartsGreaterThanAveragePartPrice();
           System.out.println(output);
       }else{
           System.out.println("INVALID CHOICE !!");
       }
    }
}
