package services;

public class LengthService {
    public static int strLength(String str) {
        // Convert string to char array
        char[] charArray = str.toCharArray();
        // Itera over char array for counting
        int size = 0;
        for (char ch : charArray)
            size++;
        //Return value
        return size;
    }
}
