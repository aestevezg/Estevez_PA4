import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter
{
    private Map<String, Integer> wordCounter;
    //dC
    public DuplicateCounter()
    {
        wordCounter = new HashMap<String,Integer>();
    }
    //count
    public void count(String dataFile)
    {
        Scanner fileReader = null;
        try
        {
            fileReader = new Scanner(new File(dataFile));
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            return;
        }

        while(fileReader.hasNext())
        {
            String word = fileReader.next().toLowerCase();
            Integer count = wordCounter.get(word); //get the count from map
            if(count == null)
                count = 1;
            else
                count = count + 1;
            wordCounter.put(word, count);
        }
        fileReader.close();
    }
    //create new/overwrite file
    public void write(String outputFile){
        //if file exists overwrite
        try
        {
            PrintWriter pW = new PrintWriter(new FileOutputStream(outputFile,false));
            for(String k : wordCounter.keySet())
            {
                pW.println(k + " " + wordCounter.get(k));
            }
            pW.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
