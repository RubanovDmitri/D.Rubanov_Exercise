import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTasks {

    public static List<Integer> transformMinus(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        return stream.map(x -> {
            if (x < 0) x = x * -1;
            else x *= 1;
            return x;
        }).toList();
    }

    public static List<Integer> secondStreamTask(List<Integer> list){
        Stream<Integer> stream = list.stream();
        return stream.map(x->{
            if(x%2==0) x*=100;
            else x-=100;
            return x;
        }).toList();
    }

    public static List<String> surnamesTask(List<String> list){
        Stream<String> stream = list.stream();
        return stream.filter(x-> x.startsWith("А")).toList();
    }
}