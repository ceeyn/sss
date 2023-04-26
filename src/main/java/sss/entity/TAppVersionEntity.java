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
public class TAppVersionEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  主键编号
	 */
	@ApiModelProperty(value = "主键编号", name = "id")
    private String id;
    /**
	 *  版本名称
	 */
	@ApiModelProperty(value = "版本名称", name = "versionName")
    private String versionName;
    /**
	 *  版本号
	 */
	@ApiModelProperty(value = "版本号", name = "versionCode")
    private Integer versionCode;
    /**
	 *  更新标识，1正常、2强制
	 */
	@ApiModelProperty(value = "更新标识，1正常、2强制", name = "updateFlag")
    private Integer updateFlag;
    /**
	 *  更新内容
	 */
	@ApiModelProperty(value = "更新内容", name = "updateInfo")
    private String updateInfo;
    /**
	 *  apk完整名称
	 */
	@ApiModelProperty(value = "apk完整名称", name = "apkName")
    private String apkName;
    /**
	 *  apk下载路径
	 */
	@ApiModelProperty(value = "apk下载路径", name = "apkUrl")
    private String apkUrl;
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
