public class ZipTest {
    public static void main(String[] args) {
        ZipNew zip = new ZipNew("postnummer.csv");
        ZipArray zA = new ZipArray("postnummer.csv");
        long t1;
        long t0;
        double t;
        double min;

        min = Double.MAX_VALUE; 
        
        for(int i  =0; i<1000 ;i++) {
        System.gc();
        t0 = System.nanoTime();
        zA.lookup(11115);
        t1 = System.nanoTime();
        t = (t1 - t0);
        if(t<min)
            min = t;
    }


        System.out.println(min/1000);


        min = Double.MAX_VALUE; 
        
        for(int i  =0; i<1000 ;i++) {
        System.gc();
        t0 = System.nanoTime();
        zA.lookup(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);
        if(t<min)
            min = t;
    }



        System.out.println(min/1000);

                min = Double.MAX_VALUE; 
        
        for(int i  =0; i<1000 ;i++) {
        System.gc();
        t0 = System.nanoTime();
        zip.binary(11115);
        t1 = System.nanoTime();
        t = (t1 - t0);

                if(t<min)
            min = t;
    }

        System.out.println(min/1000);

                min = Double.MAX_VALUE; 
        
        for(int i  =0; i<1000 ;i++) {
        System.gc();
        t0 = System.nanoTime();
        zip.binary(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);

                if(t<min)
            min = t;
    }

        System.out.println(min/1000);
    }
}
