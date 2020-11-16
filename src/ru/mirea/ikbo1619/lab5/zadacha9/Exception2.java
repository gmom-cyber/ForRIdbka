package ru.mirea.ikbo1619.lab5.zadacha9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {//Функция parseInt преобразует первый аргумент в число по указанному основанию
            // Qwerty не число Qwerty 0 1.2 1
        int i = Integer.parseInt(intString);

            System.out.println( 2 / i );
        }catch (NumberFormatException e){
            System.out.println("ERROR");
        }
    }
}
