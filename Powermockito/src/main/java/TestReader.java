import org.junit.Assert;
import org.junit.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import org.powermock.*;


@PrepareForTest({Reader.class})
public class TestReader  {

    @Test
    public void testgetFile()
    {
        System.out.println("-----1");
        try{

            List<String> list = new ArrayList<>();
            list.add("STRING VALUE");
            BufferedReader br= PowerMockito.mock(BufferedReader.class);
            PowerMockito.when(br.readLine()).thenThrow(IOException.class);

            FileReader fr = PowerMockito.mock(FileReader.class);
            PowerMockito.whenNew(FileReader.class).withAnyArguments().thenThrow(new IOException());


            System.out.println("-----2");
            Reader r= PowerMockito.mock(Reader.class);
            System.out.println("-----3");
            PowerMockito.whenNew(Reader.class).withAnyArguments().thenReturn(r);
            System.out.println("-----4");
            PowerMockito.when(r.listMethod()).thenReturn(list);
            System.out.println("-----5");
            Assert.assertEquals("[STRING VALUE]",list);
        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }


}
