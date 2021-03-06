/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package org.waveprotocol.wave.client.wavepanel.impl.collapse;

import org.waveprotocol.wave.client.wavepanel.view.InlineThreadView;

/**
 * Can collapse and expand thread views.
 *
 */
public final class CollapsePresenter {

  //
  // This class is beguilingly trivial, because the following items have not yet
  // been addressed.
  // TODO(user): Collaborate with focus frame, so that focus never gets
  // collapsed, and so that focus-frame movement skip collapsed threads.
  //

  public void collapse(InlineThreadView view) {
    view.setCollapsed(true);
  }

  public void expand(InlineThreadView view) {
    view.setCollapsed(false);
  }

  public void toggle(InlineThreadView view) {
    view.setCollapsed(!view.isCollapsed());
  }
}
