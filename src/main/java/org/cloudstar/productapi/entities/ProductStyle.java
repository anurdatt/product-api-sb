package org.cloudstar.productapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXIBM_PRODUCT_STYLE")
public class ProductStyle {

	@Column(name="ITEM_NUMBER")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer styleId;
	
	@Column(name="DESCRIPTION")
	private String styleName;
	
	@Column(name="LONG_DESCRIPTION")
	private String description;
	
	@Column(name="CATALOGUE_CATEGORY")
	private Integer productCatalogId;
	
	@Column(name="BRAND")
	private String brand;

	public Integer getStyleId() {
		return styleId;
	}

	public void setStyleId(Integer styleId) {
		this.styleId = styleId;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getProductCatalogId() {
		return productCatalogId;
	}

	public void setProductCatalogId(Integer productCatalogId) {
		this.productCatalogId = productCatalogId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((productCatalogId == null) ? 0 : productCatalogId.hashCode());
		result = prime * result + ((styleId == null) ? 0 : styleId.hashCode());
		result = prime * result + ((styleName == null) ? 0 : styleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductStyle other = (ProductStyle) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (productCatalogId == null) {
			if (other.productCatalogId != null)
				return false;
		} else if (!productCatalogId.equals(other.productCatalogId))
			return false;
		if (styleId == null) {
			if (other.styleId != null)
				return false;
		} else if (!styleId.equals(other.styleId))
			return false;
		if (styleName == null) {
			if (other.styleName != null)
				return false;
		} else if (!styleName.equals(other.styleName))
			return false;
		return true;
	}*/
	
	
}
