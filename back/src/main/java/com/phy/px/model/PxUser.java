package com.phy.px.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PxUser extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键ID（用户名）
     */
    private String userId;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 联系方式
     */
    private String mobile;

    /**
     * 地址
     */
    private String address;

    /**
     * 注册时间
     */
    private String createTime;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 是否冻结（0：未冻结，1：已冻结）
     */
    private String frozenState;

    /**
     * 错误次数
     */
    private String errorTimes;

    /**
     * 积分
     */
    private String integral;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 是否是管理员
     */
    private String isAdmin;


}
