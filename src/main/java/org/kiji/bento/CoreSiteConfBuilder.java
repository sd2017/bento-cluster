/**
 * (c) Copyright 2012 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
 */

package org.kiji.bento;

/**
 * A builder for a Hadoop XML resource file named "bento-core-site.xml" intended to be included
 * in the "core-site.xml" file used by bento-cluster. This resource contains property values
 * managed through bento-cluster's configuration utility.
 */
public class CoreSiteConfBuilder extends ConfigurationBuilder {
  /** The configuration key used for the NameNode address. */
  public static final String NAME_NODE_ADDRESS_CONF = "fs.defaultFS";

  /** A resource containing a usage comment for the file. */
  private static final String CORE_SITE_COMMENT_RESOURCE = "org/kiji/bento/core-site-comment";

  /**
   * Constructs a builder.
   */
  public CoreSiteConfBuilder() {
    super("core-site", CORE_SITE_COMMENT_RESOURCE);
  }

  /**
   * Uses the specified port for the namenode in the configuration.
   *
   * @param port The namenode port.
   * @return This builder, so configuration can be chained.
   */
  public CoreSiteConfBuilder withNameNodePort(int port) {
    return withValue(NAME_NODE_ADDRESS_CONF, "hdfs://localhost:" + port);
  }
}

