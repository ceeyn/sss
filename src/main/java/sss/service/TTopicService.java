package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TTopicEntity;
import sss.entity.PageData;
import java.util.List;

public interface TTopicService {

	void add(TTopicEntity entity);

	void delete(TTopicEntity entity);

	void update(TTopicEntity entity);

	List<TTopicEntity> select(TTopicEntity entity);

	PageData<TTopicEntity> likeSelect(TTopicEntity entity);

    void exportExcel(TTopicEntity entity, HttpServletResponse response);

}
