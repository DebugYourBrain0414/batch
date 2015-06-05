package com.batch.processor;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.batch.item.ItemProcessor;

public class MyProcessor implements ItemProcessor<File, String>{
	String parameter;
	
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String process(File item) throws Exception {
    int bufferSize = Long.valueOf(item.length()).intValue();
    InputStream inputStream = new FileInputStream(item);
   
    byte[] buffer = new byte[bufferSize];
   
    IOUtils.readFully(inputStream, buffer);
    IOUtils.closeQuietly(inputStream);
   
    System.out.println(buffer);
    System.out.println("++++++++++"+parameter);
    
		return null;
	}
}
