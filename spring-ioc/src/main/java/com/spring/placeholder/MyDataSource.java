package com.spring.placeholder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 */
@Component
public class MyDataSource {
    @Value("${driverClassName}")
    private String driverClassName;

    @Value("${url}")
    private String url;

    @Value("${userName}")
    private String userName;

    @Value("${password}")
    private String password;

	@Override
	public String toString() {
		return "MyDataSource [driverClassName=" + driverClassName + ", url="
				+ url + ", userName=" + userName + ", password=" + password
				+ "]";
	}


}
