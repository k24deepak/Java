package Demo.Java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorted {

    public static boolean isSorted(ArrayList<String> list) {
        if (list == null || list.size() <= 1) {
            return true; // Empty or single-element list is considered sorted
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                return false; // Found an element out of order
            }
        }
        return true; // All elements are in order
    }

    public static boolean isSortedUsingCollections(ArrayList<String> list){
        if (list == null || list.size() <= 1) {
            return true;
        }

        ArrayList<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        return list.equals(sortedList);
    }

    public static void main(String[] args) {
        ArrayList<String> sortedList = new ArrayList<>();
        sortedList.add("apple");
        sortedList.add("banana");
        sortedList.add("cherry");

        ArrayList<String> unsortedList = new ArrayList<>();
        unsortedList.add("banana");
        unsortedList.add("apple");
        unsortedList.add("cherry");

        ArrayList<String> emptyList = new ArrayList<>();

        ArrayList<String> singleItemList = new ArrayList<>();
        singleItemList.add("one");

        System.out.println("Sorted list is sorted: " + isSorted(sortedList));
        System.out.println("Unsorted list is sorted: " + isSorted(unsortedList));
        System.out.println("Empty list is sorted: " + isSorted(emptyList));
        System.out.println("Single item list is sorted: " + isSorted(singleItemList));

        System.out.println("Sorted list is sorted using Collections: " + isSortedUsingCollections(sortedList));
        System.out.println("Unsorted list is sorted using Collections: " + isSortedUsingCollections(unsortedList));
        System.out.println("Empty list is sorted using Collections: " + isSortedUsingCollections(emptyList));
        System.out.println("Single item list is sorted using Collections: " + isSortedUsingCollections(singleItemList));
    }
}