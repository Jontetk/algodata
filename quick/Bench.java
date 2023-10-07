import java.util.Random;
public class Bench {



    private static double benchiList(LinkedList lista,int k) {
            double min = Double.POSITIVE_INFINITY;
            
            


            for (int i = 0; i < k; i++) {
            Node next = lista.first;
            LinkedList listCopy = new LinkedList();
            while(next!= null)  {
                Node nextcopy = new Node(next.head, next.next);
                listCopy.insert(nextcopy);
                next = next.next;
            }


            System.gc();
            long t0 = System.nanoTime();
            QuickList.sort(listCopy);
            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;
    }

    private static double benchiArray(int[] array,int k) {
            double min = Double.POSITIVE_INFINITY;
            
            for (int i = 0; i < k; i++) {
            int[] arraycopy = new int[array.length];
                for(int j = 0; j < array.length; j++) {
                    arraycopy[j] = array[j];
                }

            System.gc();
            long t0 = System.nanoTime();
            QuickArray.sort(arraycopy);
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
            LinkedList lista = new LinkedList();
            for(int elem:randNod) {
                lista.insert(new Node(elem, null));
            }


            System.out.printf("%8d", n);
            
            


            double minLista = benchiList(lista, k);
            System.out.printf("%8.0f" , (minLista/1000));	
            
            double minArray = benchiArray(randNod, k);
            System.out.printf("%8.0f" , (minArray/1000));



            System.out.println();
        }
        
    
    }
}


