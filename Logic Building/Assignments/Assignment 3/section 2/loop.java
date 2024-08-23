public class loop {
    public static void main(String[] args) { int total = 0;
    for (int i = 5; i > 0; i--) { total += i;
    if (i == 3) continue; total -= 1;
    }
    System.out.println(total);
    }
    }
    

    public class WhileLoopBreak {
        public static void main(String[] args) { int count = 0;
        while (count < 5) { System.out.print(count + " "); count++;
        if (count == 3) break;
        }
        System.out.println(count);
        }
        }
        