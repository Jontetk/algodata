public class HashTest {
    public static void main(String[] args) {
        ZipArray zA = new ZipArray("postnummer.csv");
        Hash hash = new Hash("postnummer.csv");
        HashBetter has = new HashBetter("postnummer.csv");
        double min = Double.MAX_VALUE;
        long t0;
        long t1;
        double t;

        System.out.println(zA.lookup(11115).pop);
        System.out.println(zA.lookup(98499).pop);

        System.out.println(hash.lookup(11115).pop);
        System.out.println(hash.lookup(98499).pop);
        System.out.println(has.lookup(11115).pop);
        System.out.println(has.lookup(98499).pop);

        for (int i=0; i<1000;i++) {
            System.gc();
            t0 = System.nanoTime();
            zA.lookup(11115);
            t1 = System.nanoTime();
            t = (t1 - t0);
            if(t<min) {
                min = t;
            }
        }
        System.out.println(min/1000);
        
        min = Double.MAX_VALUE;;
        for (int i=0; i<1000;i++) {
        System.gc();
        t0 = System.nanoTime();
        zA.lookup(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);
        if(t<min) {
            min = t;
        }
        }
        System.out.println(min/1000);
        
        min = Double.MAX_VALUE;;
        for (int i=0; i<1000;i++) {
        System.gc();
        t0 = System.nanoTime();
        hash.lookup(11115);
        t1 = System.nanoTime();
        t = (t1 - t0);

        if(t<min) {
            min = t;
        }
        }
        System.out.println(min/1000);
        
        min = Double.MAX_VALUE;;
        for (int i=0; i<1000;i++) {
        System.gc();
        t0 = System.nanoTime();
        hash.lookup(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);

                if(t<min) {
            min = t;
        }
        }
    System.out.println(min/1000);
            min = Double.MAX_VALUE;;
        for (int i=0; i<1000;i++) {
        System.gc();
        t0 = System.nanoTime();
        has.lookup(11115);
        t1 = System.nanoTime();
        t = (t1 - t0);

        if(t<min) {
            min = t;
        }
        }
        System.out.println(min/1000);
        
        min = Double.MAX_VALUE;;
        for (int i=0; i<1000;i++) {
        System.gc();
        t0 = System.nanoTime();
        has.lookup(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);

                if(t<min) {
            min = t;
        }
        }
    System.out.println(min/1000);
    }
}
