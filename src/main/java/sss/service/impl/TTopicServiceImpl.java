package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TTopicDao;
import sss.service.TTopicService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TTopicEntity;
import java.util.List;
import java.util.Map;

@Service
public class TTopicServiceImpl implements TTopicService {


	private final TTopicDao dao;

	@Autowired
	public TTopicServiceImpl(TTopicDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TTopicEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TTopicEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TTopicEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TTopicEntity> select(TTopicEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TTopicEntity> likeSelect(TTopicEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TTopicEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "id", "类型，0属性1话题", "属性id", "话题", "描述", "状态0不可用1可用", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "type", "propertyId", "topic", "describeInfo", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
