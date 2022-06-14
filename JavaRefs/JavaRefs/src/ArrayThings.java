import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayThings {
    public static void main(String[] args) {
        // Constructor
        int[] intArray = new int[] {1, 2, 3, 4};
        int[] intArray2 = new int[] {1, 2, 3, 4};
        int[][] nestedIntArray = new int[][] {{1, 2}, {3, 4}};

        // Printing array
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Deep Integer Array:" + Arrays.deepToString(nestedIntArray));

        // Length of array
        System.out.println("Length of array: " + intArray.length);

        // Indexing
        System.out.println("Index 0 of intArray: " + intArray[0]);

        // Setting value
        intArray[0] = 99999;
        System.out.println("Set index 0 of intArray: " + Arrays.toString(intArray));

        // Swapping value
        int temp = 0;
        temp = intArray[0];
        intArray[0] = intArray[1];
        intArray[1] = temp;
        System.out.println("Swapped: " + Arrays.toString(intArray));

        // Equals
        System.out.println("Equal Arrays (Shallow equality): " + Arrays.equals(intArray, intArray2));
        System.out.println("Equal Arrays (Deep equality): " + Arrays.deepEquals(nestedIntArray, nestedIntArray));

        // Binary Search
        // Returns index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1)
        System.out.println("BSearch (found): " + Arrays.binarySearch(intArray, 4));
        System.out.println("BSearch (not found): " + Arrays.binarySearch(intArray, -999));

        // Compare arrays, must be same type
        System.out.println("Compare (similar): " + Arrays.compare(intArray, intArray));
        System.out.println("Compare unsigned (similar): " + Arrays.compareUnsigned(intArray, intArray));
        System.out.println("Compare (different): " + Arrays.compare(intArray, intArray2));
        System.out.println("Compare unsigned (different): " + Arrays.compareUnsigned(intArray, intArray2));

        // Copy array
        System.out.println("Copy Entire Length: " + Arrays.toString(Arrays.copyOf(intArray, intArray.length)));
        System.out.println("Copy Slice: " + Arrays.toString(Arrays.copyOf(intArray, intArray.length / 2)));
        System.out.println("Copy Range of Arrays: " + Arrays.toString(Arrays.copyOfRange(intArray, 0, 2)));

        // Fill Array
        int[] empty = new int[10];
        Arrays.fill(empty, 0);
        System.out.println("Fill: " + Arrays.toString(empty));

        // Mismatched Items
        System.out.println("Mismatch: " + Arrays.mismatch(intArray, intArray2));

        // Sort
        Arrays.sort(intArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));

        Arrays.parallelSort(intArray);
        System.out.println("Parallel Sorted: " + Arrays.toString(intArray));

        // Array List
        System.out.println();
        ArrayListThing();
        System.out.println();
        LinkedListThing();
    }

    public static void ArrayListThing() {
        // Integer Array
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Add item
        arr.add(9);
        arr2.add(12);
        arr2.add(123124);

        // Length
        System.out.println("Array size: " + arr.size() + ", " + arr2.size());

        // Print
        System.out.println("Print: " + arr.toString() + ", " + arr2.toString());

        // Add all
        arr.addAll(arr2);
        System.out.println("Add from arr2 to arr: " + arr.toString() + ", " + arr2.toString());

        // Clear
        arr2.clear();
        System.out.println("Clear: " + arr.toString() + ", " + arr2.toString());

        // Shallow copy
        System.out.println("Shallow copy: " + arr.clone().toString());

        // Contains
        System.out.println("Contains 1: " + arr.contains(1));

        // Get by Index
        System.out.println("Get 0: " + arr.get(0));

        // Check empty
        System.out.println("Empty: " + arr2.isEmpty());

        // Remove
        arr.remove(0);
        System.out.println("Remove by index: " + arr.toString());
        arr.remove((Integer) 123124);
        System.out.println("Remove by object: " + arr.toString());
        arr.removeAll(arr2);
        System.out.println("Remove all items that are contained in other sequence: " + arr.toString());

        // Retain
        arr.retainAll(arr2);
        System.out.println("Keep items that are contained in the other sequence: " + arr.toString());

        // Increase defined array size
        arr.ensureCapacity(1000);
        System.out.println("Increased max size: " + arr.toString());

        // Trim the list to current size
        arr.trimToSize();
        System.out.println("Trimmed to size: " + arr.toString());

        // Convert to array
        ArrayList<Integer> new_ = new ArrayList<Integer>();
        new_.add(123);
        new_.add(123);
        new_.add(21312);
        Object[] conv = new_.toArray();
        System.out.println("Converted to Object Array: " + Arrays.toString(conv));
    }

    public static void LinkedListThing() {
        // Integer Array
        LinkedList<Integer> arr = new LinkedList<Integer>();
        LinkedList<Integer> arr2 = new LinkedList<Integer>();

        // Add item
        arr.add(9);
        arr2.add(12);
        arr2.add(123124);

        // Length
        System.out.println("Array size: " + arr.size() + ", " + arr2.size());

        // Print
        System.out.println("Print: " + arr.toString() + ", " + arr2.toString());

        // Set
        arr.set(0, 10101010);
        System.out.println("Set 0th index to 10101010: " + arr.toString());

        // Add all
        arr.addAll(arr2);
        System.out.println("Add from arr2 to arr: " + arr.toString() + ", " + arr2.toString());

        // Add to first pos
        arr.addFirst(123);
        System.out.println("Add to first index: " + arr.toString());

        // Add to end pos
        arr.addLast(123);
        System.out.println("Add to last index: " + arr.toString());

        // Clear
        arr2.clear();
        System.out.println("Clear: " + arr.toString() + ", " + arr2.toString());

        // Shallow copy
        System.out.println("Shallow copy: " + arr.clone().toString());

        // Contains
        System.out.println("Contains 1: " + arr.contains(1));

        // Get
        System.out.println("Get 0: " + arr.get(0));
        System.out.println("Get First: " + arr.getFirst());
        System.out.println("Get Last: " + arr.getLast());

        // Find by index
        System.out.println("Return index of object: " + arr.indexOf(123));
        System.out.println("Return last index of object: " + arr.indexOf(123));

        // Offer item to list
        arr.offer(123); // to end
        System.out.println("Offer to end: " + arr.indexOf(123));
        arr.offerFirst(213213);
        System.out.println("Offer to start: " + arr.indexOf(123));
        arr.offerLast(0);
        System.out.println("Offer to end: " + arr.indexOf(123));
        
        // Peek
        System.out.println("Peek end: " + arr.peek());
        System.out.println("Peek end: " + arr.peekLast());
        System.out.println("Peek first: " + arr.peekFirst());
        
        // Poll (find and remove)
        System.out.println("Poll end: " + arr.poll());
        System.out.println("Poll end: " + arr.pollLast());
        System.out.println("Poll first: " + arr.pollFirst());

        // Pop
        System.out.println("Popped: " + arr.pop());

        // Push
        arr.push(1234123);
        System.out.println("Pushed: " + arr.toString());

        // Remove
        arr.remove();
        System.out.println("Remove from head: " + arr.toString());
        arr.remove(0);
        System.out.println("Remove by index: " + arr.toString());
        arr.remove((Integer) 123);
        System.out.println("Remove by object: " + arr.toString());
        arr.removeAll(arr2);
        System.out.println("Remove all items that are contained in other sequence: " + arr.toString());
        arr.removeFirst();
        System.out.println("Remove first: " + arr.toString());
        arr.add(123232);
        arr.add(124312312);
        System.out.println("Added: " + arr.toString());
        arr.removeFirstOccurrence(123);
        System.out.println("Remove first occurrence of 123: " + arr.toString());

        arr.add(1234);
        arr.removeLast();
        System.out.println("Remove last: " + arr.toString());
        arr.removeLastOccurrence(123232);
        System.out.println("Remove last occurrence of 123232: " + arr.toString());

        // Convert to array
        ArrayList<Integer> new_ = new ArrayList<Integer>();
        new_.add(123);
        new_.add(123);
        new_.add(21312);
        Object[] conv = new_.toArray();
        System.out.println("Converted to Object Array: " + Arrays.toString(conv));
    }
}
