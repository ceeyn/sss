package sss.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sss.dao.TUserDao;
import sss.service.TUserService;
import sss.entity.PageData;
import sss.utils.ExcelUtil;
import sss.utils.PageUtil;
import java.util.LinkedHashMap;
import sss.entity.TUserEntity;
import java.util.List;
import java.util.Map;

@Service
public class TUserServiceImpl implements TUserService {


	private final TUserDao dao;

	@Autowired
	public TUserServiceImpl(TUserDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(TUserEntity entity) {
		dao.add(entity);
	}

	@Override
	public void delete(TUserEntity entity) {
		dao.delete(entity);
	}

	@Override
	public void update(TUserEntity entity) {
		dao.update(entity);
	}

	@Override
	public List<TUserEntity> select(TUserEntity entity) {
		return dao.select(entity);
	}

	@Override
	public PageData<TUserEntity> likeSelect(TUserEntity entity) {
		return PageUtil.getPageData(entity, dao);
	}

	@Override
	public void exportExcel(TUserEntity entity, HttpServletResponse response) {

		// 获取头部信息（可以设置为动态）
		String[] headList = new String[] { "用户id", "用户编号", "用户名", "密码", "手机号", "性别，-1未知，0女1男", "QQ号", "头像路径", "个性签名", "融云token", "数据状态1可用0不可用", "登录时间", "创建时间", "更新时间"};

		String[] headEngList = new String[]{ "id", "uid", "username", "password", "phone", "sex", "qq", "avatar", "signature", "imToken", "state", "loginTime", "createTime", "updateTime"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

		//设置头部以及描述信息
        Map<String, String> headAndDescribeMap = new LinkedHashMap<>();
        for (int i = 0; i < headEngList.length; i++) {
            headAndDescribeMap.put(headEngList[i], describeList[i]);
        }

		ExcelUtil.exportExcel(entity, response, dao, headList, headAndDescribeMap);
	}
}
