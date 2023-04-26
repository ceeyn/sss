package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFeedPhotoDao;
import sss.service.TFeedPhotoService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFeedPhotoEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFeedPhotoServiceImpl implements TFeedPhotoService {


	private final TFeedPhotoDao dao;

	@Autowired
	public TFeedPhotoServiceImpl(TFeedPhotoDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFeedPhotoEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFeedPhotoEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFeedPhotoEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFeedPhotoEntity> select(TFeedPhotoEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFeedPhotoEntity> likeSelect(TFeedPhotoEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFeedPhotoEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "照片id", "动态id", "照片url", "可用状态1可用0不可用", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "feedId", "url", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
