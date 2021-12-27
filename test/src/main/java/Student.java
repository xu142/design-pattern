/**
 * @Author: An
 * @Date: 2021/11/15 14:57
 */
public class Student {

    private String grade;

    private String name;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public void talk(){
        System.out.println(name);
    }
}
