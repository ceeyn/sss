package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFeedDao;
import sss.service.TFeedService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFeedEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFeedServiceImpl implements TFeedService {


	private final TFeedDao dao;

	@Autowired
	public TFeedServiceImpl(TFeedDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFeedEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFeedEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFeedEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFeedEntity> select(TFeedEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFeedEntity> likeSelect(TFeedEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFeedEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "动态id", "用户id", "动态内容", "查看数", "数据状态1可用0不可用2用户删除", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "userId", "feedInfo", "viewNum", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
