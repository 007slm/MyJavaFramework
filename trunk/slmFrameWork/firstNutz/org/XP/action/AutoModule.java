package org.XP.action;

import java.util.HashMap;
import java.util.Map;

import org.nutz.dao.Dao;
import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;

@InjectName
@IocBean
public class AutoModule {
	
	private static final Log LOG=Logs.get();
	
	@Inject
	private Dao dao;
	
	@At
	public Object test(){
		Map<String,String> map =new HashMap<String,String>();
		map.put("userName", "007slm");
		map.put("age", "25");
		
		LOG.infof("Dao is ready? %s", dao);
		
		return map;
	}
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
}
