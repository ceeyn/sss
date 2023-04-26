package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFeedAtEntity;



@Mapper
@Repository
public interface TFeedAtDao extends BaseDao<TFeedAtEntity> {

}
