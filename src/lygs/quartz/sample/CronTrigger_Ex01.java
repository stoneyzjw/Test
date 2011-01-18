package lygs.quartz.sample;
import java.text.ParseException;
import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class CronTrigger_Ex01
{
	static final Logger logger = LoggerFactory.getLogger(CronTrigger_Ex01.class);
	
	public static void main(String[] args)
	{
		CronTrigger_Ex01 sample = new CronTrigger_Ex01();
		sample.runScheduler();
	}
	
	public void runScheduler()
	{
		Scheduler scheduler = null;
		try
		{
			// Create a default instance of the Scheduler
			scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			logger.info("Scheduler was started at " + new Date());
			
			// Create the JobDetail
			JobDetail jobDetail = new JobDetail("PrintInfoJob", Scheduler.DEFAULT_GROUP, PrintInfoJob.class);
			// Create a CronTrigger
			try
			{
				CronTrigger trigger = new CronTrigger("CronTrigger", null, "*/5 * * * * ?");
				scheduler.scheduleJob(jobDetail, trigger);
			}
			catch (ParseException ex)
			{
				logger.error("Error parse cron expr", ex);
			}
		}
		catch (SchedulerException ex)
		{
			logger.error(ex.toString());
		}
	}

}
