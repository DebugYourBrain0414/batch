package com.batch;

import java.util.HashMap;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/*.xml", "classpath:META-INF/batch-job/*.xml"})
public class BatchJobTest extends TestCase {
  @Autowired
  protected ApplicationContext applicationContext = null;

  @Test
  public void testApp() {
  	JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
  	Job job = (Job) applicationContext.getBean("fileToFileJob");
  	HashMap<String, JobParameter> jobParameters = generateJobParameters();
  	
  	try {
			JobExecution jobExecution = jobLauncher.run(job, new JobParameters(jobParameters));
			System.out.println("Batch status: "+jobExecution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
  }

	private HashMap<String, JobParameter> generateJobParameters() {
		HashMap<String, JobParameter> jobParameters = new HashMap<String, JobParameter>();
  	JobParameter jobParameter = new JobParameter("*", true);
  	jobParameters.put("swtichValue", jobParameter);
		return jobParameters;
	}
}