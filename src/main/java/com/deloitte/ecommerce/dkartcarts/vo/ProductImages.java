package com.deloitte.ecommerce.dkartcarts.vo;

// Generated Nov 12, 2017 11:53:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProductImages generated by hbm2java
 */
@Entity
@Table(name = "product_images")
public class ProductImages implements java.io.Serializable {

	private Integer imageid;
	private String imagename;
	private Set<Product> products = new HashSet<Product>(0);

	public ProductImages() {
	}

	public ProductImages(String imagename, Set<Product> products) {
		this.imagename = imagename;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "imageid", unique = true, nullable = false)
	public Integer getImageid() {
		return this.imageid;
	}

	public void setImageid(Integer imageid) {
		this.imageid = imageid;
	}

	@Column(name = "imagename", length = 100)
	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productImages")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
