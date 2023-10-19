import java.io.BufferedReader;
import java.io.FileReader;

public class HashBetter {

    Node[] data;
    int max;
    int mod;

    public class Node {
        Integer zip;
        String name;
        Integer pop;
        public Node(Integer zip,String name, Integer pop) {
            this.zip = zip;
            this.name = name;
            this.pop = pop;
        }
    }

    private void add(Node nod,Integer code) {
        int ind = code;
        while(data[ind] != null && ind+1 != data.length) {
            ind++;
        }
        if(ind+1 == data.length) {
            Node[] newData = new Node[2*data.length];
            for (int i = 0; i<data.length;i++) {
                newData[i] = data[i];
            }
            data = newData;
            add(nod,ind+1);
        }
        else {
            data[ind] = nod;
        }
    }

    public HashBetter(String file) {
        mod = 10000;
        data =new Node[mod*2];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = (Integer.valueOf(row[0].replaceAll("\\s","")))%mod;
                add(new Node(Integer.valueOf(row[0].replaceAll("\\s","")),row[1], Integer.valueOf(row[2])),code);
            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    public Node lookup(Integer zip) {
    
        int ind = zip%mod;
        while(!(data[ind].zip.equals(zip))) {
            ind++;
        }
        return data[ind];
    }
}
