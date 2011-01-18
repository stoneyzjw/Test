package lygs.quartz.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SchedulerMetaData;
import org.quartz.impl.StdSchedulerFactory;

public class PlugInExample
{
	
	private static final Logger logger = LoggerFactory.getLogger(PlugInExample.class);
	
	public void run() throws Exception 
	{
//		SchedulerFactory sf = new StdSchedulerFactory();
//		Scheduler sched = sf.getScheduler();
		Scheduler sched = StdSchedulerFactory.getDefaultScheduler();
		logger.info("------- 定时器初始化完成 --------");
		logger.info("------- （没有安排任何的JOB 由XML文件定义 ------");
		logger.info("------- 开始调度 --------");
		sched.start();
		logger.info("------ 调度程序开始了 -------");
		logger.info("------ 等待5分钟 ------");
		try
		{
			Thread.sleep(300L * 1000L);
		}
		catch (Exception e)
		{}
		logger.info("------ 关闭调度器 ------");
		sched.shutdown();
		SchedulerMetaData metaData = sched.getMetaData();
		logger.info("调度了：" + metaData.getNumberOfJobsExecuted() + " 作业。");
	}
	
	public static void main(String[] args) throws Exception
	{
		
		PlugInExample example = new PlugInExample();
		example.run();
	}

}
