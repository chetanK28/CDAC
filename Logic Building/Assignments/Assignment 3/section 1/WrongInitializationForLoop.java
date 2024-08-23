public class WrongInitializationForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i++) { // The loop should decrement, not increment
            System.out.println(i);
        }
    }
}
