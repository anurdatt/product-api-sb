package org.cloudstar.productapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXIBM_PRODUCT_CATALOGUE")
public class ProductCatalog {
	@Id
	@Column(name="COMMODITY")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commodityId;
	
	@Column(name="COMMODITY_NAME")
	private String commodityName;

	@Column(name="CLASS")
	private Integer classId;
	
	@Column(name="CLASS_NAME")
	private String className;
	
	@Column(name="FAMILY")
	private Integer familyId;
	
	@Column(name="FAMILY_NAME")
	private String familyName;
	
	@Column(name="SEGMENT")
	private Integer segmentId;
	
	@Column(name="SEGMENT_NAME")
	private String segmentName;
	
	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getFamilyId() {
		return familyId;
	}

	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Integer getSegmentId() {
		return segmentId;
	}

	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}

	public String getSegmentName() {
		return segmentName;
	}

	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}
	
	
}
