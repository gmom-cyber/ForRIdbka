package ru.mirea.ikbo1619.lab5.zadacha9;

import java.util.Scanner;

public class Ex8 {
    public void getKey() {
        boolean ex = true;
        while (ex) {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                ex = false;
            } catch (Exception m) {
                System.out.println("try again ");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
