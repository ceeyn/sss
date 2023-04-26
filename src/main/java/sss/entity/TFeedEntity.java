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

@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TFeedEntity extends CommonEntity implements Serializable {

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
	 *  动态内容
	 */
	@ApiModelProperty(value = "动态内容", name = "feedInfo")
    private String feedInfo;
    /**
	 *  查看数
	 */
	@ApiModelProperty(value = "查看数", name = "viewNum")
    private Integer viewNum;
    /**
	 *  数据状态1可用0不可用2用户删除
	 */
	@ApiModelProperty(value = "数据状态1可用0不可用2用户删除", name = "state")
    private Integer state;
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
