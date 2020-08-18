package com.gahui.ghmall.comm.constant;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
public class Constant {
    /**
     * 数据库中数据记录有效状态
     */
    public final static Byte STATUS_EFF = 1;
    /**
     * 数据库中数据记录无效状态
     */
    public final static Byte STATUS_EXP = 0;

    /**
     * 查询条件，时间降序条件
     */
    public final static String GOODS_ORDER_BY_CREATE_TIME_DESC = "create_time desc";

    /**
     * 查询条件，商品销量降序条件
     */
    public final static String GOODS_ORDER_BY_SELL_NUM_DESC = "goods_sell_num desc";

    /**
     * 查询条件，广告序号降序条件
     */
    public final static String ADVERTISEMENT_ORDER_BY_SEQ_DESC = "advertisement_seq desc";

    /**
     * 查询条件，通知序号降序条件
     */
    public final static String NOTICE_ORDER_BY_SEQ_DESC = "notice_seq desc";

    /**
     * 查询条件，分类ID升序
     */
    public final static String CATEGORY_ORDER_BY_ID_ASC = "category_id asc";

    /**
     * 分页查询限制
     */
    public final static int PAGE_NUM_LIMIT = 1000;
    public final static int PAGE_SIZE_LIMIT = 1000;

    /**
     * 响应成功状态码
     */
    public final static String RESPONSE_SUCCESS_CODE = "6666";

    /**
     * 响应失败状态码
     */
    public final static String RESPONSE_FAIL_CODE = "9527";

    /**
     * token鉴权失败状态码
     */
    public final static String RESPONSE_AUTH_FAIL_CODE = "0000";

    /**
     * token有效时间，设置为一小时
     */
    public final static Long TOKEN_EXPIRED_TIME = 60 * 60 * 1000L;

    /**
     * token加密算法秘钥
     */
    public final static String TOKEN_ALGORITHM_SECRET = "%#%H7B**^&*(";

    /**
     * token存储的key--->用户名
     */
    public final static String TOKEN_USER_NAME = "username";

    /**
     * token存储的key--->密码
     */
    public final static String TOKEN_PASS_WORD = "password";

    /**
     * http工具类常量
     */
    public final static String RSP_CODE = "status";
    public final static String RSP_HEAD = "headers";
    public final static String RSP_BODY = "body";

}
