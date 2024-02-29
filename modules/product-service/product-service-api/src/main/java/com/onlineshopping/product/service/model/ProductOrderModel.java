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
 * The base model interface for the ProductOrder service. Represents a row in the &quot;Product_ProductOrder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.onlineshopping.product.service.model.impl.ProductOrderModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.onlineshopping.product.service.model.impl.ProductOrderImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductOrder
 * @generated
 */
@ProviderType
public interface ProductOrderModel extends BaseModel<ProductOrder> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a product order model instance should use the {@link ProductOrder} interface instead.
	 */

	/**
	 * Returns the primary key of this product order.
	 *
	 * @return the primary key of this product order
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this product order.
	 *
	 * @param primaryKey the primary key of this product order
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this product order.
	 *
	 * @return the uuid of this product order
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this product order.
	 *
	 * @param uuid the uuid of this product order
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this product order.
	 *
	 * @return the ID of this product order
	 */
	public long getId();

	/**
	 * Sets the ID of this product order.
	 *
	 * @param id the ID of this product order
	 */
	public void setId(long id);

	/**
	 * Returns the product ID of this product order.
	 *
	 * @return the product ID of this product order
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this product order.
	 *
	 * @param productId the product ID of this product order
	 */
	public void setProductId(long productId);

	/**
	 * Returns the size of this product order.
	 *
	 * @return the size of this product order
	 */
	@AutoEscape
	public String getSize();

	/**
	 * Sets the size of this product order.
	 *
	 * @param size the size of this product order
	 */
	public void setSize(String size);

	/**
	 * Returns the quantity of this product order.
	 *
	 * @return the quantity of this product order
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this product order.
	 *
	 * @param quantity the quantity of this product order
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the cost of this product order.
	 *
	 * @return the cost of this product order
	 */
	public long getCost();

	/**
	 * Sets the cost of this product order.
	 *
	 * @param cost the cost of this product order
	 */
	public void setCost(long cost);

	/**
	 * Returns the user ID of this product order.
	 *
	 * @return the user ID of this product order
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this product order.
	 *
	 * @param userId the user ID of this product order
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this product order.
	 *
	 * @return the user uuid of this product order
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this product order.
	 *
	 * @param userUuid the user uuid of this product order
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the address ID of this product order.
	 *
	 * @return the address ID of this product order
	 */
	public long getAddressId();

	/**
	 * Sets the address ID of this product order.
	 *
	 * @param addressId the address ID of this product order
	 */
	public void setAddressId(long addressId);

	/**
	 * Returns the create date of this product order.
	 *
	 * @return the create date of this product order
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this product order.
	 *
	 * @param createDate the create date of this product order
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this product order.
	 *
	 * @return the modified date of this product order
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this product order.
	 *
	 * @param modifiedDate the modified date of this product order
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
	public int compareTo(ProductOrder productOrder);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ProductOrder> toCacheModel();

	@Override
	public ProductOrder toEscapedModel();

	@Override
	public ProductOrder toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}