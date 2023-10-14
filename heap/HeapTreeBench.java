import java.util.Random;





public class HeapTreeBench {






    private static RetnValues benchipush(Integer[] numbers, int k,Random rand) {
            double min = Double.POSITIVE_INFINITY;
        
            Integer[] pushOps = new Integer[20];
            for(int i = 0; i<20;i++) {
                pushOps[i] = rand.nextInt(10,100);
            }
            
            int[] psuhDepth = new int[20];

            for (int i = 0; i < k; i++) {
            HeapTree tre = new HeapTree();      
            psuhDepth = new int[20];
            
            for(Integer elem:numbers) {
                tre.add(elem);
            }

            System.gc();
            long t0 = System.nanoTime();
            
            for(int j = 0; j< 20; j++) {
                psuhDepth[j] = tre.push(pushOps[j]);
            }

            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            
        RetnValues returnValues = new RetnValues(min, psuhDepth);

            return returnValues;
    }
    private static Double benchiaddrem(Integer[] numbers, int k,Random rand) {
        double min = Double.POSITIVE_INFINITY;
    
        Integer[] pushOps = new Integer[20];
        for(int i = 0; i<20;i++) {
            pushOps[i] = rand.nextInt(10,100);
        }


        for (int i = 0; i < k; i++) {
        HeapTree tre = new HeapTree();      

        
        for(Integer elem:numbers) {
            tre.add(elem);
        }

        System.gc();
        long t0 = System.nanoTime();
        
        for(int j = 0; j< 20; j++) {
            Integer elementsat = tre.remove();
            elementsat += pushOps[j];
            tre.add(elementsat);
        }

        long t1 = System.nanoTime();
        double t = (t1 - t0);
        if (t < min)
            min = t;
        }
        
    ;

        return min;
}




    public static void main(String[] args) {

        int k = 1000;
        Random randomNums = new Random();
        Integer[] intfanshelebvet = new Integer[1023];

        for(int i = 0; i<1023;i++) {
            intfanshelebvet[i] = randomNums.nextInt(0,10000);
            }
        Random sädgen = new Random();
        int säd = sädgen.nextInt();
        Random rnadförpush = new Random(säd);

        RetnValues retn = benchipush(intfanshelebvet, k, rnadförpush);
        System.out.println();
        for (int elem: retn.depth) {
            System.out.print(elem +"\t");
        }
        System.out.println();

        System.out.println(retn.time/1000 +"\t");

        Random rnadföraddrem = new Random(säd);

        Double tid = benchiaddrem(intfanshelebvet, k, rnadföraddrem);

        System.out.println(tid/1000);
            


    }
        
    
}
    
