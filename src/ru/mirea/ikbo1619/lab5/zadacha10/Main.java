package ru.mirea.ikbo1619.lab5.zadacha10;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
/*ДЛЯ ЗАДАЧИ 2 и 3
    public static <E> void  print  (String s, E [] arr){ //Вывод на экран и хранение в классе массива любого типа

        E [] a = arr;
        zadacha2and3<E> sid = new zadacha2and3<E>();
        sid.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");

        System.out.println();

    }

 */
    public static void main(String[] args) throws IOException{
        /*    ЗАДАЧА 1
        Integer[] chisla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        zahacha1<Integer> listInt = new zahacha1<>(chisla);
        listInt.showList();

        String[] bukwi = {"a", "b", "c", "d", "e", "f"};
        zahacha1<String> listStr = new zahacha1<>(bukwi);
        listStr.showList();
         */
        /*    ЗАДАЧА 2 и 3

        String [] s = {"AAA", "BBB","CCC"};
        print("String",s);


        Integer [] intCisla = { 1,2,3,4,5,6,7,8};
        print("Int",intCisla);
        Long [] longChisla = {100l, 101l, 200l};
        print("Long",longChisla);
*/    /*  ЗАДАЧА 4
        String pathDir = "C:\\Users\\d-vi9\\OneDrive\\Desktop\\Практика по инфе\\Конфигур Управ\\Эмулятор мамонта";//Директория (папка) которую программа посмотрит
        String pathFile = "C:\\Users\\d-vi9\\OneDrive\\Desktop\\Практика по инфе\\Конфигур Управ\\Эмулятор мамонта\\file.txt";//Файл в который программа запишет первые 5 файлов из директории(папки) выше

        zadacha4 f = new zadacha4(pathDir);
        f.WriteToFileList(pathFile);
        f.ReadFile(pathFile, 5);
*/
    }
}
