package com.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class FileWriter implements ItemWriter<String> {
  private String resource;
  
  public void setResource(String resource) {
    this.resource = resource;
  }

  public void write(List<? extends String> items) throws Exception {
  	System.out.println("WRITER: "+resource);
  }
}
