/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.onlineshopping.product.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ProductCategory service. Represents a row in the &quot;Product_ProductCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.onlineshopping.product.service.model.impl.ProductCategoryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.onlineshopping.product.service.model.impl.ProductCategoryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductCategory
 * @generated
 */
@ProviderType
public interface ProductCategoryModel extends BaseModel<ProductCategory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a product category model instance should use the {@link ProductCategory} interface instead.
	 */

	/**
	 * Returns the primary key of this product category.
	 *
	 * @return the primary key of this product category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this product category.
	 *
	 * @param primaryKey the primary key of this product category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this product category.
	 *
	 * @return the uuid of this product category
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this product category.
	 *
	 * @param uuid the uuid of this product category
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this product category.
	 *
	 * @return the ID of this product category
	 */
	public long getId();

	/**
	 * Sets the ID of this product category.
	 *
	 * @param id the ID of this product category
	 */
	public void setId(long id);

	/**
	 * Returns the category name of this product category.
	 *
	 * @return the category name of this product category
	 */
	@AutoEscape
	public String getCategoryName();

	/**
	 * Sets the category name of this product category.
	 *
	 * @param categoryName the category name of this product category
	 */
	public void setCategoryName(String categoryName);

	/**
	 * Returns the create date of this product category.
	 *
	 * @return the create date of this product category
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this product category.
	 *
	 * @param createDate the create date of this product category
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this product category.
	 *
	 * @return the modified date of this product category
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this product category.
	 *
	 * @param modifiedDate the modified date of this product category
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ProductCategory productCategory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ProductCategory> toCacheModel();

	@Override
	public ProductCategory toEscapedModel();

	@Override
	public ProductCategory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}