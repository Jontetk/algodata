import java.util.Random;

public class HeapTreeBench {


private static double benchipush(Integer[] numbers, int k,Integer push) {
            double min = Double.POSITIVE_INFINITY;
            
            
            PriorityListOne one = new PriorityListOne();

            for (int i = 0; i < k; i++) {



            System.gc();
            long t0 = System.nanoTime();
            for(int elem:numbers) {
                one.add(elem);
            }
            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;
    }




    public static void main(String[] args) {

        
        Random randomNums = new Random();
        Integer[] intfanshelebvet = new Integer[1023];

        for(int i = 0; i<1023;i++) {
            intfanshelebvet[i] = randomNums.nextInt(0,10000);
            }
        Random sädgen = new Random();


            
            


        }
        
    
    }
    
}