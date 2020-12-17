package services;

import java.io.*;
import java.util.*;

public class Files {
    public static List<String> readFile(String filePath) {
        // Files output lines
        List<String> fileLines = new ArrayList<>();
        // Try reading TXT file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Iterate over TXT and read lines and save to list
            String line;
            while ((line = br.readLine()) != null)
                fileLines.add(line);
        } catch (FileNotFoundException ex) {
            // FileNotFoundException treatment
            System.out.printf("File no found in path '%s'.%n", filePath);
            System.out.println(ex);
        } catch (IOException ex) {
            // IOException treatment
            System.out.println(ex);
        }
        return fileLines;
    }

    public static void saveFile(String filePath, List<Integer> lengths) {
        try (PrintWriter outputFile = new PrintWriter(filePath)) {
            // Print to output file
            for (Integer i : lengths)
                outputFile.println(i);
        } catch (FileNotFoundException ex) {
            // FileNotFoundException treatment
            System.out.println(ex);
        }
    }
}
