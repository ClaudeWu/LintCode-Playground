package WarmUpTwo.Reference;

public class Main {
    public static void main(String[] args) {
        Node n = new Node(5);
        Solution s = new Solution();
        s.copyValue(n);
        s.copyReference(n);
    }
}
