public class Insertion extends Sort{
    public void sort(int[] array) {
        
    for (int i = 0; i < array.length; i++) {
        for (int j = i; j > 0 && array[j-1] > array[j]; j--) {
            swap(array, j, j-1);
        }
        }
    }
    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
