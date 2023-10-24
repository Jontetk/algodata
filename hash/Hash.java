import java.io.BufferedReader;
import java.io.FileReader;

public class Hash {

    Bucket[] data;
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
        public Node lookup(Integer zip) {
            for (int index = 0; index < bucket.length ; index++) {
                if (bucket[index].zip.equals(zip)) {
                    return bucket[index];
                }
            }
            return null;
            
            

        }

    }


    public Hash(String file) {
        mod = 10000;
        data =new Bucket[mod];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = (Integer.valueOf(row[0].replaceAll("\\s","")))%mod;
                if (data[code] == null) {
                    data[code] = new Bucket();
                }
                data[code].add(new Node(Integer.valueOf(row[0].replaceAll("\\s","")),row[1], Integer.valueOf(row[2])));
            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    public Node lookup(Integer zip) {
        
        return data[zip%mod].lookup(zip);
    }
}
