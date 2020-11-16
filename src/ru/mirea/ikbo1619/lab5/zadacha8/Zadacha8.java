package ru.mirea.ikbo1619.lab5.zadacha8;
import java.io.*;

public class Zadacha8 {

    public static void main(String[] args) {
        //Тут нужно указать полный путь до файла, который нужно прочитать
        try (FileReader reader = new FileReader("C:\\Users\\d-vi9\\IdeaProjects\\ForRIdbka\\src\\ru\\mirea\\ikbo1619\\lab5\\zadacha8\\file8.txt")) {

            int c;
            while ((c = reader.read()) != -1) {
            System.out.print((char)c);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}