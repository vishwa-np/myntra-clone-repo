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
 * The base model interface for the Highlights service. Represents a row in the &quot;Product_Highlights&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.onlineshopping.product.service.model.impl.HighlightsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.onlineshopping.product.service.model.impl.HighlightsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Highlights
 * @generated
 */
@ProviderType
public interface HighlightsModel extends BaseModel<Highlights> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a highlights model instance should use the {@link Highlights} interface instead.
	 */

	/**
	 * Returns the primary key of this highlights.
	 *
	 * @return the primary key of this highlights
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this highlights.
	 *
	 * @param primaryKey the primary key of this highlights
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this highlights.
	 *
	 * @return the uuid of this highlights
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this highlights.
	 *
	 * @param uuid the uuid of this highlights
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this highlights.
	 *
	 * @return the ID of this highlights
	 */
	public long getId();

	/**
	 * Sets the ID of this highlights.
	 *
	 * @param id the ID of this highlights
	 */
	public void setId(long id);

	/**
	 * Returns the features of this highlights.
	 *
	 * @return the features of this highlights
	 */
	@AutoEscape
	public String getFeatures();

	/**
	 * Sets the features of this highlights.
	 *
	 * @param features the features of this highlights
	 */
	public void setFeatures(String features);

	/**
	 * Returns the size of this highlights.
	 *
	 * @return the size of this highlights
	 */
	@AutoEscape
	public String getSize();

	/**
	 * Sets the size of this highlights.
	 *
	 * @param size the size of this highlights
	 */
	public void setSize(String size);

	/**
	 * Returns the create date of this highlights.
	 *
	 * @return the create date of this highlights
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this highlights.
	 *
	 * @param createDate the create date of this highlights
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this highlights.
	 *
	 * @return the modified date of this highlights
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this highlights.
	 *
	 * @param modifiedDate the modified date of this highlights
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
	public int compareTo(Highlights highlights);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Highlights> toCacheModel();

	@Override
	public Highlights toEscapedModel();

	@Override
	public Highlights toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}