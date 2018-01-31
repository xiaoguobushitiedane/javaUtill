package com.utill.xml;

public class Column {

	private String ColName;
	private String ColType;
	
	public Column(String colName, String colType) {
		super();
		ColName = colName;
		ColType = colType;
	}

	public String getColName() {
		return ColName;
	}

	public void setColName(String colName) {
		ColName = colName;
	}

	public String getColType() {
		return ColType;
	}

	public void setColType(String colType) {
		ColType = colType;
	}
	
	
	
	
	
}
