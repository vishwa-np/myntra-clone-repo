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

package com.onlineshopping.product.service.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;

import com.onlineshopping.product.service.model.Wishlist;
import com.onlineshopping.product.service.model.WishlistModel;
import com.onlineshopping.product.service.model.WishlistSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Wishlist service. Represents a row in the &quot;Product_Wishlist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>WishlistModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WishlistImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WishlistImpl
 * @generated
 */
@JSON(strict = true)
public class WishlistModelImpl
	extends BaseModelImpl<Wishlist> implements WishlistModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wishlist model instance should use the <code>Wishlist</code> interface instead.
	 */
	public static final String TABLE_NAME = "Product_Wishlist";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"userId", Types.BIGINT}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Product_Wishlist (uuid_ VARCHAR(75) null,id_ LONG not null primary key,userId LONG,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table Product_Wishlist";

	public static final String ORDER_BY_JPQL = " ORDER BY wishlist.id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Product_Wishlist.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.onlineshopping.product.service.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.onlineshopping.product.service.model.Wishlist"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.onlineshopping.product.service.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.onlineshopping.product.service.model.Wishlist"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.onlineshopping.product.service.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.onlineshopping.product.service.model.Wishlist"),
		true);

	public static final long USERID_COLUMN_BITMASK = 1L;

	public static final long UUID_COLUMN_BITMASK = 2L;

	public static final long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Wishlist toModel(WishlistSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Wishlist model = new WishlistImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Wishlist> toModels(WishlistSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Wishlist> models = new ArrayList<Wishlist>(soapModels.length);

		for (WishlistSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.onlineshopping.product.service.service.util.ServiceProps.get(
			"lock.expiration.time.com.onlineshopping.product.service.model.Wishlist"));

	public WishlistModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Wishlist.class;
	}

	@Override
	public String getModelClassName() {
		return Wishlist.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Wishlist, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Wishlist, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Wishlist, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Wishlist)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Wishlist, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Wishlist, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Wishlist)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Wishlist, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Wishlist, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Wishlist>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Wishlist.class.getClassLoader(), Wishlist.class,
			ModelWrapper.class);

		try {
			Constructor<Wishlist> constructor =
				(Constructor<Wishlist>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Wishlist, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Wishlist, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Wishlist, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Wishlist, Object>>();
		Map<String, BiConsumer<Wishlist, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Wishlist, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<Wishlist, Object>() {

				@Override
				public Object apply(Wishlist wishlist) {
					return wishlist.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<Wishlist, Object>() {

				@Override
				public void accept(Wishlist wishlist, Object uuidObject) {
					wishlist.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"id",
			new Function<Wishlist, Object>() {

				@Override
				public Object apply(Wishlist wishlist) {
					return wishlist.getId();
				}

			});
		attributeSetterBiConsumers.put(
			"id",
			new BiConsumer<Wishlist, Object>() {

				@Override
				public void accept(Wishlist wishlist, Object idObject) {
					wishlist.setId((Long)idObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<Wishlist, Object>() {

				@Override
				public Object apply(Wishlist wishlist) {
					return wishlist.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<Wishlist, Object>() {

				@Override
				public void accept(Wishlist wishlist, Object userIdObject) {
					wishlist.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Wishlist, Object>() {

				@Override
				public Object apply(Wishlist wishlist) {
					return wishlist.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Wishlist, Object>() {

				@Override
				public void accept(Wishlist wishlist, Object createDateObject) {
					wishlist.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Wishlist, Object>() {

				@Override
				public Object apply(Wishlist wishlist) {
					return wishlist.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Wishlist, Object>() {

				@Override
				public void accept(
					Wishlist wishlist, Object modifiedDateObject) {

					wishlist.setModifiedDate((Date)modifiedDateObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Wishlist.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Wishlist toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Wishlist>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WishlistImpl wishlistImpl = new WishlistImpl();

		wishlistImpl.setUuid(getUuid());
		wishlistImpl.setId(getId());
		wishlistImpl.setUserId(getUserId());
		wishlistImpl.setCreateDate(getCreateDate());
		wishlistImpl.setModifiedDate(getModifiedDate());

		wishlistImpl.resetOriginalValues();

		return wishlistImpl;
	}

	@Override
	public int compareTo(Wishlist wishlist) {
		int value = 0;

		if (getId() < wishlist.getId()) {
			value = -1;
		}
		else if (getId() > wishlist.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Wishlist)) {
			return false;
		}

		Wishlist wishlist = (Wishlist)object;

		long primaryKey = wishlist.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalUserId = _userId;

		_setOriginalUserId = false;

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Wishlist> toCacheModel() {
		WishlistCacheModel wishlistCacheModel = new WishlistCacheModel();

		wishlistCacheModel.uuid = getUuid();

		String uuid = wishlistCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			wishlistCacheModel.uuid = null;
		}

		wishlistCacheModel.id = getId();

		wishlistCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			wishlistCacheModel.createDate = createDate.getTime();
		}
		else {
			wishlistCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			wishlistCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			wishlistCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return wishlistCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Wishlist, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Wishlist, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Wishlist, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Wishlist)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Wishlist, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Wishlist, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Wishlist, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Wishlist)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Wishlist>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _id;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Wishlist _escapedModel;

}