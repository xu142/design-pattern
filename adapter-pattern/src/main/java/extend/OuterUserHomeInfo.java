package extend;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: An
 * @Date: 2021/12/22 16:29
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    /*
     * 员工的家庭信息
     */
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
