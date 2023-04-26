package sss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sss.entity.TUserEntity;



@Mapper
@Repository
public interface TUserDao extends BaseDao<TUserEntity> {

}
