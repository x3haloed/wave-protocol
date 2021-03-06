/**
 * Copyright 2010 Google Inc.
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
 *
 */

package org.waveprotocol.pst.style;

import java.io.File;

/**
 * Styles a source file.
 *
 * @author kalman@google.com (Benjamin Kalman)
 */
public interface Styler {

  /**
   * Styles a source file.
   *
   * @param f the file to style
   * @param saveBackup whether to save a backup
   */
  void style(File f, boolean saveBackup);

  /**
   * No-op implementation.
   */
  Styler EMPTY = new Styler() {
    @Override public void style(File f, boolean saveBackup) {}
  };
}
