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

package com.onlineshopping.product.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.onlineshopping.product.service.model.CartList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cart list service. This utility wraps <code>com.onlineshopping.product.service.service.persistence.impl.CartListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CartListPersistence
 * @generated
 */
public class CartListUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CartList cartList) {
		getPersistence().clearCache(cartList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CartList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CartList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CartList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CartList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CartList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CartList update(CartList cartList) {
		return getPersistence().update(cartList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CartList update(
		CartList cartList, ServiceContext serviceContext) {

		return getPersistence().update(cartList, serviceContext);
	}

	/**
	 * Returns all the cart lists where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cart lists
	 */
	public static List<CartList> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cart lists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CartListModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cart lists
	 * @param end the upper bound of the range of cart lists (not inclusive)
	 * @return the range of matching cart lists
	 */
	public static List<CartList> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cart lists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CartListModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cart lists
	 * @param end the upper bound of the range of cart lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cart lists
	 */
	public static List<CartList> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CartList> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cart lists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CartListModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cart lists
	 * @param end the upper bound of the range of cart lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cart lists
	 */
	public static List<CartList> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CartList> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cart list in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cart list
	 * @throws NoSuchCartListException if a matching cart list could not be found
	 */
	public static CartList findByUuid_First(
			String uuid, OrderByComparator<CartList> orderByComparator)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cart list in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cart list, or <code>null</code> if a matching cart list could not be found
	 */
	public static CartList fetchByUuid_First(
		String uuid, OrderByComparator<CartList> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cart list in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cart list
	 * @throws NoSuchCartListException if a matching cart list could not be found
	 */
	public static CartList findByUuid_Last(
			String uuid, OrderByComparator<CartList> orderByComparator)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cart list in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cart list, or <code>null</code> if a matching cart list could not be found
	 */
	public static CartList fetchByUuid_Last(
		String uuid, OrderByComparator<CartList> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cart lists before and after the current cart list in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current cart list
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cart list
	 * @throws NoSuchCartListException if a cart list with the primary key could not be found
	 */
	public static CartList[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<CartList> orderByComparator)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the cart lists where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cart lists where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cart lists
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cart list where userId = &#63; or throws a <code>NoSuchCartListException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching cart list
	 * @throws NoSuchCartListException if a matching cart list could not be found
	 */
	public static CartList findByUserId(long userId)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns the cart list where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching cart list, or <code>null</code> if a matching cart list could not be found
	 */
	public static CartList fetchByUserId(long userId) {
		return getPersistence().fetchByUserId(userId);
	}

	/**
	 * Returns the cart list where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cart list, or <code>null</code> if a matching cart list could not be found
	 */
	public static CartList fetchByUserId(long userId, boolean useFinderCache) {
		return getPersistence().fetchByUserId(userId, useFinderCache);
	}

	/**
	 * Removes the cart list where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the cart list that was removed
	 */
	public static CartList removeByUserId(long userId)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of cart lists where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching cart lists
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the cart list in the entity cache if it is enabled.
	 *
	 * @param cartList the cart list
	 */
	public static void cacheResult(CartList cartList) {
		getPersistence().cacheResult(cartList);
	}

	/**
	 * Caches the cart lists in the entity cache if it is enabled.
	 *
	 * @param cartLists the cart lists
	 */
	public static void cacheResult(List<CartList> cartLists) {
		getPersistence().cacheResult(cartLists);
	}

	/**
	 * Creates a new cart list with the primary key. Does not add the cart list to the database.
	 *
	 * @param id the primary key for the new cart list
	 * @return the new cart list
	 */
	public static CartList create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the cart list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cart list
	 * @return the cart list that was removed
	 * @throws NoSuchCartListException if a cart list with the primary key could not be found
	 */
	public static CartList remove(long id)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().remove(id);
	}

	public static CartList updateImpl(CartList cartList) {
		return getPersistence().updateImpl(cartList);
	}

	/**
	 * Returns the cart list with the primary key or throws a <code>NoSuchCartListException</code> if it could not be found.
	 *
	 * @param id the primary key of the cart list
	 * @return the cart list
	 * @throws NoSuchCartListException if a cart list with the primary key could not be found
	 */
	public static CartList findByPrimaryKey(long id)
		throws com.onlineshopping.product.service.exception.
			NoSuchCartListException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the cart list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cart list
	 * @return the cart list, or <code>null</code> if a cart list with the primary key could not be found
	 */
	public static CartList fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the cart lists.
	 *
	 * @return the cart lists
	 */
	public static List<CartList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cart lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CartListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cart lists
	 * @param end the upper bound of the range of cart lists (not inclusive)
	 * @return the range of cart lists
	 */
	public static List<CartList> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cart lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CartListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cart lists
	 * @param end the upper bound of the range of cart lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cart lists
	 */
	public static List<CartList> findAll(
		int start, int end, OrderByComparator<CartList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cart lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CartListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cart lists
	 * @param end the upper bound of the range of cart lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cart lists
	 */
	public static List<CartList> findAll(
		int start, int end, OrderByComparator<CartList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cart lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cart lists.
	 *
	 * @return the number of cart lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CartListPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CartListPersistence _persistence;

}