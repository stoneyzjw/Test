/*
 * Copyright 2005 - 2009 Terracotta, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at 
 */
package lygs.quartz.sample11;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SampleJob implements Job
{
	
	private static final Logger logger = LoggerFactory.getLogger(SampleJob.class);
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException
	{
		// TODO Auto-generated method stub
		System.out.println("≤‚ ‘£°");

	}

}
