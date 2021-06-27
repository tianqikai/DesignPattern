package com.tqk.prototype.deppclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	//
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	//无引用类型，使用浅拷贝
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
