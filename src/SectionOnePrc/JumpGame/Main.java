package SectionOnePrc.JumpGame;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        int test1[] = {0,8,2,0,9};
        int test2[] = {2,1,0,2,3,2,8,5,7,10,9,9,6,6,3,4,2,9,9,0};

        System.out.println(s.canJump(test1));
        System.out.println(s.canJump(test2));
    }
}
