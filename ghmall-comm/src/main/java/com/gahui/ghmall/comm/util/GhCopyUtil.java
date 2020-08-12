package com.gahui.ghmall.comm.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
public class GhCopyUtil {

    /**
     * @param sourceList 来源集合
     * @param clazz 需要转换成的目标类
     * @param <T>
     * @param <K>
     * @return 换成的目标类实例对象集合
     */
    public static <T, K> List<T> copyListProperties(List<K> sourceList, Class<T> clazz) {
        if (CollectionUtils.isEmpty(sourceList)) {
            return null;
        }

        ArrayList<T> target = new ArrayList<>();
        for (K k : sourceList) {
            target.add(copyProperties(k, clazz));
        }
        return target;
    }

    /**
     *
     * @param source 来源对象
     * @param clazz 需要转换成的目标类
     * @param <T>
     * @param <K>
     * @return 换成的目标类实例对象
     */
    public static <T, K> T copyProperties(K source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        T t = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(source, t);
        return t;
    }

}
