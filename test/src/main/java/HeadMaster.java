import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: An
 * @Date: 2021/11/15 14:59
 */
public class HeadMaster<T> {

    private String school;

    private Consumer<List<T>> employsSpeak;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public HeadMaster(String school, Consumer<List<T>> employsSpeak) {
        this.school = school;
        this.employsSpeak = employsSpeak;
    }

    public Consumer<List<T>> getEmploysSpeak() {
        return employsSpeak;
    }

    public void setEmploysSpeak(Consumer<List<T>> employsSpeak) {
        this.employsSpeak = employsSpeak;
    }

    public void hhh(){
        Student student1 = new Student("3","张飞翔");
        Student student2 = new Student("2", "张飞翔啊");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        getEmploysSpeak().accept((List<T>) list);
    }
}
