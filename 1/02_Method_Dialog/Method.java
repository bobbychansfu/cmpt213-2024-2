
class Method {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String n = "Alice";
        int a = 20;

        greet(n,a);

    }
    private static void greet(String name, int age) {
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}