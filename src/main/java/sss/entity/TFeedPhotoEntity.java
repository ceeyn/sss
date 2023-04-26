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
public class TFeedPhotoEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  照片id
	 */
	@ApiModelProperty(value = "照片id", name = "id")
    private String id;
    /**
	 *  动态id
	 */
	@ApiModelProperty(value = "动态id", name = "feedId")
    private String feedId;
    /**
	 *  照片url
	 */
	@ApiModelProperty(value = "照片url", name = "url")
    private String url;
    /**
	 *  可用状态1可用0不可用
	 */
	@ApiModelProperty(value = "可用状态1可用0不可用", name = "state")
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
