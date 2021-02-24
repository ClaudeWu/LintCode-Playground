package SectionOnePrc.Reference;

/*
 * LintCode 456. Reference
 * Implement the class ReferenceManager. Include the following two methods:
 * 1. copyValue(Node obj). This would just copy the value from parameter obj to the public attribute node.
 * But obj and node are still two difference instances / objects.
 * 2. copyReference(Node obj). This would copy the reference from obj to node.
 * So that both node and obj are point to the same object.
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
