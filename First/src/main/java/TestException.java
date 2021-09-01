import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestException {

    private static void readBookJson() {
        try {
            BufferedReader reader= new BufferedReader(new FileReader("../../File/scratch.txt"));

        } catch (FileNotFoundException exception) {
            // Output expected FileNotFoundExceptions.
                System.out.println("file not foound!"+exception);
        } catch (Exception exception){
            // Output unexpected Exceptions.
            System.out.println("ops!!!"+exception);
        }

    }

    public static void main(String args[])
    {
        TestException t= new TestException();
        t.readBookJson();
        System.out.println("sucess!");
    }
}
