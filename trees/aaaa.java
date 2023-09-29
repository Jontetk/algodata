if(next.right != null && returnNode.key < next.right.key){
                    System.out.println(returnNode.key+"if2");
                    stack.push(next);
                    next = next.right;
                    stack.push(next);
                    while (next.left!=null) {
                        next = next.left;
                        stack.push(next);
                    }
                }
                else if(next.key > returnNode.key){
                    System.out.println(returnNode.key+"elif");
                    stack.push(next);
                }
                else{
                    System.out.println(returnNode.key+"else");
                    stack.push(next);
                    while (!(next.right != null && returnNode.key < next.right.key)&&next.key < returnNode.key&&next != root){
                        next = stack.pop();
                    }
                }