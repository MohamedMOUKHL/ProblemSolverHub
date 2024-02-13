import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int nbMIN = 0;
        int nbMAX = 0;
        int ActualCountLow = scores.get(0);
        int ActualCountHigh = scores.get(0);
        int len = scores.size();
        for(int i = 0; i < len - 1; i++){
            if(ActualCountHigh < scores.get(i+1)){ 
                ActualCountHigh = scores.get(i+1);
                nbMAX++;
                
                }
        else if(ActualCountLow > scores.get(i+1)) {
                ActualCountLow = scores.get(i+1);
                nbMIN++;
                }
}

List<Integer> result = new ArrayList<>();
result.add(nbMAX);
result.add(nbMIN);

return result;

}
    public static void main(String[] args) {
        System.out.println(breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }
}
