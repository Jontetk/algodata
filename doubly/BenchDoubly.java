import java.util.Random;
public class BenchDoubly {



    private static double benchiSingle(SingleLinkedList list,CellSingle[] randCells,int k) {
            double min = Double.POSITIVE_INFINITY;

            for (int i = 0; i < k; i++) {
    
            System.gc();
            long t0 = System.nanoTime();
            for(CellSingle cell:randCells){
                list.unlink(cell);
                list.insert(cell);
            }
            long t1 = System.nanoTime();
            double t = (t1 - t0);
            if (t < min)
                min = t;
            }
            return min;
    }
    private static double benchiDouble(Doubly list,Cell[] randCells,int k) {
        double min = Double.POSITIVE_INFINITY;


        for (int i = 0; i < k; i++) {

        System.gc();
        long t0 = System.nanoTime();
        for(Cell cell:randCells){
            list.unlink(cell);
            list.insert(cell);
        }
        long t1 = System.nanoTime();
 
        double t = (t1 - t0);
        if (t < min)
            min = t;
        }
        return min;
}

    public static Cell[] cellGen(int n) {
        Cell[] cells = new Cell[n];
        Cell current = new Cell(0, null, null);
        cells[0] = current;
        for (int i = 1; i<n;i++) {
            current = new Cell(i,null,current);
            current.prev.next = current;
            cells[i] = current;
        }
        return cells;
    }

    public static Doubly dobGen(Cell[] cells) {
        Doubly list = new Doubly();
        for(Cell cell:cells) {
            list.insert(cell);
        }
        return list;
    } 
    public static Cell[] pickCells(Cell[] cells,int k,int n,int seed) {
        Cell[] randCells = new Cell[k];
        Random rnd = new Random(seed);
        for(int i =0; i<randCells.length;i++){
            randCells[i] = cells[rnd.nextInt(0,n-1)];
        }
        return randCells;
    }


    public static CellSingle[] cellGenSingle(int n) {
        CellSingle[] cells = new CellSingle[n];
        CellSingle current = new CellSingle(0, null);
        cells[0] = current;
        for (int i = 1; i<n;i++) {
            current = new CellSingle(i,current);
            cells[i] = current;
        }
        return cells;
    }

    public static SingleLinkedList sinGen(CellSingle[] cells) {
        SingleLinkedList list = new SingleLinkedList();
        for(CellSingle cell:cells) {
            list.insert(cell);
        }
        return list;
    } 
    public static CellSingle[] pickCellsSingle(CellSingle[] cells,int k,int n,int seed) {
        CellSingle[] randCells = new CellSingle[k];
        Random rnd = new Random(seed);
        for(int i =0; i<randCells.length;i++){
            randCells[i] = cells[rnd.nextInt(0,n-1)];
        }
        return randCells;
    }

    public static void main(String[] args) {
        int[] sizes = {1000,1100,1200,1300,1400,1500,1600,3200,6400,12800,25600,51200,102400,204800};
        Random randForSeed = new Random();
        int seed = randForSeed.nextInt();

        
        for ( int n : sizes) {
            int k = 1000;
            Cell[] cells = cellGen(n);
            
            
            Doubly dList = dobGen(cells);
            Cell[] randCells = pickCells(cells, k, n, seed);
            
            System.out.printf("%8d", n);
            



            double minDoubly = benchiDouble(dList, randCells, k);
            System.out.printf("%8.0f" , (minDoubly/1000));	

            CellSingle[] cellsSingle = cellGenSingle(n);
            SingleLinkedList sList = sinGen(cellsSingle);
            CellSingle[] randSingles = pickCellsSingle(cellsSingle, k, n, seed);

            double minSingle = benchiSingle(sList, randSingles, k);
                        System.out.printf("%8.0f" , (minSingle/1000));	

    
            
	    
 

    


            System.out.println();
        }
        
    
    }
}


