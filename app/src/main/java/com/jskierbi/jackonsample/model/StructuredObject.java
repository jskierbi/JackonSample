package com.jskierbi.jackonsample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jakub on 15/05/15.
 */
public class StructuredObject {

	String name;
	String age;

	public String getName() {

		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public String getAge() {

		return age;
	}
	public void setAge(String age) {

		this.age = age;
	}

	@Override public String toString() {

		return "StructuredObject{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
