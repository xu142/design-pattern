import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Author: An
 * @Date: 2021/11/18 15:26
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String str = "{\"total\":1,\"items\":[{\"submittime\":\"1610899200000\"," +
                "\"casereason\":\"申请保全案件\",\"agent\":\"\",\"defendants\":\"被申请人-福建福晟集团有限公司\",\"abstracts\":\"\"," +
                "\"lawsuitUrl\":\"https://www.tianyancha.com/lawsuit/f110db2e5d244bd58319660d42b341bb\"," +
                "\"court\":\"广东省深圳市中级人民法院\",\"title\":\"东亚前海证券有限责任公司、福建福晟集团有限公司其他民事裁定书\"," +
                "\"caseno\":\"（2020）粤03财保127号\",\"uuid\":\"f110db2e5d244bd58319660d42b341bb\",\"SplitGids\":\"\"," +
                "\"url\":\"\",\"doctype\":\"裁定书\",\"judgetime\":\"2020-10-13\",\"thirdParties\":\"\"," +
                "\"parties\":\"\",\"casetype\":\"民事案件\",\"id\":\"323319391\",\"plaintiffs\":\"申请人-东亚前海证券有限责任公司\"}]},";
        String n = "null";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(n);
//        JsonNode total = jsonNode.get("total");
//        String strTotal = total.asText();
//        JsonNode items = jsonNode.get("items");
//        String result = items.toString();
////        String items = mapper.writeValueAsString(result);
//        System.out.println(result);
        JsonNode totalJsonNode = jsonNode.findValue("total");
        int total = 0;
        if (Objects.isNull(totalJsonNode)){
            System.out.println(total);
        } else{
            total = totalJsonNode.asInt();
        }
        System.out.println(total);

    }
}
