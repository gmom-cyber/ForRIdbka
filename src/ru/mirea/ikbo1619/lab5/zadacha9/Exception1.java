package ru.mirea.ikbo1619.lab5.zadacha9;

public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Идет деление на ноль");
        }

    }
}
