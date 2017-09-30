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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="CATEGORY")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="CATG_ID")
		private Long categoryId;
		
		@Column(name="CATG_NAME")
		private String categoryName;
		
		@Column(name="CATG_DESC")
		private String categoryDescription;
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="CATG_INSERTED_DATE")
		private Date insertedDate;
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="CATG_MODIFIED_DATE")
		private Date modifiedDate;
		
		@OneToMany(fetch = FetchType.EAGER,mappedBy="category",cascade = CascadeType.ALL)
		private List<Product> products;
		
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> product) {
			this.products = product;
		}
		public Long getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getCategoryDescription() {
			return categoryDescription;
		}
		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}
		public Date getInsertedDate() {
			return insertedDate;
		}
		public void setInsertedDate(Date insertedDate) {
			this.insertedDate = insertedDate;
		}
		public Date getModifiedDate() {
			return modifiedDate;
		}
		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}

}
