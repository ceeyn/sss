package sss.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.util.Date;
import java.util.Date;
import java.util.Date;

@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TUserEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  用户id
	 */
	@ApiModelProperty(value = "用户id", name = "id")
    private String id;
    /**
	 *  用户编号
	 */
	@ApiModelProperty(value = "用户编号", name = "uid")
    private Integer uid;
    /**
	 *  用户名
	 */
	@ApiModelProperty(value = "用户名", name = "username")
    private String username;
    /**
	 *  密码
	 */
	@ApiModelProperty(value = "密码", name = "password")
    private String password;
    /**
	 *  手机号
	 */
	@ApiModelProperty(value = "手机号", name = "phone")
    private String phone;
    /**
	 *  性别，-1未知，0女1男
	 */
	@ApiModelProperty(value = "性别，-1未知，0女1男", name = "sex")
    private Integer sex;
    /**
	 *  QQ号
	 */
	@ApiModelProperty(value = "QQ号", name = "qq")
    private String qq;
    /**
	 *  头像路径
	 */
	@ApiModelProperty(value = "头像路径", name = "avatar")
    private String avatar;
    /**
	 *  个性签名
	 */
	@ApiModelProperty(value = "个性签名", name = "signature")
    private String signature;
    /**
	 *  融云token
	 */
	@ApiModelProperty(value = "融云token", name = "imToken")
    private String imToken;
    /**
	 *  数据状态1可用0不可用
	 */
	@ApiModelProperty(value = "数据状态1可用0不可用", name = "state")
    private Integer state;
    /**
	 *  登录时间
	 */
	@ApiModelProperty(value = "登录时间", name = "loginTime")
    private Date loginTime;
    /**
	 *  创建时间
	 */
	@ApiModelProperty(value = "创建时间", name = "createTime")
    private Date createTime;
    /**
	 *  更新时间
	 */
	@ApiModelProperty(value = "更新时间", name = "updateTime")
    private Date updateTime;


}
