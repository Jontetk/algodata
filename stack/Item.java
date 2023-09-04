public class Item {
    private ItemType type;
    private int value;
    
    public Item(int value) {
        this.type = ItemType.VALUE;
        this.value = value;
    }
    public Item(ItemType type) {
        this.type = type;
        this.value = 0;
    }


    public ItemType getType() {
        return this.type;
    }
    public int getValue() {
        return this.value;
    }
    public static Item Add(){
        return new Item(ItemType.ADD);
    }
    public static Item Sub(){
        return new Item(ItemType.SUB);
    }
    public static Item Mul(){
        return new Item(ItemType.SUB);
    }
    public static Item Div(){
        return new Item(ItemType.SUB);
    }
    public static Item Value(int value){
        return new Item(value);
    }
  
}