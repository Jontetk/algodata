public class TestQuick {
    public static void main(String[] args) {
        int[] array = {5,4,33,3,3,5,-32,2,1};
        QuickArray.sort(array);
        for(int elem : array) {
            System.out.println(elem);
        }
    }
}
