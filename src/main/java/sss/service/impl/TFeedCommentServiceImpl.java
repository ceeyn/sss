package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TFeedCommentDao;
import sss.service.TFeedCommentService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TFeedCommentEntity;
import java.util.List;
import java.util.Map;

@Service
public class TFeedCommentServiceImpl implements TFeedCommentService {


	private final TFeedCommentDao dao;

	@Autowired
	public TFeedCommentServiceImpl(TFeedCommentDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TFeedCommentEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TFeedCommentEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TFeedCommentEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TFeedCommentEntity> select(TFeedCommentEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TFeedCommentEntity> likeSelect(TFeedCommentEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TFeedCommentEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "评论id", "类型，0评论1回复", "动态id", "被评论id", "评论者id", "被评论者id", "评论详情", "是否已经查看，0未查看1已查看", "数据状态1可用0不可用-1用户删除", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "type", "feedId", "commentId", "userId", "toUserId", "commentInfo", "isLook", "state", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
