package Model;
/**
 * Teacher - шаблон учителя на основе User
 */
public class Teacher extends User {
    String teacherSubject;

    public Teacher(String name, String group, int age, String teacherSubject) {
        super(name, group, age);
        this.teacherSubject = teacherSubject;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                "teacherSubject='" + teacherSubject + '\'' +
                '}';
    }
}
