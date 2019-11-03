import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        //input filepath
        String dataFile = /*"C:\\Users\\Kenneth\\IdeaProjects\\Estevez_p2\\src\\*/ "problem2.txt";
        //output filepath
        String outputFile = /*"C:\\Users\\Kenneth\\IdeaProjects\\Estevez_p2\\src\\*/ "unique_word_counts.txt";
        DuplicateCounter dC = new DuplicateCounter();
        dC.count(dataFile);
        dC.write(outputFile);
    }
}
