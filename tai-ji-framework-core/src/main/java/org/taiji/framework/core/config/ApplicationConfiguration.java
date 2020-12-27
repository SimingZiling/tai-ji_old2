package org.taiji.framework.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 应用程序Config
 */
public class ApplicationConfiguration {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 配置Map集合
     */
    private static Map<Object, Object> configurationMap = new HashMap<Object, Object>();

    /**
     * 添加配置
     * @param configName 配置名称
     * @param configValue 配置值
     */
    public void setConfig(String configName,Objects configValue){
        configurationMap.put(configName,configValue);
    }

    /**
     * 获取配置
     * @param configName 配置名称
     * @return 值
     */
    public Object getConfig(String configName){
        return configurationMap.get(configName);
    }

}
