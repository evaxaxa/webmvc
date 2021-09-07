import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public  class Buff {

    public  List<String> getFile() throws IOException {

        List<String> list = new ArrayList<>();

        FileReader in = new FileReader("../../File/scratch.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        while ((line = br.readLine() )!= null) {
            list.add(line);
        }
       // System.out.println(list);
        in.close();
        return list;
    }

}
