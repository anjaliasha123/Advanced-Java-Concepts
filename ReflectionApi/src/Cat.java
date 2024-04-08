public class Cat extends Animal{
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public void sayMeow(){
        System.out.println("Meow");
    }
    private void displayData(String data){
        System.out.println("Your data is: "+data);
    }
    public static void displayStaticMethod(){
        System.out.println("This is a static method");
    }
}
