package org.cloudstar.productapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXIBM_PRODUCT_CATALOG")
public class ProductCatalog {
	@Id
	@Column(name="COMMODITY")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commodity;
	
	@Column(name="COMMODITY_NAME")
	private String commodityName;

	public Integer getCommodity() {
		return commodity;
	}

	public void setCommodity(Integer commodity) {
		this.commodity = commodity;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setName(String commodityName) {
		this.commodityName = commodityName;
	}
	
	
}
