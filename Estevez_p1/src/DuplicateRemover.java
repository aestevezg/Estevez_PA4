import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    private Set<String> uniqueWords;
    //read and remove duplicates from file
    public void remove(String dataFile) throws FileNotFoundException
    {
        String word;
        uniqueWords = new HashSet<String>();
        Scanner scnr = new Scanner(new File(dataFile));
        while(scnr.hasNext())
        {
            word = scnr.next();
            uniqueWords.add(word);
        }
    }
    //create output file
    public void write(String outputFile) throws IOException
    {
        File out;
        FileWriter createFile = null;

        out = new File(outputFile);
        //if file overwrite file
        if(out.exists()) {
            createFile = new FileWriter(out,false);
            Iterator itr = uniqueWords.iterator();

            while(itr.hasNext())
            {
                String str = (String)itr.next();
                createFile.write(str+"\n");
            }
            createFile.close();
            System.out.println("Data has been transferred to unique_words.txt");

        }
        //if no file write new file
        else
        {
            out.createNewFile();
            createFile = new FileWriter(out);
            Iterator itr = uniqueWords.iterator();

            while(itr.hasNext())
            {
                String str = (String)itr.next();
                createFile.write(str + "\n");
            }
            createFile.close();
            System.out.println("Data has been transferred to unique_words.txt");
        }
    }

}
