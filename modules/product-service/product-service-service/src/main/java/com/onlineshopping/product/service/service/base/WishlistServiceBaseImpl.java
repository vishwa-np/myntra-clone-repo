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

package com.onlineshopping.product.service.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.onlineshopping.product.service.model.Wishlist;
import com.onlineshopping.product.service.service.WishlistService;
import com.onlineshopping.product.service.service.WishlistServiceUtil;
import com.onlineshopping.product.service.service.persistence.BrandPersistence;
import com.onlineshopping.product.service.service.persistence.CartListPersistence;
import com.onlineshopping.product.service.service.persistence.CartListProductPersistence;
import com.onlineshopping.product.service.service.persistence.HighlightsPersistence;
import com.onlineshopping.product.service.service.persistence.ImagePersistence;
import com.onlineshopping.product.service.service.persistence.ProductCategoryPersistence;
import com.onlineshopping.product.service.service.persistence.ProductOrderPersistence;
import com.onlineshopping.product.service.service.persistence.ProductPersistence;
import com.onlineshopping.product.service.service.persistence.WishlistPersistence;
import com.onlineshopping.product.service.service.persistence.WishlistProductPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the wishlist remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.onlineshopping.product.service.service.impl.WishlistServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.onlineshopping.product.service.service.impl.WishlistServiceImpl
 * @generated
 */
public abstract class WishlistServiceBaseImpl
	extends BaseServiceImpl
	implements IdentifiableOSGiService, WishlistService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>WishlistService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>WishlistServiceUtil</code>.
	 */

	/**
	 * Returns the brand local service.
	 *
	 * @return the brand local service
	 */
	public com.onlineshopping.product.service.service.BrandLocalService
		getBrandLocalService() {

		return brandLocalService;
	}

	/**
	 * Sets the brand local service.
	 *
	 * @param brandLocalService the brand local service
	 */
	public void setBrandLocalService(
		com.onlineshopping.product.service.service.BrandLocalService
			brandLocalService) {

		this.brandLocalService = brandLocalService;
	}

	/**
	 * Returns the brand remote service.
	 *
	 * @return the brand remote service
	 */
	public com.onlineshopping.product.service.service.BrandService
		getBrandService() {

		return brandService;
	}

	/**
	 * Sets the brand remote service.
	 *
	 * @param brandService the brand remote service
	 */
	public void setBrandService(
		com.onlineshopping.product.service.service.BrandService brandService) {

		this.brandService = brandService;
	}

	/**
	 * Returns the brand persistence.
	 *
	 * @return the brand persistence
	 */
	public BrandPersistence getBrandPersistence() {
		return brandPersistence;
	}

	/**
	 * Sets the brand persistence.
	 *
	 * @param brandPersistence the brand persistence
	 */
	public void setBrandPersistence(BrandPersistence brandPersistence) {
		this.brandPersistence = brandPersistence;
	}

	/**
	 * Returns the cart list local service.
	 *
	 * @return the cart list local service
	 */
	public com.onlineshopping.product.service.service.CartListLocalService
		getCartListLocalService() {

		return cartListLocalService;
	}

	/**
	 * Sets the cart list local service.
	 *
	 * @param cartListLocalService the cart list local service
	 */
	public void setCartListLocalService(
		com.onlineshopping.product.service.service.CartListLocalService
			cartListLocalService) {

		this.cartListLocalService = cartListLocalService;
	}

	/**
	 * Returns the cart list remote service.
	 *
	 * @return the cart list remote service
	 */
	public com.onlineshopping.product.service.service.CartListService
		getCartListService() {

		return cartListService;
	}

	/**
	 * Sets the cart list remote service.
	 *
	 * @param cartListService the cart list remote service
	 */
	public void setCartListService(
		com.onlineshopping.product.service.service.CartListService
			cartListService) {

		this.cartListService = cartListService;
	}

	/**
	 * Returns the cart list persistence.
	 *
	 * @return the cart list persistence
	 */
	public CartListPersistence getCartListPersistence() {
		return cartListPersistence;
	}

	/**
	 * Sets the cart list persistence.
	 *
	 * @param cartListPersistence the cart list persistence
	 */
	public void setCartListPersistence(
		CartListPersistence cartListPersistence) {

		this.cartListPersistence = cartListPersistence;
	}

	/**
	 * Returns the cart list product local service.
	 *
	 * @return the cart list product local service
	 */
	public
		com.onlineshopping.product.service.service.CartListProductLocalService
			getCartListProductLocalService() {

		return cartListProductLocalService;
	}

	/**
	 * Sets the cart list product local service.
	 *
	 * @param cartListProductLocalService the cart list product local service
	 */
	public void setCartListProductLocalService(
		com.onlineshopping.product.service.service.CartListProductLocalService
			cartListProductLocalService) {

		this.cartListProductLocalService = cartListProductLocalService;
	}

	/**
	 * Returns the cart list product remote service.
	 *
	 * @return the cart list product remote service
	 */
	public com.onlineshopping.product.service.service.CartListProductService
		getCartListProductService() {

		return cartListProductService;
	}

	/**
	 * Sets the cart list product remote service.
	 *
	 * @param cartListProductService the cart list product remote service
	 */
	public void setCartListProductService(
		com.onlineshopping.product.service.service.CartListProductService
			cartListProductService) {

		this.cartListProductService = cartListProductService;
	}

	/**
	 * Returns the cart list product persistence.
	 *
	 * @return the cart list product persistence
	 */
	public CartListProductPersistence getCartListProductPersistence() {
		return cartListProductPersistence;
	}

	/**
	 * Sets the cart list product persistence.
	 *
	 * @param cartListProductPersistence the cart list product persistence
	 */
	public void setCartListProductPersistence(
		CartListProductPersistence cartListProductPersistence) {

		this.cartListProductPersistence = cartListProductPersistence;
	}

	/**
	 * Returns the highlights local service.
	 *
	 * @return the highlights local service
	 */
	public com.onlineshopping.product.service.service.HighlightsLocalService
		getHighlightsLocalService() {

		return highlightsLocalService;
	}

	/**
	 * Sets the highlights local service.
	 *
	 * @param highlightsLocalService the highlights local service
	 */
	public void setHighlightsLocalService(
		com.onlineshopping.product.service.service.HighlightsLocalService
			highlightsLocalService) {

		this.highlightsLocalService = highlightsLocalService;
	}

	/**
	 * Returns the highlights remote service.
	 *
	 * @return the highlights remote service
	 */
	public com.onlineshopping.product.service.service.HighlightsService
		getHighlightsService() {

		return highlightsService;
	}

	/**
	 * Sets the highlights remote service.
	 *
	 * @param highlightsService the highlights remote service
	 */
	public void setHighlightsService(
		com.onlineshopping.product.service.service.HighlightsService
			highlightsService) {

		this.highlightsService = highlightsService;
	}

	/**
	 * Returns the highlights persistence.
	 *
	 * @return the highlights persistence
	 */
	public HighlightsPersistence getHighlightsPersistence() {
		return highlightsPersistence;
	}

	/**
	 * Sets the highlights persistence.
	 *
	 * @param highlightsPersistence the highlights persistence
	 */
	public void setHighlightsPersistence(
		HighlightsPersistence highlightsPersistence) {

		this.highlightsPersistence = highlightsPersistence;
	}

	/**
	 * Returns the image local service.
	 *
	 * @return the image local service
	 */
	public com.onlineshopping.product.service.service.ImageLocalService
		getImageLocalService() {

		return imageLocalService;
	}

	/**
	 * Sets the image local service.
	 *
	 * @param imageLocalService the image local service
	 */
	public void setImageLocalService(
		com.onlineshopping.product.service.service.ImageLocalService
			imageLocalService) {

		this.imageLocalService = imageLocalService;
	}

	/**
	 * Returns the image remote service.
	 *
	 * @return the image remote service
	 */
	public com.onlineshopping.product.service.service.ImageService
		getImageService() {

		return imageService;
	}

	/**
	 * Sets the image remote service.
	 *
	 * @param imageService the image remote service
	 */
	public void setImageService(
		com.onlineshopping.product.service.service.ImageService imageService) {

		this.imageService = imageService;
	}

	/**
	 * Returns the image persistence.
	 *
	 * @return the image persistence
	 */
	public ImagePersistence getImagePersistence() {
		return imagePersistence;
	}

	/**
	 * Sets the image persistence.
	 *
	 * @param imagePersistence the image persistence
	 */
	public void setImagePersistence(ImagePersistence imagePersistence) {
		this.imagePersistence = imagePersistence;
	}

	/**
	 * Returns the product local service.
	 *
	 * @return the product local service
	 */
	public com.onlineshopping.product.service.service.ProductLocalService
		getProductLocalService() {

		return productLocalService;
	}

	/**
	 * Sets the product local service.
	 *
	 * @param productLocalService the product local service
	 */
	public void setProductLocalService(
		com.onlineshopping.product.service.service.ProductLocalService
			productLocalService) {

		this.productLocalService = productLocalService;
	}

	/**
	 * Returns the product remote service.
	 *
	 * @return the product remote service
	 */
	public com.onlineshopping.product.service.service.ProductService
		getProductService() {

		return productService;
	}

	/**
	 * Sets the product remote service.
	 *
	 * @param productService the product remote service
	 */
	public void setProductService(
		com.onlineshopping.product.service.service.ProductService
			productService) {

		this.productService = productService;
	}

	/**
	 * Returns the product persistence.
	 *
	 * @return the product persistence
	 */
	public ProductPersistence getProductPersistence() {
		return productPersistence;
	}

	/**
	 * Sets the product persistence.
	 *
	 * @param productPersistence the product persistence
	 */
	public void setProductPersistence(ProductPersistence productPersistence) {
		this.productPersistence = productPersistence;
	}

	/**
	 * Returns the product category local service.
	 *
	 * @return the product category local service
	 */
	public
		com.onlineshopping.product.service.service.ProductCategoryLocalService
			getProductCategoryLocalService() {

		return productCategoryLocalService;
	}

	/**
	 * Sets the product category local service.
	 *
	 * @param productCategoryLocalService the product category local service
	 */
	public void setProductCategoryLocalService(
		com.onlineshopping.product.service.service.ProductCategoryLocalService
			productCategoryLocalService) {

		this.productCategoryLocalService = productCategoryLocalService;
	}

	/**
	 * Returns the product category remote service.
	 *
	 * @return the product category remote service
	 */
	public com.onlineshopping.product.service.service.ProductCategoryService
		getProductCategoryService() {

		return productCategoryService;
	}

	/**
	 * Sets the product category remote service.
	 *
	 * @param productCategoryService the product category remote service
	 */
	public void setProductCategoryService(
		com.onlineshopping.product.service.service.ProductCategoryService
			productCategoryService) {

		this.productCategoryService = productCategoryService;
	}

	/**
	 * Returns the product category persistence.
	 *
	 * @return the product category persistence
	 */
	public ProductCategoryPersistence getProductCategoryPersistence() {
		return productCategoryPersistence;
	}

	/**
	 * Sets the product category persistence.
	 *
	 * @param productCategoryPersistence the product category persistence
	 */
	public void setProductCategoryPersistence(
		ProductCategoryPersistence productCategoryPersistence) {

		this.productCategoryPersistence = productCategoryPersistence;
	}

	/**
	 * Returns the product order local service.
	 *
	 * @return the product order local service
	 */
	public com.onlineshopping.product.service.service.ProductOrderLocalService
		getProductOrderLocalService() {

		return productOrderLocalService;
	}

	/**
	 * Sets the product order local service.
	 *
	 * @param productOrderLocalService the product order local service
	 */
	public void setProductOrderLocalService(
		com.onlineshopping.product.service.service.ProductOrderLocalService
			productOrderLocalService) {

		this.productOrderLocalService = productOrderLocalService;
	}

	/**
	 * Returns the product order remote service.
	 *
	 * @return the product order remote service
	 */
	public com.onlineshopping.product.service.service.ProductOrderService
		getProductOrderService() {

		return productOrderService;
	}

	/**
	 * Sets the product order remote service.
	 *
	 * @param productOrderService the product order remote service
	 */
	public void setProductOrderService(
		com.onlineshopping.product.service.service.ProductOrderService
			productOrderService) {

		this.productOrderService = productOrderService;
	}

	/**
	 * Returns the product order persistence.
	 *
	 * @return the product order persistence
	 */
	public ProductOrderPersistence getProductOrderPersistence() {
		return productOrderPersistence;
	}

	/**
	 * Sets the product order persistence.
	 *
	 * @param productOrderPersistence the product order persistence
	 */
	public void setProductOrderPersistence(
		ProductOrderPersistence productOrderPersistence) {

		this.productOrderPersistence = productOrderPersistence;
	}

	/**
	 * Returns the wishlist local service.
	 *
	 * @return the wishlist local service
	 */
	public com.onlineshopping.product.service.service.WishlistLocalService
		getWishlistLocalService() {

		return wishlistLocalService;
	}

	/**
	 * Sets the wishlist local service.
	 *
	 * @param wishlistLocalService the wishlist local service
	 */
	public void setWishlistLocalService(
		com.onlineshopping.product.service.service.WishlistLocalService
			wishlistLocalService) {

		this.wishlistLocalService = wishlistLocalService;
	}

	/**
	 * Returns the wishlist remote service.
	 *
	 * @return the wishlist remote service
	 */
	public WishlistService getWishlistService() {
		return wishlistService;
	}

	/**
	 * Sets the wishlist remote service.
	 *
	 * @param wishlistService the wishlist remote service
	 */
	public void setWishlistService(WishlistService wishlistService) {
		this.wishlistService = wishlistService;
	}

	/**
	 * Returns the wishlist persistence.
	 *
	 * @return the wishlist persistence
	 */
	public WishlistPersistence getWishlistPersistence() {
		return wishlistPersistence;
	}

	/**
	 * Sets the wishlist persistence.
	 *
	 * @param wishlistPersistence the wishlist persistence
	 */
	public void setWishlistPersistence(
		WishlistPersistence wishlistPersistence) {

		this.wishlistPersistence = wishlistPersistence;
	}

	/**
	 * Returns the wishlist product local service.
	 *
	 * @return the wishlist product local service
	 */
	public
		com.onlineshopping.product.service.service.WishlistProductLocalService
			getWishlistProductLocalService() {

		return wishlistProductLocalService;
	}

	/**
	 * Sets the wishlist product local service.
	 *
	 * @param wishlistProductLocalService the wishlist product local service
	 */
	public void setWishlistProductLocalService(
		com.onlineshopping.product.service.service.WishlistProductLocalService
			wishlistProductLocalService) {

		this.wishlistProductLocalService = wishlistProductLocalService;
	}

	/**
	 * Returns the wishlist product remote service.
	 *
	 * @return the wishlist product remote service
	 */
	public com.onlineshopping.product.service.service.WishlistProductService
		getWishlistProductService() {

		return wishlistProductService;
	}

	/**
	 * Sets the wishlist product remote service.
	 *
	 * @param wishlistProductService the wishlist product remote service
	 */
	public void setWishlistProductService(
		com.onlineshopping.product.service.service.WishlistProductService
			wishlistProductService) {

		this.wishlistProductService = wishlistProductService;
	}

	/**
	 * Returns the wishlist product persistence.
	 *
	 * @return the wishlist product persistence
	 */
	public WishlistProductPersistence getWishlistProductPersistence() {
		return wishlistProductPersistence;
	}

	/**
	 * Sets the wishlist product persistence.
	 *
	 * @param wishlistProductPersistence the wishlist product persistence
	 */
	public void setWishlistProductPersistence(
		WishlistProductPersistence wishlistProductPersistence) {

		this.wishlistProductPersistence = wishlistProductPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService
		getClassNameService() {

		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {

		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {

		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		_setServiceUtilService(wishlistService);
	}

	public void destroy() {
		_setServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return WishlistService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Wishlist.class;
	}

	protected String getModelClassName() {
		return Wishlist.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = wishlistPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(WishlistService wishlistService) {
		try {
			Field field = WishlistServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, wishlistService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@BeanReference(
		type = com.onlineshopping.product.service.service.BrandLocalService.class
	)
	protected com.onlineshopping.product.service.service.BrandLocalService
		brandLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.BrandService.class
	)
	protected com.onlineshopping.product.service.service.BrandService
		brandService;

	@BeanReference(type = BrandPersistence.class)
	protected BrandPersistence brandPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.CartListLocalService.class
	)
	protected com.onlineshopping.product.service.service.CartListLocalService
		cartListLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.CartListService.class
	)
	protected com.onlineshopping.product.service.service.CartListService
		cartListService;

	@BeanReference(type = CartListPersistence.class)
	protected CartListPersistence cartListPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.CartListProductLocalService.class
	)
	protected
		com.onlineshopping.product.service.service.CartListProductLocalService
			cartListProductLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.CartListProductService.class
	)
	protected com.onlineshopping.product.service.service.CartListProductService
		cartListProductService;

	@BeanReference(type = CartListProductPersistence.class)
	protected CartListProductPersistence cartListProductPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.HighlightsLocalService.class
	)
	protected com.onlineshopping.product.service.service.HighlightsLocalService
		highlightsLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.HighlightsService.class
	)
	protected com.onlineshopping.product.service.service.HighlightsService
		highlightsService;

	@BeanReference(type = HighlightsPersistence.class)
	protected HighlightsPersistence highlightsPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ImageLocalService.class
	)
	protected com.onlineshopping.product.service.service.ImageLocalService
		imageLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ImageService.class
	)
	protected com.onlineshopping.product.service.service.ImageService
		imageService;

	@BeanReference(type = ImagePersistence.class)
	protected ImagePersistence imagePersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ProductLocalService.class
	)
	protected com.onlineshopping.product.service.service.ProductLocalService
		productLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ProductService.class
	)
	protected com.onlineshopping.product.service.service.ProductService
		productService;

	@BeanReference(type = ProductPersistence.class)
	protected ProductPersistence productPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ProductCategoryLocalService.class
	)
	protected
		com.onlineshopping.product.service.service.ProductCategoryLocalService
			productCategoryLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ProductCategoryService.class
	)
	protected com.onlineshopping.product.service.service.ProductCategoryService
		productCategoryService;

	@BeanReference(type = ProductCategoryPersistence.class)
	protected ProductCategoryPersistence productCategoryPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ProductOrderLocalService.class
	)
	protected
		com.onlineshopping.product.service.service.ProductOrderLocalService
			productOrderLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.ProductOrderService.class
	)
	protected com.onlineshopping.product.service.service.ProductOrderService
		productOrderService;

	@BeanReference(type = ProductOrderPersistence.class)
	protected ProductOrderPersistence productOrderPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.WishlistLocalService.class
	)
	protected com.onlineshopping.product.service.service.WishlistLocalService
		wishlistLocalService;

	@BeanReference(type = WishlistService.class)
	protected WishlistService wishlistService;

	@BeanReference(type = WishlistPersistence.class)
	protected WishlistPersistence wishlistPersistence;

	@BeanReference(
		type = com.onlineshopping.product.service.service.WishlistProductLocalService.class
	)
	protected
		com.onlineshopping.product.service.service.WishlistProductLocalService
			wishlistProductLocalService;

	@BeanReference(
		type = com.onlineshopping.product.service.service.WishlistProductService.class
	)
	protected com.onlineshopping.product.service.service.WishlistProductService
		wishlistProductService;

	@BeanReference(type = WishlistProductPersistence.class)
	protected WishlistProductPersistence wishlistProductPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserService.class
	)
	protected com.liferay.portal.kernel.service.UserService userService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

}