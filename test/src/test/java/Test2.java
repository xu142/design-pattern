import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.*;
import jodd.util.concurrent.ThreadFactoryBuilder;

/**
 * @Author: An
 * @Date: 2021/11/30 15:25
 */
public class Test2 {
    public static void main(String[] args) {
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        long keepAliveTime = 5;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(10);
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit,
                workQueue, ((r, executor) -> {
            System.out.println("输出 属性");
            Method[] methods = r.getClass().getMethods();
            for (Method field : methods){
                System.out.println(field);
            }
        }));
        int size = 100;
        for (int i = 0; i < size; i++) {
            threadPool.execute(new Worker(i));
        }
        threadPool.shutdown();
    }

    static class Worker implements Runnable {
        private int workerName;

        public Worker(int s) {
            this.workerName = s;
        }
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.printf("(%s)= %d is running%n", name, this.workerName);
        }
    }
}
