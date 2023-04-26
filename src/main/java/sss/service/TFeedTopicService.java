package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFeedTopicEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFeedTopicService {

	void add(TFeedTopicEntity entity);

	void delete(TFeedTopicEntity entity);

	void update(TFeedTopicEntity entity);

	List<TFeedTopicEntity> select(TFeedTopicEntity entity);

	PageData<TFeedTopicEntity> likeSelect(TFeedTopicEntity entity);

    void exportExcel(TFeedTopicEntity entity, HttpServletResponse response);

}
