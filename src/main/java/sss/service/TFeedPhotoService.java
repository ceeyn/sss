package sss.service;

import javax.servlet.http.HttpServletResponse;

import sss.entity.TFeedPhotoEntity;
import sss.entity.PageData;
import java.util.List;

public interface TFeedPhotoService {

	void add(TFeedPhotoEntity entity);

	void delete(TFeedPhotoEntity entity);

	void update(TFeedPhotoEntity entity);

	List<TFeedPhotoEntity> select(TFeedPhotoEntity entity);

	PageData<TFeedPhotoEntity> likeSelect(TFeedPhotoEntity entity);

    void exportExcel(TFeedPhotoEntity entity, HttpServletResponse response);

}
