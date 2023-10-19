public class TestT9 {
    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','x','y','z','å','ä','ö'};
        for (char kar : array) {
            System.out.println(T9.charToKey(kar));
        }
    }
}
