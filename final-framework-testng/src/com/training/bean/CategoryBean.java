package com.training.bean;

public class CategoryBean {
	private String CatgoryName;
	private String Metatag;

	public CategoryBean() {
	}

	public CategoryBean(String CatgoryName, String Metatag) {
		super();
		this.CatgoryName = CatgoryName;
		this.Metatag = Metatag;
	}

	public String getCatgoryName() {
		return CatgoryName;
	}

	public void setCatgoryName(String CatgoryName) {
		this.CatgoryName = CatgoryName;
	}

	public String getMetatag() {
		return Metatag;
	}

	public void setMetatag(String Metatag) {
		this.Metatag = Metatag;
	}

	@Override
	public String toString() {
		return "CategoryBean [CatgoryName =" + CatgoryName + ", Metatag=" + Metatag + "]";
	}

}
