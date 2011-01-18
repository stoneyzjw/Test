package lygs.quartz.sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class HelloWorld
{
	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	
	public static void main(String[] args)
	{
		logger.info("test pull");
		logger.info("中文");
		logger.info("龙岩市国税局");
		logger.info("在freebsd环境中更改");
	}
	
}
