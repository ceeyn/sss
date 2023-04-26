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
public class TFutureEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  动态id
	 */
	@ApiModelProperty(value = "动态id", name = "id")
    private String id;
    /**
	 *  用户id
	 */
	@ApiModelProperty(value = "用户id", name = "userId")
    private String userId;
    /**
	 *  动态详情
	 */
	@ApiModelProperty(value = "动态详情", name = "futureInfo")
    private String futureInfo;
    /**
	 *  展示类型，0app展示，1mail发送
	 */
	@ApiModelProperty(value = "展示类型，0app展示，1mail发送", name = "type")
    private Integer type;
    /**
	 *  收件人邮箱
	 */
	@ApiModelProperty(value = "收件人邮箱", name = "toMail")
    private String toMail;
    /**
	 *  天数
	 */
	@ApiModelProperty(value = "天数", name = "days")
    private Integer days;
    /**
	 *  展示时间
	 */
	@ApiModelProperty(value = "展示时间", name = "showTime")
    private Date showTime;
    /**
	 *  状态,1新建2已发送0失效-1删除
	 */
	@ApiModelProperty(value = "状态,1新建2已发送0失效-1删除", name = "state")
    private Integer state;
    /**
	 *  创建时间
	 */
	@ApiModelProperty(value = "创建时间", name = "createTime")
    private Date createTime;
    /**
	 *  修改时间
	 */
	@ApiModelProperty(value = "修改时间", name = "updateTime")
    private Date updateTime;


}
