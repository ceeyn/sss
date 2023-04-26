package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFeedTopicEntity;



@Mapper
@Repository
public interface TFeedTopicDao extends BaseDao<TFeedTopicEntity> {

}
