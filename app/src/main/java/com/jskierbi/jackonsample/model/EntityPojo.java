package com.jskierbi.jackonsample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by jakub on 15/05/15.
 */
public class EntityPojo {

	@JsonProperty("string_value") String mStringValue;
	@JsonProperty("structured_object") StructuredObject mStructuredObject;
	@JsonProperty("list_of_objects") List<StructuredObject> mList;

	public String getmStringValue() {

		return mStringValue;
	}
	public void setmStringValue(String mStringValue) {

		this.mStringValue = mStringValue;
	}
	public StructuredObject getmStructuredObject() {

		return mStructuredObject;
	}
	public void setmStructuredObject(StructuredObject mStructuredObject) {

		this.mStructuredObject = mStructuredObject;
	}
	public List<StructuredObject> getmList() {

		return mList;
	}
	public void setmList(List<StructuredObject> mList) {

		this.mList = mList;
	}


}
