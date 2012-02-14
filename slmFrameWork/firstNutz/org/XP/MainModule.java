package org.XP;
/**
 * 汇总为
 * 原来dao.js的路径是在和src统计的conf\ioc文件里面放的 
 */
import org.nutz.mvc.annotation.Fail;

import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

@Modules(scanPackage=true)
@Ok("json")
@Fail("json")
@IocBy(type=ComboIocProvider.class,
		args={"*org.nutz.ioc.loader.json.JsonLoader","ioc/",
			  "*org.nutz.ioc.loader.annotation.AnnotationIocLoader","org.XP"})
public class MainModule {

}
