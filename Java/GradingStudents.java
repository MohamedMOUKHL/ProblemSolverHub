import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
            int multiple5 = 0;
            int len = grades.size();
            for(int i = 0; i < len; i++){
                if(grades.get(i) >= 38)    
                {for(int j = 0; j <= 5; j++){
                            if((grades.get(i)+j) % 5 == 0){
                                    multiple5 = grades.get(i) + j;
                                    break;
                            }    
                    }
                    if(multiple5 - grades.get(i) < 3){
                            grades.set(i, multiple5);
                    }
                    else continue;}
            }
            return grades;
    }
     public static void main(String[] args) {
        // Creating a list of grades
        List<Integer> grades = new ArrayList<>();
        grades.add(37);
        
        grades.add(38);
       

        // Calling the gradingStudents method and printing the result
        List<Integer> updatedGrades = gradingStudents(grades);
        System.out.println("Updated Grades: " + updatedGrades);
    }
}
