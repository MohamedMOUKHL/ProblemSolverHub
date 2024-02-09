public class Conversion {
    public static String timeConversion(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder resultConv = new StringBuilder();
        int hours = Integer.parseInt(s.substring(0, 2));
        if (charArray[8] == 'P') {
            if (hours != 12) {
                hours += 12;
            }
            resultConv.append(String.format("%02d", hours));
        } else {
            
            if (hours == 12) {
                resultConv.append("00");
            } else {
                resultConv.append(s, 0, 2);
            }
        }
    
        resultConv.append(s, 2, 8);
        return resultConv.toString();
    }
    

public static void main(String[] args) {
    String conv = timeConversion("07:05:45PM");
    System.out.println(conv);
    
}
}
