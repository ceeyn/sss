package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TAppVersionEntity;
import sss.entity.PageData;
import java.util.List;

public interface TAppVersionService {

	void add(TAppVersionEntity entity);

	void delete(TAppVersionEntity entity);

	void update(TAppVersionEntity entity);

	List<TAppVersionEntity> select(TAppVersionEntity entity);

	PageData<TAppVersionEntity> likeSelect(TAppVersionEntity entity);

    void exportExcel(TAppVersionEntity entity, HttpServletResponse response);

}
