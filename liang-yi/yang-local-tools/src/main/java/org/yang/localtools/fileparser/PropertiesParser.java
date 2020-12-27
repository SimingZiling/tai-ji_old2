package org.yang.localtools.fileparser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Properties文件解析
 */
public class PropertiesParser{


    /**
     * properties 转换为 map
     * @param file 文件
     * @return map数据
     */
    private static Map<Object,Object> propertiesToMap(File file){
        try (InputStream inputStream = new FileInputStream(file)){
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    /**
     * properties 转换为 map
     * @param path 路径
     * @return map数据
     */
    private static Map<Object, Object> propertiesToMap(String path){
        File file = new File(path);
        return propertiesToMap(file);
    }

}
