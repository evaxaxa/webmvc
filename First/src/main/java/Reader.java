
import java.io.IOException;
import java.util.List;

public class Reader {

    public static List<String> list;
    public List<String> listMethod() throws IOException {
        Buff b = new Buff();
        List<String> list= b.getFile();
        return list;

    }

    public static void main(String[] args) throws IOException {

        Reader r = new Reader();
        r.listMethod();
        System.out.println(list);
    }
}
