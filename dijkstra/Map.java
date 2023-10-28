import java.io.BufferedReader;
import java.io.FileReader;

public class Map {
    public int collisions;
    private City[] cities;
    private final int mod = 541;
    Integer id = 0;
    public Map(String file) {
        cities = new City[mod];
        collisions = 0;
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                City cityOne = lookup(row[0]);
                City cityTwo = lookup(row[1]);
                cityOne.connect(cityTwo, Integer.valueOf(row[2].replaceAll("\\s","")));
        }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(line);
        }
    }
    private Integer hash(String name) {
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash = (hash*31 % mod) + name.charAt(i);
        }
        return hash % mod;
    }


    private void add(String name, Integer code) {
        int ind = code;
        while(cities[ind] != null && ind+1 != cities.length) {
            ind++;
        }
        if(ind+1 == cities.length) {
            City[] newCity = new City[2*cities.length];
            for (int i = 0; i<cities.length;i++) {
                newCity[i] = cities[i];
            }
            cities = newCity;
            add(name,ind+1);
        }
        else {
            cities[ind] = new City(name,id);
            id++;
        }
    }

    public City lookup(String name) {
        int localcoll = 0;
        int ind = hash(name);
        if(cities[ind] == null) {
            add(name, ind);
        }

        while(!(cities[ind].name.equals(name))&&ind < cities.length) {
            ind++;
            localcoll++;
            if(cities[ind] == null) {
                add(name, ind);
                collisions += localcoll;
            }
            

        }
        if(ind < cities.length)
            return cities[ind];
        
        else
            return null;
    }

}