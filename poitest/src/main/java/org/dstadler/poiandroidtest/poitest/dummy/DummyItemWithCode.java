/*
 * Copyright (c) 2021 GetWrath.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.dstadler.poiandroidtest.poitest.dummy;

import java.util.concurrent.Callable;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class DummyItemWithCode extends DummyContent.DummyItem {
  private final Callable<String> callable;

  public DummyItemWithCode(String id, String content, Callable<String> callable) {
    super(id, content, null);
    this.callable = callable;
  }

  @Override
  public String getLongContent() {
    try {
      return callable.call();
    } catch (Exception e) {
      return ExceptionUtils.getStackTrace(e);
    }
  }
}
