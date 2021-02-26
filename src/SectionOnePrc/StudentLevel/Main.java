package SectionOnePrc.StudentLevel;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution("Andy");
        s.score = 10;
        System.out.println(s.getLevel());
        s.score = 60;
        System.out.println(s.getLevel());
    }
}
