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
public class TFeedTopicEntity extends CommonEntity implements Serializable {

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
	 *  话题id
	 */
	@ApiModelProperty(value = "话题id", name = "topicId")
    private String topicId;
    /**
	 *  状态0不可用1可用
	 */
	@ApiModelProperty(value = "状态0不可用1可用", name = "state")
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
