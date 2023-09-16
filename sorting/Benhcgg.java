import java.util.Random;
public class Benhcgg {

    private static int[] arrrr(int n) {
        int[] array = new int[n];
        Random rnd = new Random();
        for(int i = 0; i <n;i++ ) {
            
            array[i] = rnd.nextInt(-10000,10000);
        }
        return array;
    }

    private static double benchi(Sort sort, int[] array,int k) {
            double min = Double.POSITIVE_INFINITY;
            
            for (int i = 0; i < k; i++) {
            int[] arrayclone = array.clone();
            System.gc();
            long t0 = System.nanoTime();
            sort.sort(arrayclone);
            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;
    }

    public static void main(String[] args) {
        int[] sizes = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600,3200,6400,12800,25600,51200,102400,204800};
        
        for ( int n : sizes) {

            
            int[] array = arrrr(n);


            System.out.printf("%8d", n);
    
            int k = 1000;
            Sort sel = new Selection();
            double minsel = benchi(sel, array, k);
            
            System.out.printf("%8.0f", (minsel/1000));	    
            Sort ins = new Insertion();
            double minins = benchi(ins, array, k);
   

    
            System.out.printf("%8.0f" , (minins/1000));	 
            
            Sort mer = new Merge();
            double minmer = benchi(mer, array, k);
    
            System.out.printf("%8.0f" , (minmer/1000));	 
            Sort merAlt = new MergeAlt();
            double minmerAlt = benchi(merAlt, array, k);
    
            System.out.printf("%8.0f" , (minmerAlt/1000));	 
	    
            System.out.println();
        }
    
    }
    
}
