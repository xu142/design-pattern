import java.util.ArrayList;

/**
 * @Author: Xiao An
 * @Description: 奔驰车组装者
 * @Date Created in 2021--12--08 23:28
 * @Modified By:
 */

public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
