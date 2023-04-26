package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TTopicEntity;



@Mapper
@Repository
public interface TTopicDao extends BaseDao<TTopicEntity> {

}
