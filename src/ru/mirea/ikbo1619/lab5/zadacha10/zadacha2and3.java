package ru.mirea.ikbo1619.lab5.zadacha10;

public class zadacha2and3<E> {

    private E [] arr;


    public E getArrIndex(int i){ //Возвращает элемент по индексу
        return  arr[i] ;
    }

    public void setArr( E [] arr){
        this.arr =  arr;
    }

    public int getLength(){
        return  arr.length ;
    }

}
