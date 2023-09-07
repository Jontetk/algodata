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
    int[] arrayone = sorted(120);
    int[] arraytwo = sorted(50);
    ArrayList<Integer> d1 = dupliLin(arrayone, arraytwo);
    ArrayList<Integer> d2 = dupliBin(arrayone, arraytwo);
    ArrayList<Integer> d3 = dupliNew(arrayone, arraytwo);

    System.out.println(d1.toString());
    System.out.println(d2.toString());
    System.out.println(d3.toString());
    for(int elem : arrayone)
        System.out.print(elem+" ");
    System.out.println();
    for(int elem : arraytwo)
        System.out.print(elem+" ");

}

}
