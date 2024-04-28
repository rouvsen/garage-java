package az.garage.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
//        foo();
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) list.set(0, list.get(i)+1);
            else if (a.get(i) < b.get(i)) list.set(1, list.get(i)+1);
        }
        return list;
    }
}
