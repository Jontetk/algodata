import java.io.BufferedReader;
import java.io.FileReader;
public class ZipNew {


    Node[] data;
    int max;

    public class Node {
        Integer code;
        String name;
        Integer pop;
        public Node(Integer code, String name, Integer pop) {
            this.code = code;
            this.name = name;
            this.pop = pop;
        }



    }

    public ZipNew(String file) {

        data = new Node[9675];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
                data[i++] = new Node(code, row[1], Integer.valueOf(row[2]));

            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    public Node linear(Integer zip) {
        for (int index = 0; index < data.length ; index++) {
            if (data[index].code == zip) {
                return data[index];
            }
        }
        return null;
    }
    public Node binary(Integer zip) {
        int first = 0;
        int last = data.length-1;
        int index = (last+first)/2 ;
        while (true) {

            index = (last+first)/2 ;
            if (data[index].code.equals(zip)) {
            break;
        }
        if (data[index].code < zip && index < last) {
            first = index+1;
            continue;
        }
        if (data[index].code > zip && index > first) {

            last = index-1;
            continue;
        }
        return null;
        
        }
        return data[index];
        
    }
}


