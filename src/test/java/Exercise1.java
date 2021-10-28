import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Exercise1 {
    Functions function = new Functions();

    @Test
    public void testCase_01() {
        List<Student> student = new ArrayList<>();
        try{
            student = StudentData.createData();
        }catch (Exception ex) {
            Assert.fail();
        }
        Assert.assertTrue(student!= null);
    }
    @Test
    public void testCase_02() {
        List<Student> student = new ArrayList<>();
        try{
            student = StudentData.createData();
        }catch (Exception ex) {
            Assert.fail();
        }
        Assert.assertTrue(student.size() >= 10);
    }
    @Test
    public void testCase_03() throws Exception {
        List<Student> studentList = StudentData.createData();
        List<Student> result = new ArrayList<>();
        try{
            result = function.topTenStudentHighScoreList(studentList);
        }catch (Exception ex) {
            Assert.fail();
        }

        Assert.assertTrue(result.size() == 10);
    }
    @Test
    public void testCase_04() throws Exception {
        List<Student> studentList = StudentData.createData();
        Map<Student,Double> result = new HashMap<>();
        try{
            result = function.finalScore(studentList);
        }catch (Exception ex) {
            Assert.fail();
        }

        Assert.assertTrue(result.size() == studentList.size());
    }
    @Test
    public void testCase_05() throws Exception {
        List<Student> studentList = StudentData.createData();
        Map<Student,Double> result = function.finalScore(studentList);
        try{
            Map<Student,Double> top10= function.theLowestFinalScore(result);
            Assert.assertTrue(top10.size() == 10);
        }catch (Exception ex) {
            Assert.fail();
        }
    }

}
