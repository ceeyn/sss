package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFeedActionEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFeedActionService {

	void add(TFeedActionEntity entity);

	void delete(TFeedActionEntity entity);

	void update(TFeedActionEntity entity);

	List<TFeedActionEntity> select(TFeedActionEntity entity);

	PageData<TFeedActionEntity> likeSelect(TFeedActionEntity entity);

    void exportExcel(TFeedActionEntity entity, HttpServletResponse response);

}
