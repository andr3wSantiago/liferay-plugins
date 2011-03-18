/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.testtransaction.service;

/**
 * <p>
 * This class is a wrapper for {@link BarLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       BarLocalService
 * @generated
 */
public class BarLocalServiceWrapper implements BarLocalService {
	public BarLocalServiceWrapper(BarLocalService barLocalService) {
		_barLocalService = barLocalService;
	}

	/**
	* Adds the bar to the database. Also notifies the appropriate model listeners.
	*
	* @param bar the bar to add
	* @return the bar that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.testtransaction.model.Bar addBar(
		com.liferay.testtransaction.model.Bar bar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.addBar(bar);
	}

	/**
	* Creates a new bar with the primary key. Does not add the bar to the database.
	*
	* @param barId the primary key for the new bar
	* @return the new bar
	*/
	public com.liferay.testtransaction.model.Bar createBar(long barId) {
		return _barLocalService.createBar(barId);
	}

	/**
	* Deletes the bar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param barId the primary key of the bar to delete
	* @throws PortalException if a bar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteBar(long barId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_barLocalService.deleteBar(barId);
	}

	/**
	* Deletes the bar from the database. Also notifies the appropriate model listeners.
	*
	* @param bar the bar to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteBar(com.liferay.testtransaction.model.Bar bar)
		throws com.liferay.portal.kernel.exception.SystemException {
		_barLocalService.deleteBar(bar);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the bar with the primary key.
	*
	* @param barId the primary key of the bar to get
	* @return the bar
	* @throws PortalException if a bar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.testtransaction.model.Bar getBar(long barId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.getBar(barId);
	}

	/**
	* Gets a range of all the bars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of bars to return
	* @param end the upper bound of the range of bars to return (not inclusive)
	* @return the range of bars
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.testtransaction.model.Bar> getBars(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.getBars(start, end);
	}

	/**
	* Gets the number of bars.
	*
	* @return the number of bars
	* @throws SystemException if a system exception occurred
	*/
	public int getBarsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.getBarsCount();
	}

	/**
	* Updates the bar in the database. Also notifies the appropriate model listeners.
	*
	* @param bar the bar to update
	* @return the bar that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.testtransaction.model.Bar updateBar(
		com.liferay.testtransaction.model.Bar bar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.updateBar(bar);
	}

	/**
	* Updates the bar in the database. Also notifies the appropriate model listeners.
	*
	* @param bar the bar to update
	* @param merge whether to merge the bar with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the bar that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.testtransaction.model.Bar updateBar(
		com.liferay.testtransaction.model.Bar bar, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.updateBar(bar, merge);
	}

	/**
	* Gets the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _barLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_barLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* NOTE FOR DEVELOPERS:
	*
	* Never reference this interface directly. Always use {@link com.liferay.testtransaction.service.BarLocalServiceUtil} to access the bar local service.
	*/
	public void addBarPortalRollback(java.lang.String text)
		throws com.liferay.portal.kernel.exception.SystemException {
		_barLocalService.addBarPortalRollback(text);
	}

	public void addBarPortletRollback(java.lang.String text)
		throws com.liferay.portal.kernel.exception.SystemException {
		_barLocalService.addBarPortletRollback(text);
	}

	public com.liferay.testtransaction.model.Bar addBarSuccess(
		java.lang.String text)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.addBarSuccess(text);
	}

	public void cleanUp(com.liferay.testtransaction.model.Bar bar)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_barLocalService.cleanUp(bar);
	}

	public boolean hasBar(java.lang.String text)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.hasBar(text);
	}

	public boolean hasClassName()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _barLocalService.hasClassName();
	}

	public BarLocalService getWrappedBarLocalService() {
		return _barLocalService;
	}

	public void setWrappedBarLocalService(BarLocalService barLocalService) {
		_barLocalService = barLocalService;
	}

	private BarLocalService _barLocalService;
}