package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFutureEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFutureService {

	void add(TFutureEntity entity);

	void delete(TFutureEntity entity);

	void update(TFutureEntity entity);

	List<TFutureEntity> select(TFutureEntity entity);

	PageData<TFutureEntity> likeSelect(TFutureEntity entity);

    void exportExcel(TFutureEntity entity, HttpServletResponse response);

}
