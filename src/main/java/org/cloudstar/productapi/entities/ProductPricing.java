package org.cloudstar.productapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXIBM_PRODUCT_PRICING")
public class ProductPricing {
	
	@Column(name="PRICE_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer priceId;
	
	@Column(name="ITEM_NUMBER")
	private Integer productId;
	
	@Column(name="LIST_PRICE")
	private String listPrice;
	
	@Column(name="DISCOUNT")
	private String discount;
	
	@Column(name="IN_STOCK")
	private String inStock;
	
	@Column(name="PRICE_EFFECTIVE_DATE")
	private String priceEffectiveDate;

	public Integer getPriceId() {
		return priceId;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getListPrice() {
		return listPrice;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getInStock() {
		return inStock;
	}

	public void setInStock(String inStock) {
		this.inStock = inStock;
	}

	public String getPriceEffectiveDate() {
		return priceEffectiveDate;
	}

	public void setPriceEffectiveDate(String priceEffectiveDate) {
		this.priceEffectiveDate = priceEffectiveDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((inStock == null) ? 0 : inStock.hashCode());
		result = prime * result + ((listPrice == null) ? 0 : listPrice.hashCode());
		result = prime * result + ((priceEffectiveDate == null) ? 0 : priceEffectiveDate.hashCode());
		result = prime * result + ((priceId == null) ? 0 : priceId.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
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
		ProductPricing other = (ProductPricing) obj;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (inStock == null) {
			if (other.inStock != null)
				return false;
		} else if (!inStock.equals(other.inStock))
			return false;
		if (listPrice == null) {
			if (other.listPrice != null)
				return false;
		} else if (!listPrice.equals(other.listPrice))
			return false;
		if (priceEffectiveDate == null) {
			if (other.priceEffectiveDate != null)
				return false;
		} else if (!priceEffectiveDate.equals(other.priceEffectiveDate))
			return false;
		if (priceId == null) {
			if (other.priceId != null)
				return false;
		} else if (!priceId.equals(other.priceId))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	
	
}
