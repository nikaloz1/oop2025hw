package workshop3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assignment03 {
    public static void main(String[] args) {
        // original list
        List<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 12, 67, 89, 34, 56, 78, 1, 15, 71));

        // printing before we remove elements
        System.out.println("Original List: " + list);

        // elements that we are removing (by indices)
        int[] indicesToRemove = {9, 7, 5, 3, 1}; 

        // removing 
        for (int index : indicesToRemove) {
            list.remove(index);
        }

        System.out.println("Final List: " + list);
    }
}

