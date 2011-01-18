package lygs.quartz.sample;
import java.math.BigDecimal;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Quartz_Ex01
{
	
	static Logger logger = LoggerFactory.getLogger(Quartz_Ex01.class); 
	
	public void runScheduler()
	{
		try
		{
			// Create a default instance of the Sheduler
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			logger.info("Scheduler starting up...");
			scheduler.start();
			
			// Create the JobDetail
			JobDetail jobDetail = new JobDetail("PrintInfoJob", Scheduler.DEFAULT_GROUP, PrintInfoJob.class);
			
			// Store some state for the Job
			jobDetail.getJobDataMap().put("name", "Ö£¾©Î°");
			jobDetail.getJobDataMap().put("age", 23);
			jobDetail.getJobDataMap().put("balance", new BigDecimal(1200.37));
			Trigger trigger = TriggerUtils.makeImmediateTrigger(SimpleTrigger.REPEAT_INDEFINITELY, 10000);
			trigger.setName("PrintInfoJobTrigger");
			// register with the Scheduler
			scheduler.scheduleJob(jobDetail, trigger);
		}
		catch (SchedulerException ex)
		{
			logger.error(ex.toString());
		}
	}

	public static void main(String[] args)
	{
		Quartz_Ex01 sample = new Quartz_Ex01();
		sample.runScheduler();
	}
}
