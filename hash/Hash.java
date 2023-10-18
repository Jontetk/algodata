import java.io.BufferedReader;
import java.io.FileReader;

public class Hash {

    Node[] data;
    int max;
    int mod;
    public class Node {
        String name;
        Integer pop;
        public Node(String name, Integer pop) {
            this.name = name;
            this.pop = pop;
        }
    }
    private class Bucket {
        Node[] bucket;
        int indx;
        public Bucket() {
            bucket = new Node[4];
            indx = 0;
        }
        public void add(Node node) {
            if (indx >= bucket.length) {
                Node[] newBucket = new Node[2*bucket.length];
                for (int i = 0; i<bucket.length;i++) {
                    newBucket[i] = bucket[i];
                }
                bucket = newBucket;
            }
            bucket[indx] = node;
            indx++;
        }

    }


    public Hash(String file) {
        mod = 10000;
        data = new Node[mod];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
                data[code] = new Node( row[1], Integer.valueOf(row[2]));

            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    public Node lookup(int zip) {
        return (data[zip]);
    }
}
