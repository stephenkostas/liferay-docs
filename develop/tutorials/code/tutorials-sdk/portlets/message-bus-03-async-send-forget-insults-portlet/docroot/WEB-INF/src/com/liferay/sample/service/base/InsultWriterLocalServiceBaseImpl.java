/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.sample.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.sample.model.InsultWriter;
import com.liferay.sample.service.InsultWriterLocalService;
import com.liferay.sample.service.persistence.InsultLogPersistence;
import com.liferay.sample.service.persistence.InsultWriterPersistence;
import com.liferay.sample.service.persistence.InsultedPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the insult writer local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.sample.service.impl.InsultWriterLocalServiceImpl}.
 * </p>
 *
 * @author nickgaskill
 * @see com.liferay.sample.service.impl.InsultWriterLocalServiceImpl
 * @see com.liferay.sample.service.InsultWriterLocalServiceUtil
 * @generated
 */
public abstract class InsultWriterLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements InsultWriterLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.sample.service.InsultWriterLocalServiceUtil} to access the insult writer local service.
	 */

	/**
	 * Adds the insult writer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param insultWriter the insult writer
	 * @return the insult writer that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsultWriter addInsultWriter(InsultWriter insultWriter)
		throws SystemException {
		insultWriter.setNew(true);

		return insultWriterPersistence.update(insultWriter);
	}

	/**
	 * Creates a new insult writer with the primary key. Does not add the insult writer to the database.
	 *
	 * @param insultWriterId the primary key for the new insult writer
	 * @return the new insult writer
	 */
	@Override
	public InsultWriter createInsultWriter(long insultWriterId) {
		return insultWriterPersistence.create(insultWriterId);
	}

	/**
	 * Deletes the insult writer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param insultWriterId the primary key of the insult writer
	 * @return the insult writer that was removed
	 * @throws PortalException if a insult writer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public InsultWriter deleteInsultWriter(long insultWriterId)
		throws PortalException, SystemException {
		return insultWriterPersistence.remove(insultWriterId);
	}

	/**
	 * Deletes the insult writer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param insultWriter the insult writer
	 * @return the insult writer that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public InsultWriter deleteInsultWriter(InsultWriter insultWriter)
		throws SystemException {
		return insultWriterPersistence.remove(insultWriter);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(InsultWriter.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return insultWriterPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.InsultWriterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return insultWriterPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.InsultWriterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return insultWriterPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return insultWriterPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return insultWriterPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public InsultWriter fetchInsultWriter(long insultWriterId)
		throws SystemException {
		return insultWriterPersistence.fetchByPrimaryKey(insultWriterId);
	}

	/**
	 * Returns the insult writer with the primary key.
	 *
	 * @param insultWriterId the primary key of the insult writer
	 * @return the insult writer
	 * @throws PortalException if a insult writer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InsultWriter getInsultWriter(long insultWriterId)
		throws PortalException, SystemException {
		return insultWriterPersistence.findByPrimaryKey(insultWriterId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return insultWriterPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the insult writers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.InsultWriterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of insult writers
	 * @param end the upper bound of the range of insult writers (not inclusive)
	 * @return the range of insult writers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InsultWriter> getInsultWriters(int start, int end)
		throws SystemException {
		return insultWriterPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of insult writers.
	 *
	 * @return the number of insult writers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getInsultWritersCount() throws SystemException {
		return insultWriterPersistence.countAll();
	}

	/**
	 * Updates the insult writer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param insultWriter the insult writer
	 * @return the insult writer that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsultWriter updateInsultWriter(InsultWriter insultWriter)
		throws SystemException {
		return insultWriterPersistence.update(insultWriter);
	}

	/**
	 * Returns the insulted local service.
	 *
	 * @return the insulted local service
	 */
	public com.liferay.sample.service.InsultedLocalService getInsultedLocalService() {
		return insultedLocalService;
	}

	/**
	 * Sets the insulted local service.
	 *
	 * @param insultedLocalService the insulted local service
	 */
	public void setInsultedLocalService(
		com.liferay.sample.service.InsultedLocalService insultedLocalService) {
		this.insultedLocalService = insultedLocalService;
	}

	/**
	 * Returns the insulted persistence.
	 *
	 * @return the insulted persistence
	 */
	public InsultedPersistence getInsultedPersistence() {
		return insultedPersistence;
	}

	/**
	 * Sets the insulted persistence.
	 *
	 * @param insultedPersistence the insulted persistence
	 */
	public void setInsultedPersistence(InsultedPersistence insultedPersistence) {
		this.insultedPersistence = insultedPersistence;
	}

	/**
	 * Returns the insult log local service.
	 *
	 * @return the insult log local service
	 */
	public com.liferay.sample.service.InsultLogLocalService getInsultLogLocalService() {
		return insultLogLocalService;
	}

	/**
	 * Sets the insult log local service.
	 *
	 * @param insultLogLocalService the insult log local service
	 */
	public void setInsultLogLocalService(
		com.liferay.sample.service.InsultLogLocalService insultLogLocalService) {
		this.insultLogLocalService = insultLogLocalService;
	}

	/**
	 * Returns the insult log persistence.
	 *
	 * @return the insult log persistence
	 */
	public InsultLogPersistence getInsultLogPersistence() {
		return insultLogPersistence;
	}

	/**
	 * Sets the insult log persistence.
	 *
	 * @param insultLogPersistence the insult log persistence
	 */
	public void setInsultLogPersistence(
		InsultLogPersistence insultLogPersistence) {
		this.insultLogPersistence = insultLogPersistence;
	}

	/**
	 * Returns the insult writer local service.
	 *
	 * @return the insult writer local service
	 */
	public com.liferay.sample.service.InsultWriterLocalService getInsultWriterLocalService() {
		return insultWriterLocalService;
	}

	/**
	 * Sets the insult writer local service.
	 *
	 * @param insultWriterLocalService the insult writer local service
	 */
	public void setInsultWriterLocalService(
		com.liferay.sample.service.InsultWriterLocalService insultWriterLocalService) {
		this.insultWriterLocalService = insultWriterLocalService;
	}

	/**
	 * Returns the insult writer persistence.
	 *
	 * @return the insult writer persistence
	 */
	public InsultWriterPersistence getInsultWriterPersistence() {
		return insultWriterPersistence;
	}

	/**
	 * Sets the insult writer persistence.
	 *
	 * @param insultWriterPersistence the insult writer persistence
	 */
	public void setInsultWriterPersistence(
		InsultWriterPersistence insultWriterPersistence) {
		this.insultWriterPersistence = insultWriterPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
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
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.sample.model.InsultWriter",
			insultWriterLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.sample.model.InsultWriter");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return InsultWriter.class;
	}

	protected String getModelClassName() {
		return InsultWriter.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = insultWriterPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.sample.service.InsultedLocalService.class)
	protected com.liferay.sample.service.InsultedLocalService insultedLocalService;
	@BeanReference(type = InsultedPersistence.class)
	protected InsultedPersistence insultedPersistence;
	@BeanReference(type = com.liferay.sample.service.InsultLogLocalService.class)
	protected com.liferay.sample.service.InsultLogLocalService insultLogLocalService;
	@BeanReference(type = InsultLogPersistence.class)
	protected InsultLogPersistence insultLogPersistence;
	@BeanReference(type = com.liferay.sample.service.InsultWriterLocalService.class)
	protected com.liferay.sample.service.InsultWriterLocalService insultWriterLocalService;
	@BeanReference(type = InsultWriterPersistence.class)
	protected InsultWriterPersistence insultWriterPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private InsultWriterLocalServiceClpInvoker _clpInvoker = new InsultWriterLocalServiceClpInvoker();
}