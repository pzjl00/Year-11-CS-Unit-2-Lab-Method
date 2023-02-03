public class Method {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
        int sum2 = add(1,2,3,4);
        System.out.println(sum2);
        String name = morningGreeting("Phoebe!");
        System.out.println(name);
        String name2 = afternoonGreeting("Phoebe!");
        System.out.println(name2);
        String word = triple("ya");
        System.out.println(word);
        int quotient = half(10);
        System.out.println(quotient);
        double round = roundPositiveValueToNearestInteger(5.55);
        System.out.println(round);
        double round2 = roundNegativeValueToNearestInteger(-5.55);
        System.out.println(round2);
    }

    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int b, int c, int d, int e) {
        return b+c+d+e;
    }

    public static String morningGreeting(String name){
        return "Good morning," + name;
    }

    public static String afternoonGreeting(String name2){
        return "Good afternoon," + name2;
    }

    public static String triple(String word){
        return word + word + word;
    }

    public static int half(int z){
        return z/2;
    }

    public static double roundPositiveValueToNearestInteger(double a){
        a = a + 0.5;
        int myInt = (int)a;
        return myInt;
    }

    public static double roundNegativeValueToNearestInteger(double b){
        b = b + 0.5;
        int Int = (int)b;
        return Int;
    }

}
