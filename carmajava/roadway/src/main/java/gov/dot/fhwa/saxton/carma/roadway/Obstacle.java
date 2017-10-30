/*
 * Copyright (C) 2017 LEIDOS.
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

package gov.dot.fhwa.saxton.carma.roadway;

import gov.dot.fhwa.saxton.carma.geometry.cartesian.Vector3D;
import org.ros.rosjava_geometry.Transform;

/**
 * TODO implement
 * An implementation of IObstacle with no special attributes.
 */
public class Obstacle implements IObstacle {
  @Override public Vector3D getAcceleration() {
    return null;
  }

  @Override public Vector3D getVelocity() {
    return null;
  }

  @Override public String getReferenceFrameId() {
    return null;
  }

  @Override public Transform getPose() {
    return null;
  }

  @Override public boolean collision(IObstacle obj) {
    return false;
  }

  @Override public boolean collision(IObstacle obj, long timeSpan) {
    return false;
  }
}
