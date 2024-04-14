import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public long countBasedOnCondition(List<String> data, Predicate<String> condition){
        return data.stream()
                .filter(condition)
                .count();
    }

}
