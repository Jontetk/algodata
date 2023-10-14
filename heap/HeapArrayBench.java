
import java.util.Random;
public class HeapArrayBench {





private static double benchiAdd(Integer[] numbers, int k) {
            double min = Double.POSITIVE_INFINITY;
            
            

            for (int i = 0; i < k; i++) {

            HeapArray one = new HeapArray(numbers.length);


            System.gc();
            
            long tott0=0;
            long tott1=0;
            for(int elem:numbers) {
                long t0 = System.nanoTime();
                one.add(elem);
                long t1 = System.nanoTime();
                tott0 += t0;
                tott1 += t1;
            }
            
            double t = (tott1 - tott0);
            if (t < min)
                min = t;
            }
            return min;
    }

private static double benchiRem(Integer[] numbers, int k) {
        double min = Double.POSITIVE_INFINITY;
        
        



        for (int i = 0; i < k; i++) {
        HeapArray list = new HeapArray(numbers.length+1);
        for(int elem:numbers) {
            list.add(elem);
        }
        Integer listrem;


        System.gc();
        long tott0=0;
        long tott1=0;
     

        for (int j =0;j<numbers.length;j++) {
            long t0 = System.nanoTime();
            list.remove();
            long t1 = System.nanoTime();
        tott0 += t0;
        tott1 += t1;
        }

        
        double t = (tott1 - tott0);
        if (t < min)
            min = t;
        }
        return min;
}





    public static void main(String[] args) {

        int[] sizes = {100,200,400,800,1600,3200,6400,12800,25600,51200,102400,204800};


        Random säd = new Random();
        Random förPrio = new Random(säd.nextInt());
        for ( int n : sizes) {
            int k = 1000;
            Integer[] numforPOri = new Integer[n];
            for(int i = 0; i<n; i++) {
                numforPOri[i] = förPrio.nextInt();
            }

            System.out.printf("%8d", n);
            
            


            double prioa = benchiAdd(numforPOri,k);
            System.out.printf("%8.0f" , (prioa/1000));	
            
            double prita = benchiRem(numforPOri, k);
            System.out.printf("%8.0f" , (prita/1000));


            


            System.out.println();
        }
        
    
    }
    
}

