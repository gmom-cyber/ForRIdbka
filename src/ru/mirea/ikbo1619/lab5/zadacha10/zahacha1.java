package ru.mirea.ikbo1619.lab5.zadacha10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ЗАДАЧА 1

    public class zahacha1<E> {

        private List<E> list = new ArrayList<>();

        public zahacha1(E[] array) {
            list.addAll(Arrays.asList(array));
        }

        public void showList() {
            for (Object ls : list) {
                System.out.print(ls + " ");
            }
            System.out.println();
        }

        public void add(E element) {
            list.add(element);
        }

        public List getList() {
            return list;
        }
    }

