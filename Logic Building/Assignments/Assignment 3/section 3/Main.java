//Calculate the sum of the first 50 natural numbers:
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum of first 50 natural numbers: " + sum);
    }
}



// Compute the factorial of the number 10:
public class Main {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 10: " + factorial);
    }
}




// Print all multiples of 7 between 1 and 100:
public class Main {
    public static void main(String[] args) {
        for (int i = 7; i <= 100; i += 7) {
            System.out.println(i);
        }
    }
}


// Reverse the digits of the number 1234 (output: 4321):
public class Main {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}



// Print the Fibonacci sequence up to the number 21:
public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;
        
        while (a <= 21) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}



// Find and print the first 5 prime numbers:

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        
        while (count < 5) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


// Calculate the sum of the digits of the number 9876 (output: 30):

public class Main {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}


// Count down from 10 to 0, printing each number:

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}


// Find and print the largest digit in the number 4825:

public class Main {
    public static void main(String[] args) {
        int number = 4825;
        int largest = 0;
        
        while (number != 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number /= 10;
        }
        
        System.out.println("Largest digit: " + largest);
    }
}


// Print all even numbers between 1 and 50:

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}


// Demonstrate the use of both pre-increment and post-decrement operators in a single expression:

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x - x--;
        System.out.println("Result: " + y);
    }
}


// Draw the pattern:
// *****
// *****
// *****
// *****
// *****

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 5*5*5*5*5
// 5*5*5*5*5
// 4*4*4*4
// 3*3*3
// 2*2
// 1


public class Main {
    public static void main(String[] args) {
        // Top half
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}




// *
// **
// ***
// *****
// *******
// *********


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// *
// **
// ***
// ****
// *****


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// *
// ***
// *****
// *******
// *********

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// *****
// ****
// ***
// **
// *


public class Main {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// *
// ***
// *****
// *******
// *****
// ***
// *

public class Main {
    public static void main(String[] args) {
        int n = 4;
        
        // Top half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// 1
// 1*2
// 1*2*3
// 1*2*3*4
// 1*2*3*4*5


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}



// 5
// 5*4
// 5*4*3
// 5*4*3*2
// 5*4*3*2*1
public class Main {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
                if (j > 6 - i) System.out.print("*");
            }
            System.out.println();
        }
    }
}



// 1
// 1*3
// 1*3*5
// 1*3*5*7
// 1*3*5*7*9


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print(j);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}


// *********
// *******
// *****
// ***
// *
// ***
// *****
// *******
// *********


public class Main {
    public static void main(String[] args) {
        int n = 5;
        
        // Top half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Bottom half
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// 11111
// 22222
// 33333
// 44444
// 55555


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



// 1
// 22
// 333
// 4444
// 55555



public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



// 1
// 12
// 123
// 1234
// 12345


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


public class Main {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}





