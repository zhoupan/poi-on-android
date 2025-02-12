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
package org.dstadler.poiandroidtest.poitest;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.dstadler.poiandroidtest.poitest.dummy.DummyContent;
import org.junit.Test;
import org.junit.runner.RunWith;

/** <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a> */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
  @Test
  public void test() {
    // just some very simple things to verify that testing works basically
    DummyContent.addItem(new DummyContent.DummyItem("1", "bla", "some text"));
  }
}
