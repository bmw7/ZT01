package com.mavict.base;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.solr.client.solrj.beans.Field;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date   2015年6月3日 下午7:33:02
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 5220285063411628324L;
	@Field
	public Long id;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
