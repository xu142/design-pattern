package extend;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: An
 * @Date: 2021/12/22 16:32
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    /*
     * 员工的工作信息， 比如， 职位等
     */
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
