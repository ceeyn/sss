package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFeedCommentEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFeedCommentService {

	void add(TFeedCommentEntity entity);

	void delete(TFeedCommentEntity entity);

	void update(TFeedCommentEntity entity);

	List<TFeedCommentEntity> select(TFeedCommentEntity entity);

	PageData<TFeedCommentEntity> likeSelect(TFeedCommentEntity entity);

    void exportExcel(TFeedCommentEntity entity, HttpServletResponse response);

}
