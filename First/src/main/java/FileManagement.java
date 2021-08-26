import java.io.*;
import static org.mockito.Mockito.spy;
public class FileManagement {

    public String fileRead( ) throws FileNotFoundException {
        String strLine;
        String strLine2 = "";


      try{
            System.out.println ("before BUFFERED READER");
           // BufferedReader br = new BufferedReader (new FileReader(("/Users/evaanantaxaxa/IdeaProjects/First/src/File/scratch.txt")));;
            String str= "/Users/evaanantaxaxa/IdeaProjects/First/src/File/scratch.txt";
            System.out.println ("FileReader"+str);
            FileReader f = new FileReader((str));
            System.out.println ("FileReader-------"+f.getClass());
            BufferedReader br = new BufferedReader (f);
            System.out.println ("AFTER FILE READER,     br="+br.readLine());
               while ((strLine = br.readLine()) != null)   {
                   strLine2=strLine;
                System.out.println ("INISDE FILEMANAGMENT="+strLine);
            }
            FileManagement tc = spy(new FileManagement());

            return "OK";
          }
         catch (Exception e) {

            e.printStackTrace();
             //
             return "NOT OK";
        }


    }
    public static void main(String[] a) throws IOException {
        FileManagement f = new FileManagement();
       //BufferedReader br= new BufferedReader();
        System.out.println ("-----" +f.fileRead());
    }
}
