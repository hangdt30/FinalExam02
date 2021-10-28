import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        //Question 1
        System.out.println("The student list");
        List<Student> studentList = StudentData.createData();
        System.out.println(studentList);
        System.out.println("-----------");

        Functions function = new Functions();

        //Question 2
        System.out.println("The top ten of student of lt score");
        System.out.println(function.topTenStudentHighScoreList(studentList));
        System.out.println("-----------");

        //Question 3
        Map<Student,Double> finalScore = function.finalScore(studentList);


        //Question 4
        System.out.println("The student list having lowest score");
        Map<Student,Double> top10LowestFinalMark = function.theLowestFinalScore(finalScore);
        for (Map.Entry<Student,Double> item: top10LowestFinalMark.entrySet()) {
            System.out.println(item.getKey().toString() + ",final mark: " + item.getValue());
        }
        System.out.println("-----------");

        //Question 5
        System.out.println("The final score of all students");
        for (Map.Entry<Student,Double> item: finalScore.entrySet()) {
            System.out.println(item.getKey().toString() + ",final mark: " + item.getValue());
        }
        System.out.println("-----------");

        //Question 6
        System.out.println("Rating");
        function.classStatistic(finalScore);

    }


}
