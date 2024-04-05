public class Main {
    public static void main(String[] args) {
        // println prints on a new line each time, whereas print does so on the same line
        System.out.println("Hello World");

        int No1 = 2;
        int No2 = 3;

        System.out.println(No1 + No2);
        int No3 = No2 + No1;

        if (No3 == 5) {
            System.out.println("No3 is 5");
        } else {
            System.out.println("No3 is not 5");
        }
    }
}
