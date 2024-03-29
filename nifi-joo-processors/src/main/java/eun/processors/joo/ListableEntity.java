/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eun.processors.joo;

public interface ListableEntity {

    /**
     * @return The name of the remote entity
     */
    String getName();

    /**
     * @return the identifier of the remote entity. This may or may not be the same as the name of the
     *         entity but should be unique across all entities.
     */
    String getIdentifier();


    /**
     * @return the timestamp for this entity in milliseconds so that we can be efficient about not performing listings of the same
     *         entities multiple times
     */
    long getTimestamp();

}
