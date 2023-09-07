import java.util.Random;
import java.util.ArrayList;

public class Duplicates {
    

private static int[] sorted(int n) {
    Random rnd = new Random();
    int[] array = new int[n];
    int nxt = 0;
    for (int i = 0; i < n ; i++) {
        nxt += rnd.nextInt(10) + 1;
        array[i] = nxt;
    }
    return array;
}

public static ArrayList<Integer> dupliLin(int[] arrayone, int[] arraytwo) {
    ArrayList<Integer> duplicates = new ArrayList<Integer>();
    for (int elem : arrayone) {

        if (Linear.search(arraytwo, elem))
            duplicates.add(elem);

        }
    return duplicates;
    }


public static ArrayList<Integer> dupliBin(int[] arrayone, int[] arraytwo) {
    ArrayList<Integer> duplicates = new ArrayList<Integer>();
    for (int elem : arrayone) {
        if(Binary.search(arraytwo, elem))
            duplicates.add(elem);
    }
    return duplicates;

}
public static ArrayList<Integer> dupliNew(int[] arrayone, int[] arraytwo) {
    int index1 = 0;
    int index2 = 0;
    ArrayList<Integer> duplicates = new ArrayList<Integer>();
    while(index1 < arrayone.length && index2 < arraytwo.length) {



        if (arraytwo[index2]<arrayone[index1]) {
            index2++;
        }
        else if(arraytwo[index2]==arrayone[index1]) {
            duplicates.add(arrayone[index1]);
            index1++;            
        }
        else if (arraytwo[index2]>arrayone[index1]) {
            index1++;
        }

    }
    return duplicates;

}
public static void main(String[] args) {
    int[] sizes = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600,3200,6400,12800,25600};
    
    for ( int n : sizes) {


	    

	    System.out.printf("%8d", n);

	    int k = 1000;
	    
	    double minlin = Double.POSITIVE_INFINITY;
        double minbin = Double.POSITIVE_INFINITY;
        double minnew = Double.POSITIVE_INFINITY;


		
        for (int i = 0; i < k; i++) {
            int[] array1 = sorted(n);
            int[] array2 = sorted(n);
            System.gc();   
            long tlin0 = System.nanoTime();
            dupliLin(array1, array2);
            long tlin1 = System.nanoTime();
            double tlin = (tlin1 - tlin0);
            System.gc();
            long tbin0 = System.nanoTime();
            dupliBin(array1, array2);
            long tbin1 = System.nanoTime();
            double tbin = (tbin1 - tbin0);
            System.gc();
            long tnew0 = System.nanoTime();
            dupliNew(array1, array2);
            long tnew1 = System.nanoTime();
            double tnew = (tnew1 - tnew0);
        if (tlin < minlin) {
				minlin = tlin;
        }
        if (tbin  < minbin) {
            minbin = tbin;
        }
        if (tnew < minnew) {
            minnew = tnew;
        }
		
    	    
	}
        System.out.printf("%8.0f", (minlin/1000));	    
		System.out.printf("%8.0f", (minbin/1000));	  

	    


	    System.out.printf("%8.0f\n" , (minnew/1000));	
    }
}
}
