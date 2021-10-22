

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;

public class CompareTwoFiles {
    public static void main(String[] args)   throws IOException{



        try(
                FileInputStream  file1= new FileInputStream("C:\\Users\\HP\\IdeaProjects\\comparingfiles\\resultA.txt");
                FileInputStream  file2= new FileInputStream("C:\\Users\\HP\\IdeaProjects\\comparingfiles\\resultB.txt");
        ) {

            int i = 0;
            int j = 0;

            while(i != -1 && j != -1) {

                i = file1.read();
                j = file2.read();

                if(i != j)
                    break;

            }

            if(i != j)
                System.out.println("Files are different");
            else
                System.out.println("files are same");


//			    FileInputStream fileInputStream = new FileInputStream("D:\\miscellanous\\compareA.txt");
//		        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//		        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


//			  String line;
//			  int wordCount = 0;
//			  int characterCount = 0;
//
//			  while ((line = bufferedReader.readLine()) != null) {
//		            if (!line.equals("")) {
//		            	 characterCount += line.length();
//			                String words[] = line.split("\\s+");
//			                wordCount += words.length;
//
//
//		            }
//
//		        }
//
//			  System.out.println("Total word count = "+ wordCount);


            CountWord countword = new CountWord();
            countword.wordCount();


            JSONObject jsonObject = new JSONObject();
            jsonObject.put("No. of words", countword.getWordCount());


            FileWriter file = new FileWriter("jsonfolder\\test.json", false);
            file.write(jsonObject.toJSONString());
            file.close();

            System.out.println("file has been created");




        }

    }

}




