/*
 * Copyright (C) 2015 Google Inc.
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
 */

package org.apache.beam.examples.complete.game.utils;

import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PInput;

/**
 * PTransform that crashes at runtime used as a placeholder in tutorials.
 */
public class ChangeMe<InputT extends PInput, OutputT>
    extends PTransform<InputT, PCollection<OutputT>> {

  @Override
  public PCollection<OutputT> expand(InputT input) {
    throw new RuntimeException("Not implemented");
  }
}
