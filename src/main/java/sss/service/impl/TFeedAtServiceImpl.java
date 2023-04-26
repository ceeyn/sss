package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFeedAtDao;
import sss.service.TFeedAtService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFeedAtEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFeedAtServiceImpl implements TFeedAtService {


	private final TFeedAtDao dao;

	@Autowired
	public TFeedAtServiceImpl(TFeedAtDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFeedAtEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFeedAtEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFeedAtEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFeedAtEntity> select(TFeedAtEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFeedAtEntity> likeSelect(TFeedAtEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFeedAtEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "id", "动态id", "被@用户id", "是否已经查看，0未查看1已查看", "数据状态1可用0不可用-1用户删除", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "feedId", "atUserId", "isLook", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
