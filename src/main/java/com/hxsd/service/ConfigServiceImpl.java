package com.hxsd.service;

import com.hxsd.dao.ConfigDao;
import com.hxsd.entity.Config;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("configService")
public class ConfigServiceImpl implements ConfigService {
	
	@Resource
	private ConfigDao configDao;
	
	@Override
	public Config findById(Integer id) {
		return configDao.findId(id);
	}

}
