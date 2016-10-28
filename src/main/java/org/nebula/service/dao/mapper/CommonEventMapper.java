/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.nebula.service.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.nebula.service.dao.entity.Event;

import java.util.List;

public interface CommonEventMapper {

  public void insertEvent(Event event);

  public List<Event> findByInstanceIdByPage(RowBounds rowBounds,
                                            @Param("instanceId") String instanceId);

  public int countByInstanceId(@Param("instanceId") String instanceId);

  public String findRegistrationIdByInstanceId(@Param("instanceId") String instanceId);

  public int countInstancesByRegistrationId(@Param("registrationId") String registrationId);

  public List<Event> findInstancesByRegistrationIdByPage(RowBounds rowBounds,
                                                         @Param("registrationId") String registrationId);

  public Event findWorkflowCompletedEvent(@Param("instanceId") String instanceId);

  public Event findWorkflowScheduledEvent(@Param("instanceId") String instanceId);
}
