package com.itheima.classLoader;

import java.io.*;
import java.nio.charset.CharsetDecoder;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ClassLoaderDemo01 {
    public static void main(String[] args) throws IOException {
        // 获取系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        // 获取加载源的输入流
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties properties = new Properties();
        properties.load(is);
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        // 关闭流
        is.close();

    }
}
