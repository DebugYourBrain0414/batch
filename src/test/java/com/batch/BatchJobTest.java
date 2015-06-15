package com.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/*.xml", "classpath:META-INF/batch-job/*.xml"})
public class BatchJobTest extends TestCase {
  @Autowired
  protected ApplicationContext applicationContext = null;
  
  @Autowired
  private JobOperator jobOperator;
  
  @Value("${output.path}")
  private String outputPath;
  
  private final String FILETOFILE_JOBNAME = "fileToFileJob";
  private final String DBTOFILE_JOBNAME = "databaseToFileJob";

  @Test
  public void testApp() {
  	String jobName = FILETOFILE_JOBNAME;
  	
  	try {
  		String jobParameters = generateJobParameters(jobName);
  		Long jobExecutionId = jobOperator.start(jobName, jobParameters);
  		String jobSummary = jobOperator.getSummary(jobExecutionId);
  		
			System.out.println("Batch summary: "+jobSummary);
		} catch (Exception e) {
			e.printStackTrace();
		}
  }

	private String generateJobParameters(String jobName) {
		String fileNameTimestamp = new SimpleDateFormat("MMddYYYYHHmmSS").format(new Date());
		
		StringBuilder builder = new StringBuilder(100);
		builder.append("outputFile=").append(outputPath).append(jobName+"_"+fileNameTimestamp+"\n")
		.append("swtichValue=*");
		
		return builder.toString();
	}
}