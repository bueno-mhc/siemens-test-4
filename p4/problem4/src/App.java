
import java.util.ArrayList;
import java.util.List;

import services.Files;
import services.LengthService;

public class App {
    public static void main(String[] args) throws Exception {
        //Read file for input words
        List<String> wordList = Files.readFile("./data/inputs.txt");
        //Iterate over wordList to find length
        List<Integer> lengthList = new ArrayList<>();
        for(String str:wordList) {
            int lengthStr = LengthService.strLength(str);
            System.out.printf("%s - %d%n",str,lengthStr);
            lengthList.add(lengthStr);
        }
        //Save output file
        Files.saveFile("./data/ouputs.txt", lengthList);
    }
}
