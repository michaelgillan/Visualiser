/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package GeneralType;

import org.abego.treelayout.NodeExtentProvider;

/**
 * Created by michael on 03/10/16.
 */
public class GeneralTypeNodeExtentProvider implements NodeExtentProvider<GeneralType> {

  @Override
  public double getWidth(GeneralType generalType) {
    return generalType.width;
  }

  @Override
  public double getHeight(GeneralType generalType) {
    return generalType.height;
  }
}