package com.slee0414.practice.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class MyReader<T> implements ItemReader<T> {
  private String resource;

  public void setResource(String resource) {
    this.resource = resource;
  }

  public T read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
    return null;
  }
}
