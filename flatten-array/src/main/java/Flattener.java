import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Flattener{
    public Flattener(){

    }

    public List<Object> flatten (List<Object> input){
        LinkedList<Object> stack = new LinkedList<>(input);
        List<Object> flattenedList = new ArrayList<>();
        while(!stack.isEmpty()){
            Object e = stack.pop();
            if (e instanceof List<?>){
                stack.addAll(0, (List<?>) e);
            } else {
                if (e != null)
                    flattenedList.add(e);
            }
        }

        
                
        return flattenedList;
    }

    
}
