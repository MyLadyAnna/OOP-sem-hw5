package View;

import Controller.StudentController;

//1. Создать package – view. Работу продолжаем в нем
//2. Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход
public class StudentView {
    StudentController controllerStudent = new StudentController();

    public StudentView(StudentController controllerStudent) {
        this.controllerStudent = controllerStudent;
    }

    public StudentView() {
    }

    public void saveStudent(String name, String group, int age, String studentId) {
        controllerStudent.addStudent(name, group, age, studentId);
    }

    public void getStudent(String name) {
        controllerStudent.getStudent(name);
    }


}
