package before;

/**
 * @Author: An
 * @Date: 2021/12/23 18:43
 */
public class Manager extends Employee{

    //这类人物的职责非常明确： 业绩
    private String performance;
    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    protected String getOtherInfo(){
        return "业绩： "+ this.performance + "\t";
    }
}
