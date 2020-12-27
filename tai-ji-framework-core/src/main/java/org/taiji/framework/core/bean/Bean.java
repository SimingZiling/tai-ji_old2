package org.taiji.framework.core.bean;

import org.taiji.framework.core.exception.BeanException;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean 实现IOC实现的重要部分，包含程序众所有的bean信息
 */
public class Bean {

    /**
     * bean信息Map集合
     */
    protected static Map<String,BeanInfo> beanInfoMap = new HashMap<String, BeanInfo>();

    /**
     * 获取Bean信息
     * @param beanName bean名称
     * @return bean信息
     */
    public BeanInfo getBeanInfo(String beanName) throws BeanException {
        if(beanInfoMap.containsKey(beanName)){
            throw new BeanException("不存在名字为："+beanName+"的Bean！");
        }
        return beanInfoMap.get(beanName);
    }

    /**
     * 获取bean信息Map集合
     * @return bean信息map集合
     */
    public static Map<String, BeanInfo> getBeanInfoMap() {
        return beanInfoMap;
    }
}
