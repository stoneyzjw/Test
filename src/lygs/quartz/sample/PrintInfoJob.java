package lygs.quartz.sample;

import java.util.Iterator;

import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Job;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PrintInfoJob implements Job
{
	static Logger logger = LoggerFactory.getLogger(PrintInfoJob.class);
	
	@Override 
	public void execute(JobExecutionContext context) throws JobExecutionException
	{
		/**
		// Every job has its own job detail
		JobDetail jobDetail = context.getJobDetail();
		// The name and group are defined in the job detail
		String jobName = jobDetail.getName();
		logger.info("Name: " + jobDetail.getFullName());
		
		// The name of this class configured for the job
		logger.info("Job Class: " + jobDetail.getJobClass());
		
		logger.info(jobName + " fired at" + context.getFireTime());
		logger.info("Next fire time " + context.getNextFireTime());
		*/
		logger.info("In PrintJobDataMapJob");
		// Every job has its own job detail
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		
		// Iterator through the key/value pairs
		Iterator iter = jobDataMap.keySet().iterator();
		
		while(iter.hasNext())
		{
			Object key = iter.next();
			Object value = jobDataMap.get(key);
			logger.info("Key: " + key + " - Value: " + value);
		}
	}

}
