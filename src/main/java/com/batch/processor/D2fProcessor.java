package com.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.batch.reader.d2f.dto.ComParameter;

public class D2fProcessor implements ItemProcessor<ComParameter, ComParameter>{
	String parameter;
	
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public ComParameter process(ComParameter item) throws Exception {
		return attachParameter(item);
	}

	private ComParameter attachParameter(ComParameter item) {
		ComParameter comParameter = new ComParameter();
		comParameter.setKeyValue(item.getKeyValue().concat(parameter));
		comParameter.setValValue(item.getValValue().concat(parameter));
		return comParameter;
	}
}
