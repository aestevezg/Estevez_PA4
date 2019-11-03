import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateRemover dR = new DuplicateRemover();
        //file path for input
        dR.remove(/*C:\\Users\\Kenneth\\Estevez_p1\\src\\*/"problem1.txt");
        //file path for output
        dR.write(/*C:\\Users\\Kenneth\\Estevez_p1\\src\\*/"unique_words.txt");
    }
}