import java.io.BufferedReader;
import java.io.FileReader;

public class Zip {
    Node[] data;
    int max;

    public class Node {
        String code;
        String name;
        Integer pop;
        public Node(String code, String name, Integer pop) {
            this.code = code;
            this.name = name;
            this.pop = pop;
        }



    }

    public Zip(String file) {

        data = new Node[9676];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                data[i++] = new Node(row[0], row[1], Integer.valueOf(row[2]));
            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    public Node linear(String zip) {
        for (int index = 0; index < data.length ; index++) {
            if (data[index].code.equals(zip)) {
                return data[index];
            }
        }
        return null;
    }
    public Node binary(String zip) {
        int first = 0;
        int last = data.length-1;
        int index = (last+first)/2 ;
        while (true) {

            index = (last+first)/2 ;
            if (data[index].code.equals(zip)) {
            break;
        }
        if (Integer.valueOf(data[index].code.replaceAll(" ","")) < Integer.valueOf(zip.replaceAll(" ","")) && index < last) {
            first = index+1;
            continue;
        }
        if (Integer.valueOf(data[index].code.replaceAll(" ","")) > Integer.valueOf(zip.replaceAll(" ","")) && index > first) {

            last = index-1;
            continue;
        }
        return null;
        
        }
        return data[index];
        
    }
}
