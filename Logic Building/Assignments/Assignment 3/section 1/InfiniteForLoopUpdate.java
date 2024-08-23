public class InfiniteForLoopUpdate {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i += 2) { // The loop might terminate early or not as expected
            System.out.println(i);
        }
    }
}
