package org.cloudstar.productapi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="XXIBM_PRODUCT_SKU")
public class Product {

	@Column(name="ITEM_NUMBER")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemId;
	
	@Column(name="DESCRIPTION")
	private String itemName;
	
	@Column(name="LONG_DESCRIPTION")
	private String description;
	
	@Column(name="CATALOGUE_CATEGORY")
	private Integer productCatalogId;
	
	@Column(name="SKU_UNIT_OF_MEASURE")
	private String skuUnitOfMeasure;
	
	@ManyToOne //(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="STYLE_ITEM", referencedColumnName="ITEM_NUMBER")
	private ProductStyle productStyle;
	
	@OneToOne (/*fetch=FetchType.LAZY,*/cascade=CascadeType.ALL/*, mappedBy="product"*/)
	@JoinColumn(name="ITEM_NUMBER")
	private ProductPricing productPricing;
	
	@Column(name="SKU_ATTRIBUTE1")
	private String skuAttribute1;
	
	@Column(name="SKU_ATTRIBUTE2")
	private String skuAttribute2;
	
	@Column(name="SKU_ATTRIBUTE3")
	private String skuAttribute3;
	
	@Column(name="SKU_ATTRIBUTE4")
	private String skuAttribute4;
	
	@Column(name="SKU_ATTRIBUTE5")
	private String skuAttribute5;

	@Column(name="SKU_ATTRIBUTE6")
	private String skuAttribute6;
	
	@Column(name="SKU_ATTRIBUTE_VALUE1")
	private String skuAttributeValue1;
	
	@Column(name="SKU_ATTRIBUTE_VALUE2")
	private String skuAttributeValue2;
	
	@Column(name="SKU_ATTRIBUTE_VALUE3")
	private String skuAttributeValue3;
	
	@Column(name="SKU_ATTRIBUTE_VALUE4")
	private String skuAttributeValue4;
	
	@Column(name="SKU_ATTRIBUTE_VALUE5")
	private String skuAttributeValue5;
	
	@Column(name="SKU_ATTRIBUTE_VALUE6")
	private String skuAttributeValue6;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getSkuUnitOfMeasure() {
		return skuUnitOfMeasure;
	}

	public void setSkuUnitOfMeasure(String skuUnitOfMeasure) {
		this.skuUnitOfMeasure = skuUnitOfMeasure;
	}

	public ProductStyle getProductStyle() {
		return productStyle;
	}

	public void setProductStyle(ProductStyle productStyle) {
		this.productStyle = productStyle;
	}

	public ProductPricing getProductPricing() {
		return productPricing;
	}

	public void setProductPricing(ProductPricing productPricing) {
		this.productPricing = productPricing;
	}

	public String getSkuAttribute1() {
		return skuAttribute1;
	}

	public void setSkuAttribute1(String skuAttribute1) {
		this.skuAttribute1 = skuAttribute1;
	}

	public String getSkuAttribute2() {
		return skuAttribute2;
	}

	public void setSkuAttribute2(String skuAttribute2) {
		this.skuAttribute2 = skuAttribute2;
	}

	public String getSkuAttribute3() {
		return skuAttribute3;
	}

	public void setSkuAttribute3(String skuAttribute3) {
		this.skuAttribute3 = skuAttribute3;
	}

	public String getSkuAttribute4() {
		return skuAttribute4;
	}

	public void setSkuAttribute4(String skuAttribute4) {
		this.skuAttribute4 = skuAttribute4;
	}

	public String getSkuAttribute5() {
		return skuAttribute5;
	}

	public void setSkuAttribute5(String skuAttribute5) {
		this.skuAttribute5 = skuAttribute5;
	}

	public String getSkuAttribute6() {
		return skuAttribute6;
	}

	public void setSkuAttribute6(String skuAttribute6) {
		this.skuAttribute6 = skuAttribute6;
	}

	public String getSkuAttributeValue1() {
		return skuAttributeValue1;
	}

	public void setSkuAttributeValue1(String skuAttributeValue1) {
		this.skuAttributeValue1 = skuAttributeValue1;
	}

	public String getSkuAttributeValue2() {
		return skuAttributeValue2;
	}

	public void setSkuAttributeValue2(String skuAttributeValue2) {
		this.skuAttributeValue2 = skuAttributeValue2;
	}

	public String getSkuAttributeValue3() {
		return skuAttributeValue3;
	}

	public void setSkuAttributeValue3(String skuAttributeValue3) {
		this.skuAttributeValue3 = skuAttributeValue3;
	}

	public String getSkuAttributeValue4() {
		return skuAttributeValue4;
	}

	public void setSkuAttributeValue4(String skuAttributeValue4) {
		this.skuAttributeValue4 = skuAttributeValue4;
	}

	public String getSkuAttributeValue5() {
		return skuAttributeValue5;
	}

	public void setSkuAttributeValue5(String skuAttributeValue5) {
		this.skuAttributeValue5 = skuAttributeValue5;
	}

	public String getSkuAttributeValue6() {
		return skuAttributeValue6;
	}

	public void setSkuAttributeValue6(String skuAttributeValue6) {
		this.skuAttributeValue6 = skuAttributeValue6;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((productCatalogId == null) ? 0 : productCatalogId.hashCode());
		result = prime * result + ((productPricing == null) ? 0 : productPricing.hashCode());
		result = prime * result + ((productStyle == null) ? 0 : productStyle.hashCode());
		result = prime * result + ((skuAttribute1 == null) ? 0 : skuAttribute1.hashCode());
		result = prime * result + ((skuAttribute2 == null) ? 0 : skuAttribute2.hashCode());
		result = prime * result + ((skuAttribute3 == null) ? 0 : skuAttribute3.hashCode());
		result = prime * result + ((skuAttribute4 == null) ? 0 : skuAttribute4.hashCode());
		result = prime * result + ((skuAttribute5 == null) ? 0 : skuAttribute5.hashCode());
		result = prime * result + ((skuAttribute6 == null) ? 0 : skuAttribute6.hashCode());
		result = prime * result + ((skuAttributeValue1 == null) ? 0 : skuAttributeValue1.hashCode());
		result = prime * result + ((skuAttributeValue2 == null) ? 0 : skuAttributeValue2.hashCode());
		result = prime * result + ((skuAttributeValue3 == null) ? 0 : skuAttributeValue3.hashCode());
		result = prime * result + ((skuAttributeValue4 == null) ? 0 : skuAttributeValue4.hashCode());
		result = prime * result + ((skuAttributeValue5 == null) ? 0 : skuAttributeValue5.hashCode());
		result = prime * result + ((skuAttributeValue6 == null) ? 0 : skuAttributeValue6.hashCode());
		result = prime * result + ((skuUnitOfMeasure == null) ? 0 : skuUnitOfMeasure.hashCode());
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
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (productCatalogId == null) {
			if (other.productCatalogId != null)
				return false;
		} else if (!productCatalogId.equals(other.productCatalogId))
			return false;
		if (productPricing == null) {
			if (other.productPricing != null)
				return false;
		} else if (!productPricing.equals(other.productPricing))
			return false;
		if (productStyle == null) {
			if (other.productStyle != null)
				return false;
		} else if (!productStyle.equals(other.productStyle))
			return false;
		if (skuAttribute1 == null) {
			if (other.skuAttribute1 != null)
				return false;
		} else if (!skuAttribute1.equals(other.skuAttribute1))
			return false;
		if (skuAttribute2 == null) {
			if (other.skuAttribute2 != null)
				return false;
		} else if (!skuAttribute2.equals(other.skuAttribute2))
			return false;
		if (skuAttribute3 == null) {
			if (other.skuAttribute3 != null)
				return false;
		} else if (!skuAttribute3.equals(other.skuAttribute3))
			return false;
		if (skuAttribute4 == null) {
			if (other.skuAttribute4 != null)
				return false;
		} else if (!skuAttribute4.equals(other.skuAttribute4))
			return false;
		if (skuAttribute5 == null) {
			if (other.skuAttribute5 != null)
				return false;
		} else if (!skuAttribute5.equals(other.skuAttribute5))
			return false;
		if (skuAttribute6 == null) {
			if (other.skuAttribute6 != null)
				return false;
		} else if (!skuAttribute6.equals(other.skuAttribute6))
			return false;
		if (skuAttributeValue1 == null) {
			if (other.skuAttributeValue1 != null)
				return false;
		} else if (!skuAttributeValue1.equals(other.skuAttributeValue1))
			return false;
		if (skuAttributeValue2 == null) {
			if (other.skuAttributeValue2 != null)
				return false;
		} else if (!skuAttributeValue2.equals(other.skuAttributeValue2))
			return false;
		if (skuAttributeValue3 == null) {
			if (other.skuAttributeValue3 != null)
				return false;
		} else if (!skuAttributeValue3.equals(other.skuAttributeValue3))
			return false;
		if (skuAttributeValue4 == null) {
			if (other.skuAttributeValue4 != null)
				return false;
		} else if (!skuAttributeValue4.equals(other.skuAttributeValue4))
			return false;
		if (skuAttributeValue5 == null) {
			if (other.skuAttributeValue5 != null)
				return false;
		} else if (!skuAttributeValue5.equals(other.skuAttributeValue5))
			return false;
		if (skuAttributeValue6 == null) {
			if (other.skuAttributeValue6 != null)
				return false;
		} else if (!skuAttributeValue6.equals(other.skuAttributeValue6))
			return false;
		if (skuUnitOfMeasure == null) {
			if (other.skuUnitOfMeasure != null)
				return false;
		} else if (!skuUnitOfMeasure.equals(other.skuUnitOfMeasure))
			return false;
		return true;
	}
	
	
}
