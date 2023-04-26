package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TAppVersionDao;
import sss.service.TAppVersionService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TAppVersionEntity;
import java.util.List;
import java.util.Map;

@Service
public class TAppVersionServiceImpl implements TAppVersionService {


	private final TAppVersionDao dao;

	@Autowired
	public TAppVersionServiceImpl(TAppVersionDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TAppVersionEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TAppVersionEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TAppVersionEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TAppVersionEntity> select(TAppVersionEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TAppVersionEntity> likeSelect(TAppVersionEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TAppVersionEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "主键编号", "版本名称", "版本号", "更新标识，1正常、2强制", "更新内容", "apk完整名称", "apk下载路径", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "versionName", "versionCode", "updateFlag", "updateInfo", "apkName", "apkUrl", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
