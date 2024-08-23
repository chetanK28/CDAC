public class IncorrectWhileLoopControl {
    public static void main(String[] args) {
        int num = 10;
        while (num <= 10) { // Assignment instead of comparison
            System.out.println(num);
            num--;
        }
    }
}
