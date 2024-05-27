public class App{
    public static void main(String[] args){
        int var1 = (int)(Math.random() * 51);
        int var2 = (int)(Math.random() * 51);
        int var3 = (int)(Math.random() * 2);

        if (var3 == 1){
            System.out.println("Adding...");
            System.out.println(var1 + var2);
        } else{
            System.out.println("Subtracting...");
            System.out.println(var1 - var2);
        }
    }
}
