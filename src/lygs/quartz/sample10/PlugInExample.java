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
		logger.info("------- ��ʱ����ʼ����� --------");
		logger.info("------- ��û�а����κε�JOB ��XML�ļ����� ------");
		logger.info("------- ��ʼ���� --------");
		sched.start();
		logger.info("------ ���ȳ���ʼ�� -------");
		logger.info("------ �ȴ�5���� ------");
		try
		{
			Thread.sleep(300L * 1000L);
		}
		catch (Exception e)
		{}
		logger.info("------ �رյ����� ------");
		sched.shutdown();
		SchedulerMetaData metaData = sched.getMetaData();
		logger.info("�����ˣ�" + metaData.getNumberOfJobsExecuted() + " ��ҵ��");
	}
	
	public static void main(String[] args) throws Exception
	{
		
		PlugInExample example = new PlugInExample();
		example.run();
	}

}
