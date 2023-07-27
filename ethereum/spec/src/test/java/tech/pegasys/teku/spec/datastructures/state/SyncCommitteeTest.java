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

package tech.pegasys.teku.spec.datastructures.state;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.tuweni.bytes.Bytes;
import org.junit.jupiter.api.Test;
import tech.pegasys.teku.spec.Spec;
import tech.pegasys.teku.spec.TestSpecFactory;
import tech.pegasys.teku.spec.datastructures.state.beaconstate.versions.altair.BeaconStateSchemaAltair;
import tech.pegasys.teku.spec.util.DataStructureUtil;

class SyncCommitteeTest {

  private final Spec spec = TestSpecFactory.createMinimalAltair();
  private final DataStructureUtil dataStructureUtil = new DataStructureUtil(spec);

  @Test
  void shouldRoundtripViaSsz() {
    final SyncCommittee original = dataStructureUtil.randomSyncCommittee();
    final Bytes serialized = original.sszSerialize();

    final SyncCommittee deserialized =
        ((BeaconStateSchemaAltair) spec.getGenesisSchemaDefinitions().getBeaconStateSchema())
            .getCurrentSyncCommitteeSchema()
            .sszDeserialize(serialized);
    assertThat(deserialized).isEqualTo(original);
  }
}
