/*
 * Copyright Consensys Software Inc., 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.teku.infrastructure.unsigned;

import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.longs.LongCollection;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UInt64Util {
  public static List<UInt64> intToUInt64List(final IntCollection sourceList) {
    return sourceList.intStream().mapToObj(UInt64::valueOf).collect(Collectors.toList());
  }

  public static List<UInt64> longToUInt64List(final LongCollection sourceList) {
    return sourceList.longStream().mapToObj(UInt64::valueOf).collect(Collectors.toList());
  }

  public static List<UInt64> stringToUInt64List(final Collection<String> sourceList) {
    return sourceList.stream().map(UInt64::valueOf).collect(Collectors.toList());
  }
}
