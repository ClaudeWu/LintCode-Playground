package SectionOne.ArrayList;

// drive code
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        // run create method
        System.out.println(s.create(5));
        // run get method
        System.out.println(s.get(s.list, 0));
        System.out.println(s.get(s.list, 1));
        System.out.println(s.get(s.list, 4));
        // run clone method
        System.out.println(s.clone(s.list));
        // run get method
        System.out.println(s.get(s.listClone, 2));
        // run indexOf method
        System.out.println(s.indexOf(s.listClone, 1));
        System.out.println(s.indexOf(s.listClone, 10));
        // run remove method
        s.remove(s.listClone, 3);
        // run get method
        System.out.println(s.get(s.listClone, 3));
        // run set method
        s.set(s.listClone, 2, 3);
        // run get method
        System.out.println(s.get(s.listClone, 2));
        System.out.println(s.get(s.listClone, 3));
    }
}
