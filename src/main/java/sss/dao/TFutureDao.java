package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TFutureEntity;



@Mapper
@Repository
public interface TFutureDao extends BaseDao<TFutureEntity> {

}
