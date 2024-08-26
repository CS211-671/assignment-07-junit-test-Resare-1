package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UnitTest {
    @Test
    @DisplayName("changeName test")
    void changeName() {
        Student student = new Student("123", "John Doe");
        student.changeName("Jane Doe");
        assertEquals("Jane Doe", student.getName());
    }

    @Test
    @DisplayName("addScore test")
    void addScore() {
        Student student = new Student("123", "John Doe", 50);
        student.addScore(30);
        assertEquals(80, student.getScore());
    }

    @Test
    @DisplayName("grade test")
    void grade() {
        Student student = new Student("123", "John Doe", 85);
        assertEquals("A", student.grade());
    }

    @Test
    @DisplayName("FindStudentById test")
    public void FindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("001", "John Doe", 75);
        studentList.addNewStudent("002", "Jane Doe", 85);

        Student actual = studentList.findStudentById("001");

        assertEquals("001", actual.getId());
        assertEquals("John Doe", actual.getName());
        assertEquals(75, actual.getScore(), 0.01);
    }
    @Test
    @DisplayName("testGiveScoreToId test")
    public void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("001", "John Doe", 75);

        studentList.giveScoreToId("001", 10);

        Student actualStudent = studentList.findStudentById("001");
        assertNotNull(actualStudent);
        assertEquals(85, actualStudent.getScore(), 0.01);
    }
    @Test
    @DisplayName("testViewGradeOfId test")
    public void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("001", "John Doe", 85);
        studentList.addNewStudent("002", "Jane Doe", 75);

        String expectedGrade = "A";
        String actualGrade = studentList.viewGradeOfId("001");

        assertEquals(expectedGrade, actualGrade);
    }
}

