package com.dove.com.dove.simpletest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by dove.zhang on 2016/4/25.
 */
public class FutrureTest {
    public static void main(String[] args) {

        String s = "dfdljfjfdsfasfd";
        s.contains("df");

        Map<String, String> m = new HashMap<String, String>();
        s.codePointCount(1, 2);

        List<Integer> list = new ArrayList<Integer>();
        System.out.println("i am sout");
        list.add(3);
        list.add(3);

        ExecutorService exec = Executors.newCachedThreadPool();
        Future<String> future = exec.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 999999999; i > 0; i--)
                    ;
                return "test future";
            }
        });
        try {
            // 等待计算结果，最长等待timeout秒，timeout秒后中止任务
            String result = future.get(50, TimeUnit.MICROSECONDS);
            System.out.println(result);
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("future over");


        final String userId = "123454";
        System.out.println("run run ");
        exec.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("异步用户"+userId+"理财开户");
                try {
                    Thread.sleep(10000);
                    System.out.println("用户+userId+异步通知开通理财等待10秒");
                } catch (Exception e) {
                    System.out.println("用户" + userId + "通知开通理财等待10秒异常");
                }

            }
        });

        System.out.println("run zhihou ");
        System.out.println("zjg local edit");
    }
}
