import java.util.ArrayList;

public class City {
    ArrayList<Connection> connections;
    String name;
    
    public City(String name) {
        this.connections = new ArrayList<Connection>();
        this.name = name;

    }
    public void connect(City nxt, int dst) {
        this.connections.add(new Connection(nxt, dst));
        nxt.connections.add(new Connection(this, dst));
    }


}
