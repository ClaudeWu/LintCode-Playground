package WarmUpTwo.Reference;

/**
 * LintCode 456.Reference
 * Link: https://www.lintcode.com/problem/454/
 *
 * Implement the class ReferenceManager. Include the following two methods:
 * 1. copyValue(Node obj). This would just copy the value from parameter obj to the public attribute node.
 *    But obj and node are still two difference instances / objects.
 * 2. copyReference(Node obj). This would copy the reference from obj to node.
 *    So that both node and obj are point to the same object.
 *
 * Example1:
 * Java:
 *     Rectangle rec = new Rectangle(3, 4);
 *     rec.getArea(); // should get 12，3*4=12
 *
 * Python:
 *     rec = Rectangle(3, 4)
 *     rec.getArea()
 *
 * Example2:
 * Java:
 *     Rectangle rec = new Rectangle(4, 4);
 *     rec.getArea(); // should get 16，4*4=16
 *
 * Python:
 *     rec = Rectangle(4, 4)
 *     rec.getArea()
 *
 */

// Definition of Node
class Node {
    public int val;
    public Node(int val) {
        this.val = val;
    }
}

public class Solution {
    public Node node;

    public void copyValue(Node obj) {
        // check corner case
        if (obj == null) {
            return;
        }
        // copy value from obj to node
        if (node == null) {
            node = new Node(obj.val);
            System.out.println("Copy the value from obj");
        }
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
        node = obj;
        System.out.println("Copy the reference from obj");
    }
}
