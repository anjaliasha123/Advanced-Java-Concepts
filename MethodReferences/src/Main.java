import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        SayableInterface sayableInterface = NonStaticClass::new;
        sayableInterface.sayHi();
    }
}
//        SayableInterface sayableInterface = Main::sayHello;
//        sayableInterface.sayHi();
//        List<String> strings = List.of("hello","..."," ","\t","\n","[]");
//        Predicate<String> condition = String::isBlank;
//        MethodReferenceExample obj = new MethodReferenceExample();
//        long ans = obj.countBasedOnCondition(strings,condition);
//        System.out.println("ans: "+ans);