package com.ismail.hutbro.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{
	
	/* `PROD_ID` INT NOT NULL,
	  `PROD_NAME` VARCHAR(45) NULL,
	  `PROD_DESC` VARCHAR(45) NULL,
	  `PROD_INSERT_DATE` DATETIME NULL,
	  `PROD_MODIFIED_DATE` DATETIME NULL,
	  `PROD_IMG_ID` INT NULL,*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROD_ID")
	private Long productId;
	
	@Column(name="PROD_NAME")
	private String porductName;
	
	@Column(name="PROD_DESC")
	private String productDescription;
	
	@Column(name="PROD_INSERT_DATE")
	private Date insertedDate;
	
	@Column(name="PROD_MODIFIED_DATE")
	private Date modifieddate;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="product",cascade = CascadeType.ALL)
	private List<Image> images;
	
	
	@ManyToOne
	@JoinColumn(name="CATG_ID")
	private Category category;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((porductName == null) ? 0 : porductName.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
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
		Product other = (Product) obj;
		if (porductName == null) {
			if (other.porductName != null)
				return false;
		} else if (!porductName.equals(other.porductName))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getPorductName() {
		return porductName;
	}
	public void setPorductName(String porductName) {
		this.porductName = porductName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Date getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	

}
