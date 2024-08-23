public class MisplacedForLoopBody {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(i); // Only this line is part of the loop
        System.out.println("Done"); // This line is outside the loop
    }
}
