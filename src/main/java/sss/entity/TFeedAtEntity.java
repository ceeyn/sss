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
public class TFeedAtEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  id
	 */
	@ApiModelProperty(value = "id", name = "id")
    private String id;
    /**
	 *  动态id
	 */
	@ApiModelProperty(value = "动态id", name = "feedId")
    private String feedId;
    /**
	 *  被@用户id
	 */
	@ApiModelProperty(value = "被@用户id", name = "atUserId")
    private String atUserId;
    /**
	 *  是否已经查看，0未查看1已查看
	 */
	@ApiModelProperty(value = "是否已经查看，0未查看1已查看", name = "isLook")
    private Integer isLook;
    /**
	 *  数据状态1可用0不可用-1用户删除
	 */
	@ApiModelProperty(value = "数据状态1可用0不可用-1用户删除", name = "state")
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
