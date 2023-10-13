public class HeapTree {
    TreeNode root;

    public HeapTree() {
        root = null;
    }

    public void add(Integer value) {
        if(root == null)
            root = new TreeNode(value);
        else
            add(value,root);
    }
    private void add(Integer value,TreeNode node) {
        node.size +=1;
        if(value < node.value) {
            Integer temp = node.value;
            node.value = value;
            value = temp;
        }
        if (node.left == null) {
            node.left = new TreeNode(value);
            return;
        }
        if (node.right == null) {
            node.right = new TreeNode(value);
            return;
        }
        if(node.left.size < node.right.size) {
            add(value, node.left);
        }
        else {
            add(value,node.right);
        }
    }
    public Integer remove() {
        if (root == null)
            return null;
        else if (root.size == 1){
            Integer returnValue = root.value;
            root = null;
            return returnValue;
        }
        Integer returnValue = root.value;
        TreeNode current = root;
        while (current !=null) {
            current.size -= 1;
            if(current.left == null && current.right != null) {
                current.value = current.right.value;
                if(current.right.size == 1) {
                    current.right = null;
                    break;
                }
                else 
                    current = current.right;
            }
            else if (current.left != null && current.right == null) {
                current.value = current.left.value;
                if(current.left.size == 1) {
                
                    current.left = null;
                    break;
                }
                else 
                    current = current.left;
            }
            else if (current.right.value < current.left.value ) {
                current.value = current.right.value;
                if(current.right.size == 1) {
                
                    current.right = null;
                    break;
                }
                else 
                    current = current.right;
            }
            else {
                current.value = current.left.value;
                if(current.left.size == 1) {
                
                    current.left = null;
                    break;
                }
                else 
                    current = current.left;
            }

        }
        return returnValue;

    }
    public int push(Integer incr) {
        root.value += incr;
        TreeNode current = root;
        int depth = 0;
        while(((current.right!=null&&current.right.value < current.value)||(current.left!=null&& current.left.value < current.value))) {
            
            if(current.right!=null &&current.right.value<current.value) {
                Integer temp = current.right.value;
                current.right.value = current.value;
                current.value = temp;
                current = current.right;
                depth++;


            }
            else if(current.left!=null && current.left.value<current.value) {
                Integer temp = current.left.value;
                current.left.value = current.value;
                current.value = temp;
                current = current.left;
                depth++;

            }

        }
        return depth;
    }
    
}
