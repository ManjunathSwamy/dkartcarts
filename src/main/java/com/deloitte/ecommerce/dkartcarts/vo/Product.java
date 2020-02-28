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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product")
public class Product implements java.io.Serializable {

	private Integer productid;
	private ProductImages productImages;
	private Categories categories;
	private String productname;
	private String productnameExtended;
	private String description;
	private String descriptionExtended;
	private Double unitprice;
	private String isDiscounted;
	private Double discountperc;
	private String sizeapplicable;
	private String keywords;
	private Set<Cartdetails> cartdetailses = new HashSet<Cartdetails>(0);

	public Product() {
	}

	public Product(ProductImages productImages, Categories categories,
			String productname, String productnameExtended, String description,
			String descriptionExtended, Double unitprice, String isDiscounted,
			Double discountperc, String sizeapplicable, String keywords,
			Set<Cartdetails> cartdetailses) {
		this.productImages = productImages;
		this.categories = categories;
		this.productname = productname;
		this.productnameExtended = productnameExtended;
		this.description = description;
		this.descriptionExtended = descriptionExtended;
		this.unitprice = unitprice;
		this.isDiscounted = isDiscounted;
		this.discountperc = discountperc;
		this.sizeapplicable = sizeapplicable;
		this.keywords = keywords;
		this.cartdetailses = cartdetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "productid", unique = true, nullable = false)
	public Integer getProductid() {
		return this.productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "imageid")
	public ProductImages getProductImages() {
		return this.productImages;
	}

	public void setProductImages(ProductImages productImages) {
		this.productImages = productImages;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoryid")
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Column(name = "productname", length = 200)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "productname_extended", length = 1000)
	public String getProductnameExtended() {
		return this.productnameExtended;
	}

	public void setProductnameExtended(String productnameExtended) {
		this.productnameExtended = productnameExtended;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "description_extended", length = 65535)
	public String getDescriptionExtended() {
		return this.descriptionExtended;
	}

	public void setDescriptionExtended(String descriptionExtended) {
		this.descriptionExtended = descriptionExtended;
	}

	@Column(name = "unitprice", precision = 22, scale = 0)
	public Double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}

	@Column(name = "is_discounted", length = 1)
	public String getIsDiscounted() {
		return this.isDiscounted;
	}

	public void setIsDiscounted(String isDiscounted) {
		this.isDiscounted = isDiscounted;
	}

	@Column(name = "discountperc", precision = 22, scale = 0)
	public Double getDiscountperc() {
		return this.discountperc;
	}

	public void setDiscountperc(Double discountperc) {
		this.discountperc = discountperc;
	}

	@Column(name = "sizeapplicable", length = 1)
	public String getSizeapplicable() {
		return this.sizeapplicable;
	}

	public void setSizeapplicable(String sizeapplicable) {
		this.sizeapplicable = sizeapplicable;
	}

	@Column(name = "keywords", length = 100)
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Cartdetails> getCartdetailses() {
		return this.cartdetailses;
	}

	public void setCartdetailses(Set<Cartdetails> cartdetailses) {
		this.cartdetailses = cartdetailses;
	}

}