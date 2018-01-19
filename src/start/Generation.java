package start;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generation {

	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

		System.out.println("代码开始生成");
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;

//		File configFile = new File("src/generatorConfig_media_service.xml");
//		File configFile = new File("src/generatorConfig_report_injecting.xml");
		File configFile = new File("src/generatorConfig_report_portrait.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

		System.out.println("代码生成完毕");
	}
	@Test
	public void testA(){
		System.out.println(new Date(1514735999000L));
	}
}
