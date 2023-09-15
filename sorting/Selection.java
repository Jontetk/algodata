public class Selection extends Sort{
    public void sort(int[] array){
        for (int i = 0; i < array.length -1; i++) {
            int candidate = i;
            for (int j = i; j < array.length ; j++) {
                if(array[j] < array[candidate])
                    candidate = j; 
            }
            int move = array[candidate];
            array[candidate] = array[i];
            array[i] = move;
        }
    }
        
}
