package com.ismail.hutbro.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE")
public class Image implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IMG_ID")
	private Long imageId;
	@Column(name="IMG_TITLE")
	private String imageTitle;
	
	
	@Column(name="IMG_LOCATION_URL")
	private String imgLocationUrl;
	
	@ManyToOne
	@JoinColumn(name="PROD_ID")
	private Product product;

	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imageTitle == null) ? 0 : imageTitle.hashCode());
		result = prime * result + ((imgLocationUrl == null) ? 0 : imgLocationUrl.hashCode());
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
		Image other = (Image) obj;
		if (imageTitle == null) {
			if (other.imageTitle != null)
				return false;
		} else if (!imageTitle.equals(other.imageTitle))
			return false;
		if (imgLocationUrl == null) {
			if (other.imgLocationUrl != null)
				return false;
		} else if (!imgLocationUrl.equals(other.imgLocationUrl))
			return false;
		return true;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getImageTitle() {
		return imageTitle;
	}

	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}

	public String getImgLocationUrl() {
		return imgLocationUrl;
	}

	public void setImgLocationUrl(String imgLocationUrl) {
		this.imgLocationUrl = imgLocationUrl;
	}
	
}
