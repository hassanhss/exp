package cn.think.in.java.open.exp.client;

import java.util.List;

/**
 * @Author cxs
 * 插件返回的的注册器.
 **/
public interface PluginObjectRegister {

    /**
     * 注册
     */
    List<Class<?>> register() throws Exception;
}
