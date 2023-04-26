package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFeedActionDao;
import sss.service.TFeedActionService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFeedActionEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFeedActionServiceImpl implements TFeedActionService {


	private final TFeedActionDao dao;

	@Autowired
	public TFeedActionServiceImpl(TFeedActionDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFeedActionEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFeedActionEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFeedActionEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFeedActionEntity> select(TFeedActionEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFeedActionEntity> likeSelect(TFeedActionEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFeedActionEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "操作id", "操作类型，0点赞1收藏", "动态id", "用户id", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "type", "feedId", "userId", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
