package workshop3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assignment02 {
        public static void main(String[] args) {
        // list1
        List<Integer> list1 = Arrays.asList(5, 12, 8, 23, 16, 32, 7, 14, 13, 25, 87);
        
        // indexes that go from list1 to list2
        int[] transferIndices = {1, 3, 5, 7, 9};
        
        List<Integer> list2 = new ArrayList<>();
        
        for (int index : transferIndices) {
            list2.add(list1.get(index));
        }
        
        System.out.println("List1: " + list1);
        System.out.println("List2 (after transfer): " + list2);
    }
}
