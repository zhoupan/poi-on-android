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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by Android template
 * wizards.
 *
 * <p>
 */
public class DummyContent {

  /** An array of sample (dummy) items. */
  public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

  /** A map of sample (dummy) items, by ID. */
  public static Map<String, DummyItem> ITEM_MAP = new HashMap<>();

  static {
    initialize();
  }

  public static void initialize() {
    DummyContent.ITEM_MAP.clear();
    DummyContent.ITEMS.clear();

    // Add 3 sample items.
    addItem(new DummyItem("l1", "Item 1", "Long Item 1"));
    addItem(new DummyItem("l2", "Item 2", "Long Item 2"));
    addItem(new DummyItem("l3", "Item 3", "Long Item 3"));
  }

  public static void addItem(DummyItem item) {
    ITEMS.add(item);
    ITEM_MAP.put(item.id, item);
  }

  /** A dummy item representing a piece of content. */
  public static class DummyItem {
    private String id;
    private String content;
    private String longContent;

    public DummyItem(String id, String content, String longContent) {
      this.id = id;
      this.content = content;
      this.longContent = longContent;
    }

    public void setContent(String content) {
      this.content = content;
    }

    public void appendContent(String content) {
      this.content += " - " + content;
    }

    public String getId() {
      return id;
    }

    public String getLongContent() {
      return longContent;
    }

    @Override
    public String toString() {
      return content;
    }
  }
}
