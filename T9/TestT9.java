import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TestT9 {

    public static void main(String[] args) {
        T9 tnie = new T9();
        ArrayList<String> arrrrrr = new ArrayList<String>();
         try (BufferedReader br = new BufferedReader(new FileReader("kelly.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                tnie.add(line);
                arrrrrr.add(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    
        for(String sräng : arrrrrr) {
            String sekvens = "";
            for(int i = 0; i<sräng.length();i++) {
               sekvens+=(T9.charToKey(sräng.charAt(i)));
            }
            ArrayList<String> returlista = tnie.decode(sekvens);
            if(!(returlista.contains(sräng)))
                System.out.println(sräng+sekvens);
        }
        System.out.println("succ");

    }
}
