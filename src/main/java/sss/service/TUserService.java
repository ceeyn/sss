package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TUserEntity;
import sss.entity.PageData;
import java.util.List;

public interface TUserService {

	void add(TUserEntity entity);

	void delete(TUserEntity entity);

	void update(TUserEntity entity);

	List<TUserEntity> select(TUserEntity entity);

	PageData<TUserEntity> likeSelect(TUserEntity entity);

    void exportExcel(TUserEntity entity, HttpServletResponse response);

}
