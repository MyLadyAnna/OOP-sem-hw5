import View.StudentView;

/**
 * Реализация;
 */
public class Main {
    public static void main(String[] args) {
        StudentView stView = new StudentView();
        stView.saveStudent("Misha","22",25,"22b");

        stView.getStudent("Misha");
        stView.getStudent("Ivan");
        stView.getStudent("Ivan");

        
    }
}
