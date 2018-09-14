package top.inick.start;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MysqlGenerator {

	private static final String PACKAGE_NAME = "top.inick.start";
	private static final String MODULE_NAME = "user";
	private static final String OUT_PATH = "E:/STSSpace/start";
	private static final String AUTHOR = "iNick";

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/start_database?useUnicode=true&characterEncoding=utf8&useSSL=false";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";
	
	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();
		
		//全局配置
		GlobalConfig gc = new GlobalConfig();
		
		gc.setOutputDir(OUT_PATH + "/src/main/java");
		gc.setFileOverride(true);
		gc.setActiveRecord(true);
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(false);// XML columList
		gc.setAuthor(AUTHOR);

		 // 自定义文件命名，注意 %s 会自动填充表实体属性！
//		gc.setMapperName("%sDao");
//		gc.setXmlName("%sDao");
//		gc.setServiceName("MP%sService");
//		gc.setServiceImplName("%sServiceDiy");
//		gc.setControllerName("%sController");
		mpg.setGlobalConfig(gc);
        
		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		//dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName(DRIVER);
		dsc.setUsername(USER_NAME);
		dsc.setPassword(PASSWORD);
		dsc.setUrl(URL);
		mpg.setDataSource(dsc);
	
		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		//strategy.setTablePrefix("bmd_");// 此处可以修改为您的表前缀
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		// strategy.setInclude(new String[] { "user" }); // 需要生成的表
		// strategy.setExclude(new String[]{"test"}); // 排除生成的表
		// 字段名生成策略
		//strategy.setFieldNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);

		// 自定义实体父类
		// strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
		// 自定义实体，公共字段
		// strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
		// 自定义 mapper 父类
		// strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
		// 自定义 service 父类
		// strategy.setSuperServiceClass("com.baomidou.demo.TestService");
		// 自定义 service 实现类父类
		// strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
		// 自定义 controller 父类
		// strategy.setSuperControllerClass("com.baomidou.demo.TestController");
		// 【实体】是否生成字段常量（默认 false）
		// public static final String ID = "test_id";
		// strategy.setEntityColumnConstant(true);
		// 【实体】是否为构建者模型（默认 false）
		// public User setName(String name) {this.name = name; return this;}
		// strategy.setEntityBuliderModel(true);
		// 【实体】是否生成字段常量（默认 false）
		// public static final String ID = "test_id";
		strategy.setEntityColumnConstant(true);
		// 【实体】是否为构建者模型（默认 false）
		// public User setName(String name) {this.name = name; return this;}
		strategy.setEntityBuilderModel(true);
		// 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
		strategy.setEntityLombokModel(true);
		
		mpg.setStrategy(strategy);
	
		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setModuleName(MODULE_NAME);
		pc.setParent(PACKAGE_NAME);
		mpg.setPackageInfo(pc);
	 
		// 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
		InjectionConfig cfg = new InjectionConfig() {
	    @Override
	    public void initMap() {
	        Map<String, Object> map = new HashMap<String, Object>();
	        map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
	                this.setMap(map);
	            }
		};
		List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
            	String resultS = OUT_PATH + "/src/main/resources/mapper/" + pc.getModuleName()
                + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                return resultS;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));
 
        // 自定义模板配置
		// TemplateConfig tc = new TemplateConfig();
		// tc.setController("...");
		// tc.setEntity("...");
		// tc.setMapper("...");
		// tc.setXml("...");
		// tc.setService("...");
		// tc.setServiceImpl("...");
		// mpg.setTemplate(tc);
 
        // 执行生成
        mpg.execute();
 
        // 打印注入设置
        System.err.println(mpg.getCfg().getMap().get("abc"));
	}
	


}
