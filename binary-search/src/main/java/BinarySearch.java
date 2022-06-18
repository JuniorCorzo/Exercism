import java.util.List;

public class BinarySearch{
    List<Integer> sortedList;
    
    public BinarySearch(List<Integer> sortedList) throws ValueNotFoundException{
        this.sortedList = sortedList;

      
    }

    public int indexOf(int numSearch) throws ValueNotFoundException{
        if (this.sortedList.isEmpty()){
            throw new ValueNotFoundException("Value not in array");
        }

        if (sortedList.size() == 1 || sortedList.get(0) == numSearch) return 0;
        
        int index = sortedList.size() / 2;
        int indexReal = 0;
        while (sortedList.get(index) != numSearch){
            if (indexReal == sortedList.size() / 2){
                throw new ValueNotFoundException("Value not in array");
            }
            
            if (sortedList.get(index) > numSearch){
                index--;
            } else {
                index ++;
            }
            indexReal++;
        }
        return index;
    }
}
