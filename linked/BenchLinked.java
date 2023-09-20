import java.util.Random;

public class BenchLinked {

    private static double benchi(LinkedList list1, LinkedList list2,int k) {
            double min = Double.POSITIVE_INFINITY;
            Cell last = list1.first;
            for(int j = 0; last.tail != null;j++){
                last = last.tail;
            }
            for (int i = 0; i < k; i++) {
    
            System.gc();
            long t0 = System.nanoTime();
            list1.append(list2);
            long t1 = System.nanoTime();
            last.tail = null;
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;
    }
    private static int[] arrrr(int n) {
        int[] array = new int[n];
        Random rnd = new Random();
        for(int i = 0; i <n;i++ ) {
            
            array[i] = rnd.nextInt(-10000,10000);
        }
        return array;
    }
    private static double benchiarray(int[] array1,int[] array2,int k){
            double min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
            System.gc();
            long t0 = System.nanoTime();
            int[] array3 = new int[array1.length+array2.length];
            for (int j = 0; j < array1.length;j++) {
                array3[j] = array1[j];
            }
            for(int j = 0; j<array2.length;j++){
                array3[j+array1.length] = array2[j];
            }            
            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;

    }
    private static double benchibuild (int n, int k) {
            double min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
            System.gc();
            long t0 = System.nanoTime();
            LinkedList list = new LinkedList(n);
            long t1 = System.nanoTime();
            
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;

    }
    private static double benchiallo (int n, int k) {
            double min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
            System.gc();
            long t0 = System.nanoTime();
            int[] arrrrrrr = new int[n];
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

            
            


            System.out.printf("%8d", n);
    
            int k = 1000;
            LinkedList lista = new LinkedList(100);
            LinkedList listb = new LinkedList(n);



            double minlinkedbf = benchi(listb, lista, k);
    
            System.out.printf("%8.0f" , (minlinkedbf/1000));	 
	    
            lista = new LinkedList(100);
            listb = new LinkedList(n);
            double minlinkedaf = benchi(lista, listb, k);
    

            System.out.printf("%8.0f" , (minlinkedaf/1000));	 

            int[] arraya = arrrr(100);
            int[] arrayb = arrrr(n);

            double minarrbf = benchiarray(arrayb, arraya,k);
            System.out.printf("%8.0f" , (minarrbf/1000));	

            arraya = arrrr(100);
            arrayb = arrrr(n);

            double minarraf = benchiarray(arraya, arrayb,k);
            System.out.printf("%8.0f" , (minarraf/1000));


            double minbuild = benchibuild(n, k);
            System.out.printf("%8.0f" , (minbuild/1000));

            double minallo = benchiallo(n, k);
            System.out.printf("%8.0f" , (minallo/1000));

            System.out.println();
        }
    
    }
}
