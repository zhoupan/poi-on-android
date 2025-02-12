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
package org.apache.poi.poifs.crypt;

import static junit.framework.Assert.assertNotNull;

import org.apache.poi.poifs.crypt.dsig.SignatureInfo;

public class TestSignatureInfo {
  public void testConstruct() {
    // simple test which just verifies that we can load the class and all dependend classes
    SignatureInfo info = new SignatureInfo();
    assertNotNull(info);
  }
}
