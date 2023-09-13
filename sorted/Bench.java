import java.util.Random;


class Bench {

    private static void linear(int[] array, int[] indx) {
	for (int i = 0; i < indx.length ; i++) {
	    Linear.search(array, indx[i]);
	}
    }
    

    private static void binary(int[] array, int[] indx) {
	for (int i = 0; i < indx.length ; i++) {
	    Binary.search(array, indx[i]);
	}
    }

       
    private static int[] sorted(int n) {
	Random rnd = new Random();	
	int[] array = new int[n];
	int nxt = rnd.nextInt(10);

	for (int i = 0; i < n ; i++) {
	    array[i] = nxt;
	    nxt += rnd.nextInt(10) + 1 ;
	}	
	return array;
    }


    private static int[] keys(int loop, int n) {
	Random rnd = new Random();	
	int[] indx = new int[loop];
	for (int i = 0; i < loop ; i++) {
	    indx[i] = rnd.nextInt(n*5);
	}	
	return indx;
    }

    
    public static void main(String[] arg) {

	int[] sizes = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600,3200,6400,10000,100000,1000000,64000000,128000000};

	System.out.printf("# searching through an array of length n, time in ns\n");
	System.out.printf("#%7s%8s%8s%8s\n", "n", "linear", "binary","ratio");
	for ( int n : sizes) {

	    int loop = 10000;
	    
	    int[] array = sorted(n);
	    int[] indx = keys(loop, n);

	    System.out.printf("%8d", n);

	    int k = 1000;
	    
	    double minbin = Double.POSITIVE_INFINITY;
		if (n < 100000){

		
			for (int i = 0; i < k; i++) {
			long t0 = System.nanoTime();
			linear(array, indx);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < minbin)
				minbin = t;
			}
		
	    System.out.printf("%8.0f", (minbin/1000));	    
		}
		else {
			double zero = 0;
			System.out.printf("%8.0f", (zero/1));
		}
	    double minlin = Double.POSITIVE_INFINITY;
	    
	    for (int i = 0; i < k; i++) {
		long t0 = System.nanoTime();
		binary(array, indx);
		long t1 = System.nanoTime();
		double t = (t1 - t0);
		if (t < minlin)
		    minlin = t;
	    }

	    System.out.printf("%8.0f" , (minlin/1000));	 
		System.out.printf("%8.0f\n" , ((minbin/1000)/(minlin/1000)));   	    
	}
    }
}
