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

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.dstadler.poiandroidtest.poitest.dummy.DummyContent;

/**
 * A fragment representing a single Document detail screen. This fragment is either contained in a
 * {@link DocumentListActivity} in two-pane mode (on tablets) or a {@link DocumentDetailActivity} on
 * handsets.
 */
public class DocumentDetailFragment extends Fragment {
  /** The fragment argument representing the item ID that this fragment represents. */
  public static final String ARG_ITEM_ID = "item_id";

  /** The dummy content this fragment is presenting. */
  private DummyContent.DummyItem mItem;

  /**
   * Mandatory empty constructor for the fragment manager to instantiate the fragment (e.g. upon
   * screen orientation changes).
   */
  public DocumentDetailFragment() {}

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (getArguments().containsKey(ARG_ITEM_ID)) {
      // Load the dummy content specified by the fragment
      // arguments. In a real-world scenario, use a Loader
      // to load content from a content provider.
      mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
    }
  }

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_document_detail, container, false);

    // Show the dummy content as text in a TextView.
    if (mItem != null) {
      ((TextView) rootView.findViewById(R.id.document_detail)).setText(mItem.getLongContent());
    }

    return rootView;
  }
}
