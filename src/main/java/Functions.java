import java.util.*;
import java.util.stream.Collectors;

public class Functions {

    public List<Student> topTenStudentHighScoreList(List<Student> students) throws Exception {
        if (students == null || students.size() < 10) {
            throw new Exception("Invalid size of list student");
        }
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getLt).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public Map<Student, Double> finalScore(List<Student> students) throws Exception {
        if (students == null || students.size() == 0) {
            throw new Exception("Invalid size of list student");
        }
        Map<Student, Double> result = new HashMap<>();
        for (Student student : students) {
            double mark = student.getBonus() * 0.1 + student.getReport() * 0.3 + student.getApp() * 0.15 + student.getLt() * 0.45;
            result.put(student, Math.round(mark*10)/10.0d);
        }
        return result;
    }

    public Map<Student,Double> theLowestFinalScore(Map<Student,Double> finalPoint) throws Exception {
        if(finalPoint == null || finalPoint.isEmpty()) {
            throw new Exception("Invalid size of list student");
        }
        return finalPoint.entrySet().stream().
                sorted(Map.Entry.comparingByValue())
                .limit(10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static void classStatistic(Map<Student,Double> students) throws Exception {
        if(students == null || students.isEmpty()) {
            throw new Exception("Invalid size of list student");
        }
        System.out.println("Số lượng sinh viên: " + students.size());

        long pass = students.entrySet().stream().filter(x -> x.getValue() > 4.5).count();
        System.out.println("Đạt: " + pass + " Tỉ lệ: " + (double) pass/students.size()*100 + "%" );
        int notPass = (int) (students.size() - pass);
        System.out.println("Không đạt: " + notPass + " Tỉ lệ: " + (double) notPass/students.size()*100 + "%" );

        int excellence = (int)students.entrySet().stream().filter(x -> x.getValue() >=8 && x.getValue() <=10 ).count();
        int middle = (int)students.entrySet().stream().filter(x -> x.getValue() >=6.5 && x.getValue() <8 ).count();
        int normal = (int)students.entrySet().stream().filter(x -> x.getValue() >=5 && x.getValue() <6.5 ).count();

        double rateExcellent = (double) excellence/students.size()*100;
        double rateGood = (double) middle/students.size()*100;
        double rateMedium = (double) normal/students.size()*100;
        System.out.println("Giỏi (điểm tổng kết 8 - 10) " + excellence + " Tỉ lệ: " + Math.round(rateExcellent*10)/10.0d + "%" );
        System.out.println("Khá (điểm tổng kết 6.5 - 8) " + middle + " Tỉ lệ: " + Math.round(rateGood*10)/10.0d + "%" );
        System.out.println("Trung bình (điểm tổng kết 5 - 6.5) " + normal + " Tỉ lệ: " +Math.round(rateMedium*10)/10.0d + "%" );
    }

}
