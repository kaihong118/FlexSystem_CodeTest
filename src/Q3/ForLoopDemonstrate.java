package Q3;

public class ForLoopDemonstrate {
    public static void main(String[] args) {
        int number = 5;
        output(number);
    }

    public static void output (int number) {
        for(int i = 0; i < number; i++) {
            for(int j = 1; j <= (number - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 1; i < number; i++) {
            for(int j = 1; j <= (i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
