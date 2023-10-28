public class Naive {
    
    
    
    private static Integer shortest(City from, City to, Integer max) {
        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
        for (int i = 0; i < from.connections.size(); i++) {
            if (from.connections.get(i) != null) {
                Connection conn = from.connections.get(i);
                Integer distance = shortest(conn.city, to, max-conn.minutes);
                if(distance !=null)
                    if(shrt == null || shrt > distance + conn.minutes)
                        shrt = distance+conn.minutes;
            }
        }
        return shrt;
    }

    public static void main(String[] args) {
        Map map = new Map("trains.csv");
        System.out.println(map.collisions);
        String from = "Göteborg";
        String to = "Umeå";
        Integer max = 710;
        long t0 = System.nanoTime();
        Integer dist = shortest(map.lookup(from), map.lookup(to), max);
        long time = (System.nanoTime() - t0) / 1_000_000;
        System.out.println("shortest: " + dist + " min (" + time + " ms)");
    }
}