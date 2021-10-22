import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWord {


    private  String line;
    private int wordCount = 0;
    private int characterCount = 0;


    public String wordCount() {

        try {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\comparingfiles\\resultA.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) {
                    characterCount += line.length();
                    String words[] = line.split("\\s+");
                    wordCount += words.length;

                }


            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Total word count = "+ wordCount);
        return line;


    }


    public int getWordCount() {
        return wordCount;
    }



}

