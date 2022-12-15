public class task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double[] Array = new double[10];
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1 + "(на ноль делить нельзя)");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}

