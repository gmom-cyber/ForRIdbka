package ru.mirea.ikbo1619.lab5.zadacha9;

import java.util.Scanner;

public class Ex7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            try {
                throw new Exception("Key set to empty string");
            }catch (Exception r)
            {
                return "Key set to empty string";
            }
        }
        return "data for " + key;
    }
}

