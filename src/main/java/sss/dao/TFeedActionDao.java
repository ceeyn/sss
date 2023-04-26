package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFeedActionEntity;



@Mapper
@Repository
public interface TFeedActionDao extends BaseDao<TFeedActionEntity> {

}
