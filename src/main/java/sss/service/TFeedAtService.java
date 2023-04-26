package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFeedAtEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFeedAtService {

	void add(TFeedAtEntity entity);

	void delete(TFeedAtEntity entity);

	void update(TFeedAtEntity entity);

	List<TFeedAtEntity> select(TFeedAtEntity entity);

	PageData<TFeedAtEntity> likeSelect(TFeedAtEntity entity);

    void exportExcel(TFeedAtEntity entity, HttpServletResponse response);

}
