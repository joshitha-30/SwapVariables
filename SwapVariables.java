public class SwapVariables {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 20;

        System.out.println("Before swapping:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        // Swap var1 and var2 using a third variable
        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("After swapping:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }
}
