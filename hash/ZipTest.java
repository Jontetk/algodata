public class ZipTest {
    public static void main(String[] args) {
        ZipNew zip = new ZipNew("postnummer.csv");
        ZipArray zA = new ZipArray("postnummer.csv");
        System.gc();
        long t0 = System.nanoTime();
        zA.lookup(11115);
        long t1 = System.nanoTime();
        double t = (t1 - t0);
        System.out.println(t/1000);
        System.gc();
        t0 = System.nanoTime();
        zA.lookup(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);
        System.out.println(t/1000);
        System.gc();
        t0 = System.nanoTime();
        zip.binary(11115);
        t1 = System.nanoTime();
        t = (t1 - t0);
        System.out.println(t/1000);
        System.gc();
        t0 = System.nanoTime();
        zip.binary(98499);
        t1 = System.nanoTime();
        t = (t1 - t0);
        System.out.println(t/1000);
    }
}
