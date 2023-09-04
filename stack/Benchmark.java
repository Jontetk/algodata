public class Benchmark {
    
    
    public static double bench(int turns,int ops, Stack stack) {
        double min = Double.POSITIVE_INFINITY;


        for (int i = 0; i < turns; i++) {
            System.gc();
            long t0 = System.nanoTime();
                for (int j = 0; j < ops; j++) {
                    stack.push(1);
                }
                for (int j = 0; j< ops; j++) {
                    stack.pop();
                }
            long t1 = System.nanoTime();
            if(t1-t0 < min)
                min = (t1-t0);
            
        }
        return min/1000;
    }

    public static void run(int ops){
        int turns = 1000;
        Stack staticStack = new StaticStack(ops);
        Stack dynamicStack = new DynamicStack();
        System.out.print(ops);
        bench(turns*10,ops,staticStack);
        double static_t = bench(turns,ops,staticStack);
        System.out.print("\t"+static_t);
        bench(turns*10,ops,dynamicStack);
        double dynamic_t = bench(turns,ops,dynamicStack); 
        System.out.print("\t"+dynamic_t);
        System.out.println("\t"+dynamic_t/static_t);

        System.out.println("");
    }


    public static void main(String[] args) {
        run(25);
        run(50);
        run(100);
        run(250);
        run(500);
        run(1000);





    }
}
