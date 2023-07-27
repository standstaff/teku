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

package tech.pegasys.teku.test.acceptance.dsl;

public enum TekuDockerVersion {
  LOCAL_BUILD("develop"),
  LAST_RELEASE("latest"),
  V23_6_1("23.6.1");

  private final String version;

  TekuDockerVersion(final String version) {
    this.version = version;
  }

  public String getVersion() {
    return version;
  }
}
