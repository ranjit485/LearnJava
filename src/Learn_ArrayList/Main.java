package Learn_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<String>();
        names.add("ranjit");
        names.add("God");
        names.add("Sugamqt");
        System.out.println(names.get(0));
        System.out.println(names.stream().findFirst());
    }
}
