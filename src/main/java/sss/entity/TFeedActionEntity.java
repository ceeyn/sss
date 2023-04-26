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
public class TFeedActionEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  操作id
	 */
	@ApiModelProperty(value = "操作id", name = "id")
    private String id;
    /**
	 *  操作类型，0点赞1收藏
	 */
	@ApiModelProperty(value = "操作类型，0点赞1收藏", name = "type")
    private Integer type;
    /**
	 *  动态id
	 */
	@ApiModelProperty(value = "动态id", name = "feedId")
    private String feedId;
    /**
	 *  用户id
	 */
	@ApiModelProperty(value = "用户id", name = "userId")
    private String userId;
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
