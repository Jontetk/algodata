public class QuickArray {
    public static void sort(int[] array) {
        sort(array,0,array.length-1);
    }

    private static void sort(int[] array, int min, int max) {
        if(min != max) {
        int mid = partition(array, min, max);
        if(mid!=max)
            sort(array,mid+1,max);
        if (mid != min)
            sort(array,min,mid-1);
        }
    }

    private static int partition(int[] array,int min,int max) {
        int pivot = array[min];
        int i = min;
        int j = max;
        while (i <j) {
            while(array[j]>pivot && j >i) {
                j--;
            }

            while(array[i]<= pivot && i <j){
                i++;
            }
            if(i<j)
                swap(array, i, j);
        
        }
        swap(array, min, j);
        
    return j;
    }
    private static void swap(int[] array,int i, int j) {
        int swapElement = array[i];
        array[i] = array[j];
        array[j] = swapElement;
    }
    
    
}