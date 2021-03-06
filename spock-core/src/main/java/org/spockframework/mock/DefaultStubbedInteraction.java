/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spockframework.mock;

import org.spockframework.util.ReflectionUtil;

public class DefaultStubbedInteraction extends DefaultInteraction {
  public static final DefaultStubbedInteraction INSTANCE = new DefaultStubbedInteraction();

  private DefaultStubbedInteraction() {}

  public String getText() {
    return "default stubbed interaction";
  }

  public boolean matches(IMockInvocation invocation) {
    return true;
  }

  public Object accept(IMockInvocation invocation) {
    return ReflectionUtil.getDefaultValue(invocation.getMethod().getReturnType());
  }
}