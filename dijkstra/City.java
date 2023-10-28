import java.util.ArrayList;

public class City {
    public ArrayList<Connection> connections;
    public String name;
    public Integer id;
    
    public City(String name,Integer id) {
        connections = new ArrayList<Connection>();
        this.name = name;
        this.id = id;

    }
    public void connect(City nxt, int dst) {
        connections.add(new Connection(nxt, dst));
        nxt.connections.add(new Connection(this, dst));
    }


}
