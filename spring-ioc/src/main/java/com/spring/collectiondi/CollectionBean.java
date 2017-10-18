package com.spring.collectiondi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 向CollectionBean 注入集合属性
 * 
 * 
 */
public class CollectionBean {
	private List<String> hobbies;
	private Set<Integer> numbers;
	private Map<String, String> map;
	private Properties properties;

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public void setNumbers(Set<Integer> numbers) {
		this.numbers = numbers;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionBean [hobbies=" + hobbies + ", numbers=" + numbers
				+ ", map=" + map + ", properties=" + properties + "]";
	}

}
