package com.batch.reader.d2f.dto;

public class ComParameter {
	private String keyValue;
	private String valValue;
	private Character useYn;
	
	public String getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	public String getValValue() {
		return valValue;
	}
	public void setValValue(String valValue) {
		this.valValue = valValue;
	}
	public Character getUseYn() {
		return useYn;
	}
	public void setUseYn(Character useYn) {
		this.useYn = useYn;
	}
	@Override
	public String toString() {
		return "ComParameter [keyValue=" + keyValue + ", valValue=" + valValue
				+ ", useYn=" + useYn + "]";
	}
}
