package sss.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sss.service.TFeedPhotoService;
import sss.core.annotation.LoginRequired;
import sss.core.annotation.RecordLog;
import sss.entity.PageData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import sss.entity.TFeedPhotoEntity;
import java.util.List;

@RestController
@Api(tags = "tFeedPhoto接口")
@RequestMapping("/tFeedPhoto")
public class TFeedPhotoController {


	private final TFeedPhotoService service;

	@Autowired
	public TFeedPhotoController(TFeedPhotoService service) {
		this.service = service;
	}

	/**
	 * 查询
	 *
	 * @return
	 */
	@ApiOperation(value = "查询")
	@LoginRequired
	@RecordLog
	@PostMapping(value = "/select")
	public List<TFeedPhotoEntity> select(@RequestBody TFeedPhotoEntity entity) {
		return service.select(entity);
	}

	/**
	 * 模糊查询
	 *
	 * @return
	 */
	@ApiOperation(value = "模糊查询")
	@LoginRequired
	@RecordLog
	@PostMapping(value = "/likeSelect")
	public PageData<TFeedPhotoEntity> likeSelect(@RequestBody TFeedPhotoEntity entity) {
		return service.likeSelect(entity);
	}

	/**
	 * 更新
	 *
	 * @return
	 */
	@ApiOperation(value = "更新")
	@LoginRequired
	@RecordLog
	@PostMapping(value = "/update")
	public void update(@RequestBody TFeedPhotoEntity entity) {
		service.update(entity);
	}

	/**
	 * 添加
	 *
	 * @return
	 */
	@ApiOperation(value = "添加")
    @LoginRequired
	@RecordLog
	@PostMapping(value = "/add")
	public void add(@RequestBody TFeedPhotoEntity entity) {
		service.add(entity);
	}

	/**
	 * 删除
	 *
	 * @return
	 */
	@ApiOperation(value = "删除")
	@LoginRequired
	@RecordLog
	@PostMapping(value = "/delete")
	public void delete(@RequestBody TFeedPhotoEntity entity) {
		service.delete(entity);
	}

	/**
	 * 导出excel
	 *
	 * @return
	 */
	@ApiOperation(value = "导出excel")
	@LoginRequired
	@RecordLog
	@GetMapping("/exportExcel")
	public void exportExcel(TFeedPhotoEntity entity, HttpServletResponse response) {
		service.exportExcel(entity, response);
	}

}
