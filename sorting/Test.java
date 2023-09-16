public class Test {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,34,12,2,5};
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        Sort selection = new Selection();
        Sort insertion = new Insertion();
        Sort merge = new MergeAlt();

        selection.sort(arr1);
        insertion.sort(arr2);
        merge.sort(arr3);
        for (int elem:arr1)
            System.out.print(" "+elem+" ");
        System.out.println("");
        for (int elem:arr2)
            System.out.print(" "+elem+" ");
        System.out.println("");
        for (int elem:arr3)
            System.out.print(" "+elem+" ");
        System.out.println("");
    }
}
