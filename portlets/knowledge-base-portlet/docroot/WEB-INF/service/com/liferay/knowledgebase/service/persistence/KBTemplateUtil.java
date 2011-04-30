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

package com.liferay.knowledgebase.service.persistence;

import com.liferay.knowledgebase.model.KBTemplate;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the k b template service. This utility wraps {@link KBTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KBTemplatePersistence
 * @see KBTemplatePersistenceImpl
 * @generated
 */
public class KBTemplateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(KBTemplate kbTemplate) {
		getPersistence().clearCache(kbTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KBTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KBTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KBTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static KBTemplate remove(KBTemplate kbTemplate)
		throws SystemException {
		return getPersistence().remove(kbTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static KBTemplate update(KBTemplate kbTemplate, boolean merge)
		throws SystemException {
		return getPersistence().update(kbTemplate, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static KBTemplate update(KBTemplate kbTemplate, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(kbTemplate, merge, serviceContext);
	}

	/**
	* Caches the k b template in the entity cache if it is enabled.
	*
	* @param kbTemplate the k b template to cache
	*/
	public static void cacheResult(
		com.liferay.knowledgebase.model.KBTemplate kbTemplate) {
		getPersistence().cacheResult(kbTemplate);
	}

	/**
	* Caches the k b templates in the entity cache if it is enabled.
	*
	* @param kbTemplates the k b templates to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.knowledgebase.model.KBTemplate> kbTemplates) {
		getPersistence().cacheResult(kbTemplates);
	}

	/**
	* Creates a new k b template with the primary key. Does not add the k b template to the database.
	*
	* @param kbTemplateId the primary key for the new k b template
	* @return the new k b template
	*/
	public static com.liferay.knowledgebase.model.KBTemplate create(
		long kbTemplateId) {
		return getPersistence().create(kbTemplateId);
	}

	/**
	* Removes the k b template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kbTemplateId the primary key of the k b template to remove
	* @return the k b template that was removed
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a k b template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate remove(
		long kbTemplateId)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(kbTemplateId);
	}

	public static com.liferay.knowledgebase.model.KBTemplate updateImpl(
		com.liferay.knowledgebase.model.KBTemplate kbTemplate, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kbTemplate, merge);
	}

	/**
	* Finds the k b template with the primary key or throws a {@link com.liferay.knowledgebase.NoSuchTemplateException} if it could not be found.
	*
	* @param kbTemplateId the primary key of the k b template to find
	* @return the k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a k b template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate findByPrimaryKey(
		long kbTemplateId)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(kbTemplateId);
	}

	/**
	* Finds the k b template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kbTemplateId the primary key of the k b template to find
	* @return the k b template, or <code>null</code> if a k b template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate fetchByPrimaryKey(
		long kbTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(kbTemplateId);
	}

	/**
	* Finds all the k b templates where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the k b templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @return the range of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the k b templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first k b template in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last k b template in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the k b templates before and after the current k b template in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kbTemplateId the primary key of the current k b template
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a k b template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate[] findByUuid_PrevAndNext(
		long kbTemplateId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(kbTemplateId, uuid, orderByComparator);
	}

	/**
	* Finds the k b template where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.knowledgebase.NoSuchTemplateException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Finds the k b template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching k b template, or <code>null</code> if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Finds the k b template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching k b template, or <code>null</code> if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Finds all the k b templates where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the k b templates where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @return the range of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the k b templates where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first k b template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last k b template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a matching k b template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the k b templates before and after the current k b template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kbTemplateId the primary key of the current k b template
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a k b template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate[] findByGroupId_PrevAndNext(
		long kbTemplateId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(kbTemplateId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the k b templates where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the matching k b templates that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and finds a range of all the k b templates where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @return the range of matching k b templates that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the k b templates where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching k b templates that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Filters the k b templates before and after the current k b template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kbTemplateId the primary key of the current k b template
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next k b template
	* @throws com.liferay.knowledgebase.NoSuchTemplateException if a k b template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.knowledgebase.model.KBTemplate[] filterFindByGroupId_PrevAndNext(
		long kbTemplateId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId_PrevAndNext(kbTemplateId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the k b templates.
	*
	* @return the k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the k b templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @return the range of k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the k b templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the k b templates where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes the k b template where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.knowledgebase.NoSuchTemplateException,
			com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Removes all the k b templates where groupId = &#63; from the database.
	*
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the k b templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the k b templates where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the k b templates where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the number of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Counts all the k b templates where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the number of matching k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and counts all the k b templates where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the number of matching k b templates that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Counts all the k b templates.
	*
	* @return the number of k b templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Gets all the k b articles associated with the k b template.
	*
	* @param pk the primary key of the k b template to get the associated k b articles for
	* @return the k b articles associated with the k b template
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKBArticles(pk);
	}

	/**
	* Gets a range of all the k b articles associated with the k b template.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the k b template to get the associated k b articles for
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @return the range of k b articles associated with the k b template
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKBArticles(pk, start, end);
	}

	/**
	* Gets an ordered range of all the k b articles associated with the k b template.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the k b template to get the associated k b articles for
	* @param start the lower bound of the range of k b templates to return
	* @param end the upper bound of the range of k b templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of k b articles associated with the k b template
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKBArticles(pk, start, end, orderByComparator);
	}

	/**
	* Gets the number of k b articles associated with the k b template.
	*
	* @param pk the primary key of the k b template to get the number of associated k b articles for
	* @return the number of k b articles associated with the k b template
	* @throws SystemException if a system exception occurred
	*/
	public static int getKBArticlesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKBArticlesSize(pk);
	}

	/**
	* Determines if the k b article is associated with the k b template.
	*
	* @param pk the primary key of the k b template
	* @param kbArticlePK the primary key of the k b article
	* @return <code>true</code> if the k b article is associated with the k b template; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsKBArticle(long pk, long kbArticlePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsKBArticle(pk, kbArticlePK);
	}

	/**
	* Determines if the k b template has any k b articles associated with it.
	*
	* @param pk the primary key of the k b template to check for associations with k b articles
	* @return <code>true</code> if the k b template has any k b articles associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsKBArticles(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsKBArticles(pk);
	}

	public static KBTemplatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KBTemplatePersistence)PortletBeanLocatorUtil.locate(com.liferay.knowledgebase.service.ClpSerializer.getServletContextName(),
					KBTemplatePersistence.class.getName());

			ReferenceRegistry.registerReference(KBTemplateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(KBTemplatePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(KBTemplateUtil.class, "_persistence");
	}

	private static KBTemplatePersistence _persistence;
}