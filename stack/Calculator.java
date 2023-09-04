public class Calculator {
    Item[] expr;
    int ip;
    Stack stack;
    public Calculator(Item[] expr) {
        this.expr = expr;
        this.ip = 0;
        this.stack = new DynamicStack();
        }
        
    public int run() {
    while ( ip < expr.length ) {
        step();
    }
    try{
    return stack.pop();
    }
    catch (Exception e){
        System.out.println(e);
        return 0;
    }
    }

    public static void main(String[] args) {
        // 10 + 2 * 5
        // 10 2 5 * + in reversed Polish notation
        Item[] expr = {

            Item.Value(1),
            Item.Value(2),
            Item.Value(3),
            Item.Value(4),
            Item.Value(5),
            Item.Value(6),
            Item.Value(7),
            Item.Value(8),
            Item.Value(9),
            Item.Value(10),
            Item.Value(11),
            Item.Value(12),
            Item.Value(13),
            Item.Value(14),
            Item.Value(15),
            Item.Value(16),            
            Item.Value(1),
            Item.Value(2),
            Item.Value(3),
            Item.Value(4),
            Item.Value(5),
            Item.Value(6),
            Item.Value(7),
            Item.Value(8),
            Item.Value(9),
            Item.Value(10),
            Item.Value(11),
            Item.Value(12),
            Item.Value(13),
            Item.Value(14),
            Item.Value(15),
            Item.Value(16),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add(),
            Item.Add()
        };
        Calculator calc = new Calculator(expr);
        int res = calc.run();
        System.out.println(" Calculator: res = " + res);
        }



    public void step() {
    Item nxt = expr[ip++];
    try {
    switch(nxt.getType()) {
    case ADD : {
    int y = stack.pop();
    int x = stack.pop();
    stack.push(x + y);
    break;
    }
    case SUB : {
    int y = stack.pop();
    int x = stack.pop();
    stack.push(x - y);
    break;

    }

    case MUL : {
    int y = stack.pop();
    int x = stack.pop();
    stack.push(x * y);
    break;

    }
    
    case DIV : {
    int y = stack.pop();
    int x = stack.pop();
    stack.push(x / y);
    break;

    }

    case VALUE : {
        stack.push(nxt.getValue());

    }
    }
    }
    catch (StackException e) {
        System.out.println(e);
    }
    }
        
    }

