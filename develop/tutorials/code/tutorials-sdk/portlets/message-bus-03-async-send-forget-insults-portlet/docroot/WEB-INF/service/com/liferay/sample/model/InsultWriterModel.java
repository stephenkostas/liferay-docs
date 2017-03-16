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

package com.liferay.sample.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the InsultWriter service. Represents a row in the &quot;SAMPLE_InsultWriter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.sample.model.impl.InsultWriterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.sample.model.impl.InsultWriterImpl}.
 * </p>
 *
 * @author nickgaskill
 * @see InsultWriter
 * @see com.liferay.sample.model.impl.InsultWriterImpl
 * @see com.liferay.sample.model.impl.InsultWriterModelImpl
 * @generated
 */
public interface InsultWriterModel extends BaseModel<InsultWriter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a insult writer model instance should use the {@link InsultWriter} interface instead.
	 */

	/**
	 * Returns the primary key of this insult writer.
	 *
	 * @return the primary key of this insult writer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this insult writer.
	 *
	 * @param primaryKey the primary key of this insult writer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the insult writer ID of this insult writer.
	 *
	 * @return the insult writer ID of this insult writer
	 */
	public long getInsultWriterId();

	/**
	 * Sets the insult writer ID of this insult writer.
	 *
	 * @param insultWriterId the insult writer ID of this insult writer
	 */
	public void setInsultWriterId(long insultWriterId);

	/**
	 * Returns the insult of this insult writer.
	 *
	 * @return the insult of this insult writer
	 */
	@AutoEscape
	public String getInsult();

	/**
	 * Sets the insult of this insult writer.
	 *
	 * @param insult the insult of this insult writer
	 */
	public void setInsult(String insult);

	/**
	 * Returns the rating of this insult writer.
	 *
	 * @return the rating of this insult writer
	 */
	@AutoEscape
	public String getRating();

	/**
	 * Sets the rating of this insult writer.
	 *
	 * @param rating the rating of this insult writer
	 */
	public void setRating(String rating);

	/**
	 * Returns the group ID of this insult writer.
	 *
	 * @return the group ID of this insult writer
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this insult writer.
	 *
	 * @param groupId the group ID of this insult writer
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this insult writer.
	 *
	 * @return the company ID of this insult writer
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this insult writer.
	 *
	 * @param companyId the company ID of this insult writer
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this insult writer.
	 *
	 * @return the user ID of this insult writer
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this insult writer.
	 *
	 * @param userId the user ID of this insult writer
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this insult writer.
	 *
	 * @return the user uuid of this insult writer
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this insult writer.
	 *
	 * @param userUuid the user uuid of this insult writer
	 */
	public void setUserUuid(String userUuid);

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
	public int compareTo(InsultWriter insultWriter);

	@Override
	public int hashCode();

	@Override
	public CacheModel<InsultWriter> toCacheModel();

	@Override
	public InsultWriter toEscapedModel();

	@Override
	public InsultWriter toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}