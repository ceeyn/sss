package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFeedPhotoEntity;



@Mapper
@Repository
public interface TFeedPhotoDao extends BaseDao<TFeedPhotoEntity> {

}
