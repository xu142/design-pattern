package extend;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: An
 * @Date: 2021/12/22 16:28
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo{

    /*
     * 用户的基本信息
     */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }
}
