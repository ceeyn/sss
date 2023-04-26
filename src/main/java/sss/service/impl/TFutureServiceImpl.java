package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFutureDao;
import sss.service.TFutureService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFutureEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFutureServiceImpl implements TFutureService {


	private final TFutureDao dao;

	@Autowired
	public TFutureServiceImpl(TFutureDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFutureEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFutureEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFutureEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFutureEntity> select(TFutureEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFutureEntity> likeSelect(TFutureEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFutureEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "动态id", "用户id", "动态详情", "展示类型，0app展示，1mail发送", "收件人邮箱", "天数", "展示时间", "状态,1新建2已发送0失效-1删除", "创建时间", "修改时间"};

		String[] headEngList = new String[]{ "id", "userId", "futureInfo", "type", "toMail", "days", "showTime", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
