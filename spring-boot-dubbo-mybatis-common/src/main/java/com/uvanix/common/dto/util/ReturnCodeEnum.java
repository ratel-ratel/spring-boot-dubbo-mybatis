package com.uvanix.common.dto.util;

/**
 * 接口返回值枚举
 * <p>
 * Created by admin on 2016/1/23.
 */
public enum ReturnCodeEnum {
    CODE_1000(1000, "成功"), // 数据处理成功
    CODE_1001(1001, "无权限访问"), // 系统应用间对签名或TOKEN验证不通过
    CODE_1002(1002, "信息不存在"), // 数据信息不存在
    CODE_1003(1003, "支付方式错误"), // 数据错误，数据校验不通过，数据不符合接口规则
    CODE_1004(1004, "服务器处理异常"), // 异常
    CODE_1005(1005, "失败"), // 数据处理失败，如：保存、发送
    CODE_1006(1006, "参数不全"), // 用户输入或接口入参缺少
    CODE_1007(1007, "请求超时"), // 系统应用间通讯超时
    CODE_1008(1008, "信息已存在"),//数据重复
    CODE_1009(1009, "登录状态已失效, 请重新登录"),// 客户端TOKEN验证不通过或用户登录账户相关问题
    CODE_1010(1010, "验证失败"); //短信或者邮箱验证失败


    /**
     * 业务编号
     */
    private Integer code;

    /**
     * 业务值
     */
    private String value;

    private ReturnCodeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public final Integer getCode() {
        return code;
    }

    public final String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.code + "=" + this.value;
    }
}
