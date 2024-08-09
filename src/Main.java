public class Main {

    public static void main(String[] args) {
        int age = 21;
        String name = "Toan Nguyen";
        boolean legal = age >= 18;

        System.out.println("Hello " + name + " ,you're " + age + " years old");
        
        String msg = legal ? ("You're legal to drink") : ("You're not allowed to drink this beer");
        System.out.println(msg);
    }
}
