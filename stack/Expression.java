public class Expression {
    public static void main(String[] args) {
        String input = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 + * + * + * + * + * + * + * +";
        String parts[] = input.split(" ");
        for (String part : parts){
            if (part.equals("*")) 
                System.out.println("new Item(ItemType.MUL),");
            else if (part.equals("+"))
                System.out.println("new Item(ItemType.ADD),");
            else
            System.out.println("new Item("+part+"),");
        }
    }
}
