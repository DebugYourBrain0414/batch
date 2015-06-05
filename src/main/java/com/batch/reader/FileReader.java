package com.batch.reader;

import java.io.File;
import java.nio.file.NoSuchFileException;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.util.ResourceUtils;

public class FileReader<T> implements ItemReader<File> {
  String resource;

  public void setResource(String resource) {
    this.resource = resource;
  }

  public File read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
  	File file = ResourceUtils.getFile(resource);
    System.out.println("Input File: "+file.getAbsolutePath());
    
    if (!file.exists()) throw new NoSuchFileException(resource);
  	return file;
  }
}
