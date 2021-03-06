package com.github.zuihou.context;

/**
 * 常量工具类
 *
 * @author zuihou
 * @date 2018/12/21
 */
public class BaseContextConstants {
    /**
     * token
     */
    public static final String TOKEN_NAME = "token";
    /**
     * 用户id
     */
    public static final String JWT_KEY_USER_ID = "userid";
    /**
     * 用户名称
     */
    public static final String JWT_KEY_NAME = "name";
    /**
     * 用户账号
     */
    public static final String JWT_KEY_ACCOUNT = "account";


    /**
     * 是否boot项目
     */
    public static final String IS_BOOT = "boot";

    /**
     * 日志链路追踪id信息头
     */
    public static final String TRACE_ID_HEADER = "x-trace-header";
    /**
     * 日志链路追踪id日志标志
     */
    public static final String LOG_TRACE_ID = "trace";

    /**
     * 租户 编码
     */
    public static final String TENANT = "tenant";
    /**
     * 灰度发布版本号
     */
    public static final String GRAY_VERSION = "grayversion";
}
