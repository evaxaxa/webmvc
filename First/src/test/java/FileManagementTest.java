import mockit.Mocked;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;


import java.io.*;
//import org.powermock.api.mockito.PowerMockito;
import static org.mockito.Mockito.*;


public class FileManagementTest {
    String s = null ;
   // @Mocked String str1="";
   // @Mock
    //MyObject mockMyObject;
   // @Mocked FileReader fileReader;

    String str = "/Users/evaanantaxaxa/IdeaProjects/First/src/File/scratch.txt";
    // String str = "";
     File file = new File("/Users/evaanantaxaxa/IdeaProjects/First/src/File/scratch.txt");
    @Test
    public void testMock() throws FileNotFoundException
    {

    try {
        //System.out.println("-----");
        /*new MockUp<FileReader>(){
            @Mock
            public void FileReader (String f) throws FileNotFoundException{
                System.out.println("inside FileReader");
                new MockUp< FileInputStream>(){
                    public File FileInputStream(String name) throws FileNotFoundException{
                        System.out.println("File name ="+new File(name));
                        return new File(name);
                    }
                };
            }
        };*/

        /*BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
Mockito.when(bufferedReader.readLine()).thenReturn("line1", "line2", "line3");
objUnderTest.readStuff(bufferedReader);*/
        /*FileReader b = Mockito.mock(FileReader.class);

        InputStreamReader i = Mockito.mock(InputStreamReader.class);
        Mockito.when(InputStreamReader.class).thenReturn(i);
*/

       /* new MockUp<FileReader>() {
            @Mock
            public String readLine() throws IOException{

                    return p;

            }
        };*/
        /*MockUp<BufferedReader> bufferedReader1 =new MockUp<BufferedReader>() {
            @Mock
            public String readLine() throws IOException{
                System.out.println ("INSIDE MOCK TRY");
                String p= "testing --- I am working with buddy";
                int c=0;
                if(s==null && c<1) {
                    s=p;
                    c++;
                    return p;
                }
                else return null;
            }
        };*/
        // assertEquals("",new ArrayList<String>(), FileUtil.readFile("abc"));
        /* BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.readLine()).thenReturn("OK");*/
        //FileManagementTest t = new FileManagementTest();
       //FileManagement tc = spy(new FileManagement());

        //FileReader f1= new FileReader("test");
      FileReader f1=  mock(FileReader.class);

        //BufferedReader b= new BufferedReader(new FileReader("/Users/evaanantaxaxa/IdeaProjects/First/src/File/scratch.txt"));

       // System.out.println("Mocked br ="+b.readLine());
      BufferedReader br= mock(BufferedReader.class);

    when(br.readLine()).thenReturn("K");
        System.out.println("Mocked br ="+br.readLine());


       // System.out.println("bufferedReader="+bufferedReader);
        //Mockito.doReturn(bufferedReader).when(tc).fileRead();
       // Mockito.when(FileReader.class).getMock();
       // String s = Mockito.doReturn("OK").when(bufferedReader.readLine());
        System.out.println("STRING ="+s);
       //Mockito.doReturn("OK").when(tc).fileRead();
      //  BufferedReader bufferedReader = mock(BufferedReader.class);
       //Mockito.when((tc).fileRead()).thenReturn(bufferedReader,"OK");

       // FileReader mockFileReader = createMockAndExpectNew(FileReader.class);

        //FileReader f= Mockito.mock(FileReader.class);
        //Mockito.when(FileReader.class).thenReturn();
       //Mockito.when(FileNotFoundException).thenReturn("OK");
     // Mockito.when(FileReader.class).thenReturn(f,"OK");
       // Mockito.d
       // Mockito.doReturn(f).when(FileReader.class);
       // Mockito.doThrow(new RuntimeException()).when(FileReader.class);
       // Mockito.when(BufferedReader.class).thenCallRealMethod();
        //Mockito.when(bufferedReader.readLine()).thenReturn("some text").thenReturn(null);
        System.out.println("after do return");


       // Mockito.doReturn(Mockito.doReturn("OK").when(bufferedReader.readLine())).when(tc).fileRead();
      // String s1 = Mockito.doReturn("OK").when(bufferedReader.readLine());

              // Mockito.when(bufferedReader.readLine()).thenReturn("----EVA----");
                //System.out.println("bufferedReader.readLine()="+bufferedReader.readLine());
      /*  BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        FileReader fileReader = Mockito.mock(FileReader.class);
        when(bufferedReader.readLine()).thenReturn("final");*/


        //when(FileReader.class).then();
        // when(n).thenReturn(f);
        //whenNew(FileReader.class).withAn


        //System.out.println ("before MOCK FILE MANAGEMENT");
        //

        //System.out.println("f="+f.fileRead());

        //System.out.println ("AFTER  MOCK ASSERT");


       // FileManagement tc = new FileManagement();
        //System.out.println("f="+f);
        //System.out.println("fileread="+tc.fileRead());
        Assert.assertEquals("OK", tc.fileRead());
    }
        catch(Exception e )
        {
            System.out.println ("******"+e);
            Assert.fail();

        }
       // return "";
    }


}
