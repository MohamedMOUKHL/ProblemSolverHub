import java.util.ArrayList;
import java.util.List;

public class AppleOrg {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleIn = 0;
        int orangeIn = 0;
for(int elmnt : apples){
        elmnt += a;
        if(s <= elmnt && elmnt >= t) {appleIn++;}
}
for(int elmnt : oranges){
        elmnt += b;
        if(s <= elmnt && elmnt >= t) {orangeIn++;}
}


System.out.println(appleIn); 
System.out.println(orangeIn); 
}

public static void main(String[] args) {
        // Creating a list of apples
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        // Creating a list of oranges
        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);
        // Calling the countApplesAndOranges method
        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
}
}
