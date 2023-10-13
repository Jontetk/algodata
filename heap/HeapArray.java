public class HeapArray {
    private Integer[] array;
    private int root;
    private int k;
    private int n;

    HeapArray(int n) {
        this.array = new Integer[n];
        this.root = 0;
        this.k = -1;
        this.n = n;
    }
    public void add(Integer element) {
        if(k < n) {
            k++;
            array[k] = element;
            swapInto(k);
                       

        }
        
        
        
    }
    private void swapInto(int currentIndex) {
        if(currentIndex <= 0)
            return;
        int parent;
        if(currentIndex%2 == 0) {
            parent = (currentIndex-2)/2;
        }
        else {
            parent = (currentIndex-1)/2;
        }
        if(array[currentIndex]<array[parent]) {
            Integer temp = array[currentIndex];
            array[currentIndex] = array[parent];
            array[parent] = temp;
            swapInto(parent);
        }
        
    }
    public Integer remove() {
        if (array[root] == null)
            return null;
        Integer returnValue = array[root];
        array[root] = array[k];
        array[k] = null;
        k--;
        sink(root);
        return returnValue;



        

    }

    private void sink(int currentIndex) {
        int leftIndex = currentIndex*2+1;
        int rightIndex = currentIndex*2+2;

        if(leftIndex <= k &&array[currentIndex]>array[leftIndex]) {
            if(rightIndex >k || array[leftIndex]<=array[rightIndex]){
                Integer temp = array[currentIndex];
                array[currentIndex] = array[leftIndex];
                array[leftIndex] = temp;
                sink(leftIndex);
            }
        }
        if(rightIndex <= k && array[currentIndex]>array[rightIndex] ) {
            if(leftIndex > k || array[leftIndex]>array[rightIndex]) {
            Integer temp = array[currentIndex];
            array[currentIndex] = array[rightIndex];
            array[rightIndex] = temp;
            sink(rightIndex);  
            }
        }
    }



}
