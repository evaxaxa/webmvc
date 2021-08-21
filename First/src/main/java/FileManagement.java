import java.io.*;
// Hello----------
//TEST
public class FileManagement {

    //method
    public void fileRead()
    {
        try{
            FileInputStream fstream = new FileInputStream("../../File/scratch.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            //Read File Line By Line
               while ((strLine = br.readLine()) != null)   {
                // Print the content on the console - do what you want to do
                System.out.println (strLine);
            }

            //Close the input stream
            fstream.close();
        }
         catch (Exception e) {
            e.printStackTrace();
        }



       // return "File returned";
    }

    //main
    public static void main(String a[])
    {
        FileManagement f = new FileManagement();
        f.fileRead();
    }
}
