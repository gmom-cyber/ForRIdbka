package ru.mirea.ikbo1619.lab5.zadacha9;

public class ExFromListing5 {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            }catch (NullPointerException n)
            {
                return "null key in getDetails";
            }
        }
        return "data for" + key; }

}
