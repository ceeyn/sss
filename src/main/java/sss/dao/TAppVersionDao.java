package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TAppVersionEntity;



@Mapper
@Repository
public interface TAppVersionDao extends BaseDao<TAppVersionEntity> {

}
