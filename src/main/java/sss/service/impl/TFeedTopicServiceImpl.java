package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFeedTopicDao;
import sss.service.TFeedTopicService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFeedTopicEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFeedTopicServiceImpl implements TFeedTopicService {


	private final TFeedTopicDao dao;

	@Autowired
	public TFeedTopicServiceImpl(TFeedTopicDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFeedTopicEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFeedTopicEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFeedTopicEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFeedTopicEntity> select(TFeedTopicEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFeedTopicEntity> likeSelect(TFeedTopicEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFeedTopicEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "id", "动态id", "话题id", "状态0不可用1可用", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "feedId", "topicId", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
