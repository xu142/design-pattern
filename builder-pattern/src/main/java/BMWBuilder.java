import java.util.ArrayList;

/**
 * @Author: Xiao An
 * @Description: 宝马车组装者
 * @Date Created in 2021--12--08 23:30
 * @Modified By:
 */

public class BMWBuilder extends CarBuilder{
    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
