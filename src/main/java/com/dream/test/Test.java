package com.dream.test;

import cn.hutool.json.JSONUtil;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String content = "{\"ActionStatus\":\"OK\",\"ErrorInfo\":\"\",\"ErrorCode\":0,\"QueryResult\":[{\"To_Account\":\"1242344161759948800\",\"State\":\"Offline\"},{\"To_Account\":\"1242654276978618368\",\"State\":\"Offline\"}]}";
        Map map = JSONUtil.toBean(content, Map.class);
        System.out.println(String.valueOf(map));
    }
}
