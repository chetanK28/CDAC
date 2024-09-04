public class AlphabetPyramid {
    public static void main(String[] args) {
        int n = 5; // rows for pyramid
        char alphabet = 'A'; 
        
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(alphabet);
                alphabet++; 
            }
            
            System.out.println();
        }
    }
    
}

