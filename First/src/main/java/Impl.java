import java.util.ArrayList;
import java.util.*;

public class Impl {

   public  List<String> hot = new ArrayList<String>();
    List<Hotpach> hotpachList = new ArrayList<Hotpach>();



    void add()
    {
        if(hot.size()>0)
        {
            Hotpach h=new Hotpach();
            for(int i=0;i<hot.size();i++)
            {

                h.setHotPatchName(hot.get(i));
                System.out.println(hotpachList.add(h));
                System.out.println(hotpachList.get(i).getHotPatchName());
            }
        }

    }
   void print()
    {
        for(int i = 0; i < hotpachList.size(); i++) {
           System.out.println(hotpachList.get(i).getHotPatchName());
        }
    }
    void addlist()
    {
        hot.add("hi");
        hot.add("how");
        hot.add("are u");
    }

    public static void main(String[] args){




        Impl i= new Impl();
        i.addlist();
        i.add();
        i.print();

        /*ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();
        AddressEntry test = new AddressEntry("john", "doe", "yes", "no", "maybe", 1, "I guess", "ok");
        addressEntryList.add(test);*/
    }

}
