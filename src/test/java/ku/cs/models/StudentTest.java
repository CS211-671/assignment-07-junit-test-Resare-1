package ku.cs.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 40,30 คะแนน")
    void testAddScore(){
        Student s1 = new Student("6610402256", "StudentTest");
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 10 จากเดิม 50 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s1 = new Student("6610402256", "StudentTest",50);
        s1.addScore(10);
        assertEquals("C",s1.grade());
    }
}