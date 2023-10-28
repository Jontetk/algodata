public class Paths {
    City[] path;
    int sp;

    public Paths() {
        path = new City[54];
        sp = 0;
    }
    private Integer shortest(City from, City to) {
        return shortest(from,to,null);
    }


    private Integer shortest(City from, City to,Integer max) {
        if(max != null && max < 0)
            return null;
        if(from == to)
            return 0;
        Integer shrt = null;
        for (int i = 0; i < sp; i++) {
            if (path[i] == from)
                return null;
        }
        path[sp++] = from;
        for (int i = 0; i < from.connections.size(); i++) {
            if (from.connections.get(i) != null) {
                Connection conn = from.connections.get(i);

                    Integer distance;
                    if(max != null)
                        distance = this.shortest(conn.city, to,max-conn.minutes);
                    else 
                        distance = this.shortest(conn.city, to,null);
                if(distance !=null) {
                    max = shrt;
                    if(shrt == null || shrt > distance + conn.minutes)
                        shrt = distance+conn.minutes;
                }
                
            }
        }
        path[sp--] = null;
        return shrt;
    }
    public static void main(String[] args) {
        Map map = new Map("trains.csv");
        String from = "Göteborg";
        String to = "Umeå";
        long t0 = System.nanoTime();
        Paths pat = new Paths();
        Integer dist = pat.shortest(map.lookup(from), map.lookup(to));
        long time = (System.nanoTime() - t0) / 1_000_000;
        System.out.println("shortest: " + dist + " min (" + time + " ms)"); 
    }

}