package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFeedEntity;



@Mapper
@Repository
public interface TFeedDao extends BaseDao<TFeedEntity> {

}
