public class ArrayQueue {
    int k;
    int n;
    int i;
    int totalAmount;
    Integer[] array;


    ArrayQueue(){
        this(8);
    }
    ArrayQueue(int size) {
        this.n = size;
        this.array = new Integer[size];
        this.i = 0;
        this.k = 0;
        this.totalAmount =0;
                
    }
    private void increaseSize() {
        Integer[] arraynew = new Integer[2*n];
        int index = 0;
        for (int j = i;j < n;j++){
            arraynew[index] = array[j];
            index++;
        }
        i=0;
        for(int j = 0; j<k;j++){
            arraynew[index] = array[j];
        }
        k = n; 
        n *= 2;
        array = arraynew;

    }
    private void decreaseSize() {
        Integer[] arraynew = new Integer[n/2];
        int index = 0;
        if(i<k){
            for(int j = i; j<k;j++) {
                arraynew[index] = array[j];
                index++;
            }
        }
        else {
            for(int j = i; j < n;j++){
                arraynew[index] = array[j];
                index++;
            }  
            for(int j = 0; j < k; j++) {
                arraynew[index] = array[j];
                index++;
            }
        }
        i = 0;
        k = index;
        array = arraynew;
        n /= 2;

    }

    
    public void add(Integer item) {
        if(k != i|| totalAmount == 0) {
        array[k] = item;
        k++;
        totalAmount++;
        if(k == n)
            k = 0;
        }
        else {
            increaseSize();
            add(item);
        }
    }
    public Integer remove() {
        if (totalAmount == 0)
            return null;
     
        Integer returnItem = array[i];
        array[i] = null;
        i++;
        totalAmount--;
        if(i==n) 
            i =0;
        if(totalAmount> 0 && n/totalAmount == 4)
            decreaseSize();
        return(returnItem);

        
    }
}
