public class Binary {
    public static boolean search(int[] array, int key) {
        int first = 0;
        int last = array.length-1;
        while (true) {

            int index = (last+first)/2 ;
            if (array[index] == key) {
            break;
        }
        if (array[index] < key && index < last) {
            first = index+1;
            continue;
        }
        if (array[index] > key && index > first) {

            last = index-1;
            continue;
        }
        return false;
        
        }
        return true;
        }
}

