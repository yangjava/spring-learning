package com.spring.spring3annotation;

// 商品
public class Product {
	private String pname;
	private int pnum;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pnum=" + pnum + "]";
	}

}
