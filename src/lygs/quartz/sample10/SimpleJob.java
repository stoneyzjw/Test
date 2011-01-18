package lygs.quartz.sample10;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleJob implements Job
{

	private static final Logger logger = LoggerFactory.getLogger(SimpleJob.class);
	
	public SimpleJob()
	{
		
	}
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException
	{
		// TODO Auto-generated method stub

		String jobName = context.getJobDetail().getFullName();
		logger.info("正在运行的作业：" + jobName + " 开始运行时间：" + new Date() + ", 触发器名称：" + context.getTrigger().getName());
		if (context.getMergedJobDataMap().size() > 0)
		{
			Set keys = context.getMergedJobDataMap().keySet();
			Iterator itr = (Iterator) keys.iterator();
			while (itr.hasNext())
			{
				String key = (String) itr.next();
				String value = context.getMergedJobDataMap().getString(key);
				logger.info(" --- jobDataMap entry: " + key + " = " + value);
			}
		}
		context.setResult("hello");
	}

}
