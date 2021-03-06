package com.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.batch.reader.f2f.dto.ItemObject;

public class F2fProcessor implements ItemProcessor<ItemObject, ItemObject>{
	String parameter;
	
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public ItemObject process(ItemObject item) throws Exception {
		return attachParameter(item);
	}

	private ItemObject attachParameter(ItemObject item) {
		ItemObject itemObject = new ItemObject();
		itemObject.setFirst(item.getFirst().concat(parameter));
		itemObject.setSecond(item.getSecond().concat(parameter));
		itemObject.setThird(item.getThird().concat(parameter));
		itemObject.setFourth(item.getFourth().concat(parameter));
		itemObject.setFifth(item.getFifth().concat(parameter));
		
		return itemObject;
	}
}
