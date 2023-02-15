import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.*;
import org.powermock.modules.testng.PowerMockTestCase;

import java.util.ArrayList;
import java.util.List;

import static org.powermock.api.mockito.PowerMockito.when;

//import org.powermock.*;

@PrepareForTest({Reader.class})
public class TestReader extends PowerMockTestCase {

    @Test
    public void testgetFile()
    {
        System.out.println("-----1");
        try{

            List<String> list = new ArrayList<>();
            list.add("STRING VALUE");
            System.out.println("-----2");
           Reader r= PowerMockito.mock(Reader.class);
            System.out.println("-----3");
            PowerMockito.whenNew(Reader.class).withAnyArguments().thenReturn(r);
            System.out.println("-----4");
            PowerMockito.when(r.listMethod()).thenReturn(list);
            /*PowerMockito.mockStatic(Buff.class);
            when(Buff.getFile()).thenReturn(list);*/

            System.out.println("-----5");
            Assert.assertEquals("[STRING VALUE]",list);


        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }


}
