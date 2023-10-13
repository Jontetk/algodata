import java.util.Random;

public class PrioBenches {


private static double benchiPriOneAdd(Integer[] numbers, int k) {
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
private static double benchiPriTwoAdd(Integer[] numbers, int k) {
        double min = Double.POSITIVE_INFINITY;
        
        
        

        for (int i = 0; i < k; i++) {

        PriorityListTwo two = new PriorityListTwo();

        System.gc();
        long t0 = System.nanoTime();
        for(int elem:numbers) {
            two.add(elem);
        }
        long t1 = System.nanoTime();
        double t = (t1 - t0);
        if (t < min)
            min = t;
        }
        return min;
}
private static double benchiPriTwoRem(Integer[] numbers, int k) {
        double min = Double.POSITIVE_INFINITY;
        
        



        for (int i = 0; i < k; i++) {
        PriorityListTwo list = new PriorityListTwo();
        for(int elem:numbers) {
            list.add(elem);
        }
        Integer listrem;


        System.gc();
        long t0 = System.nanoTime();
        listrem = list.remove();
        while(listrem!= null)
            listrem = list.remove();


        long t1 = System.nanoTime();
        double t = (t1 - t0);
        if (t < min)
            min = t;
        }
        return min;
}
private static double benchiPriOneRem(Integer[] numbers, int k) {
        double min = Double.POSITIVE_INFINITY;
        
        



        for (int i = 0; i < k; i++) {
        PriorityListOne list = new PriorityListOne();
        for(int elem:numbers) {
            list.add(elem);
        }
        Integer listrem;


        System.gc();
        long t0 = System.nanoTime();
        listrem = list.remove();
        while(listrem!= null)
            listrem = list.remove();


        long t1 = System.nanoTime();
        double t = (t1 - t0);
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
            
            


            double prioa = benchiPriOneAdd(numforPOri,k);
            System.out.printf("%8.0f" , (prioa/1000));	
            
            double prita = benchiPriTwoAdd(numforPOri, k);
            System.out.printf("%8.0f" , (prita/1000));

            double prior = benchiPriOneRem(numforPOri, k);
            System.out.printf("%8.0f" , (prior/1000));

            Double pritr = benchiPriTwoRem(numforPOri, k);
            System.out.printf("%8.0f" , (pritr/1000));

            


            System.out.println();
        }
        
    
    }
    
}