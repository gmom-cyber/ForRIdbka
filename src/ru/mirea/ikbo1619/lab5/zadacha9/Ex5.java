package ru.mirea.ikbo1619.lab5.zadacha9;

public class Ex5 {

        public void getDetails(String key) {

                if(key == null) {
                    try {
                    throw new NullPointerException( "null key in getDetails" );
                }catch (NullPointerException e) {
                        System.out.println("null key in getDetails" );
                    }

                }
            // do something with the key
        }


}
