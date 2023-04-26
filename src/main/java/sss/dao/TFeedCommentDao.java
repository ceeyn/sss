package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFeedCommentEntity;



@Mapper
@Repository
public interface TFeedCommentDao extends BaseDao<TFeedCommentEntity> {

}
