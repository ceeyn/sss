package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFeedEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFeedService {

	void add(TFeedEntity entity);

	void delete(TFeedEntity entity);

	void update(TFeedEntity entity);

	List<TFeedEntity> select(TFeedEntity entity);

	PageData<TFeedEntity> likeSelect(TFeedEntity entity);

    void exportExcel(TFeedEntity entity, HttpServletResponse response);

}
