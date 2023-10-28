import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    private class Path implements Comparable<Path>{
        private City city;
        private City prev;
        private Integer dist;
        private Integer index;
        
        

        public Path(City city, City prev, Integer dist) {
            this.city = city;
            this.prev = prev;
            this.dist = dist;
            this.index = city.id;
        }



        @Override 
        public int compareTo(Path path) {
            return this.dist.compareTo(path.dist);
        }


    }


    public ArrayList<City> shortest(City from, City to) {
        Path[] shortestPath = new Path[10];
        PriorityQueue<Path> queue = new PriorityQueue<Path>();
        queue.add(new Path(from, null, 0));
        while (true) {
        Path path = queue.remove();
        if(path.city == to){
            Path prevPath = path;
            ArrayList<City> arr = new ArrayList<City>();
            while(prevPath.prev != null){
                arr.add(prevPath.city);
                City prevCity = prevPath.prev;
                prevPath = shortestPath[prevCity.id];
            }
            arr.add(prevPath.city);
            return arr;
            
        }
        while(path.index >= shortestPath.length){
            Path[] newShortestPath = new Path[2*shortestPath.length];
            for(int i = 0;i<shortestPath.length;i++) {
                newShortestPath[i] = shortestPath[i];
            }
            shortestPath = newShortestPath;
        }
        shortestPath[path.index] = path;
        for(Connection connect:path.city.connections) {
            if(shortestPath.length>connect.city.id && shortestPath[connect.city.id] != null) {
                Path pathGot = shortestPath[connect.city.id];
                if(pathGot.dist > path.dist+connect.minutes){
                    pathGot.dist = path.dist+connect.minutes;
                    queue.remove(pathGot);
                    queue.add(pathGot);
                }
            }
            else {
                queue.add(new Path(connect.city, path.city, path.dist+connect.minutes));
            }

            

            
        }
        
        }
    }
    public static void main(String[] args) {
        Map map = new Map("europe.csv");
        String from = "Valencia";
        String to = "Kiruna";
        long t0 = System.nanoTime();
        Dijkstra pat = new Dijkstra();
        ArrayList<City> dist = pat.shortest(map.lookup(from), map.lookup(to));
        long time = (System.nanoTime() - t0) / 1_000_000;
        for(City city : dist) {
            System.out.println(city.name);
        }
        System.out.println("shortest: " + "dist" + " min (" + time + " ms)"); 
    }

}
