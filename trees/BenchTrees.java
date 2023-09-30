import java.util.Random;
public class BenchTrees {



    private static double benchi(BinaryTree trädFan,int[] randNod,int k) {
            double min = Double.POSITIVE_INFINITY;

            for (int i = 0; i < k; i++) {
    
            System.gc();
            long t0 = System.nanoTime();
            for(int j : randNod)
                trädFan.lookup(j);
            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;
    }

    public static int[] nodGen(int n) {
        int[] intJävlar = new int[n];
        Random rand = new Random();

        for(int i = 0; i<n;i++) {
            intJävlar[i] = rand.nextInt();
        }
        
        return intJävlar;
    }



    public static void main(String[] args) {

        int[] sizes = {100,200,400,800,1600,3200,6400,12800,25600,51200,102400,204800};


        
        for ( int n : sizes) {
            int k = 1000;

            int[] randNod = nodGen(n);
            
            System.out.printf("%8d", n);
            
            BinaryTree trädHelvete = new BinaryTree();
            for(int i:randNod){
                trädHelvete.add(i,i);
            }

            double minLookup = benchi(trädHelvete,randNod, k);
            System.out.printf("%8.0f" , (minLookup/1000));	




            System.out.println();
        }
        
    
    }
}


