package Service;

import java.util.List;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;

public class StudyGroupService {
   private StudyGroup studyGroup;
   
    public void CreatGroupService(List<Student> student, Teacher teacher) {
        this.studyGroup = new StudyGroup(teacher, student);
   }

   public StudyGroup getStudyGroup() {
    return studyGroup;
   }
}
