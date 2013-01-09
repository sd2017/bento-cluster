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
 * A builder for a Hadoop XML resource file named "bento-hdfs-site.xml" intended to be included
 * in the "hdfs-site.xml" file used by bento-cluster. This resource contains property values
 * managed through bento-cluster's configuration utility.
 */
public class HdfsSiteConfBuilder extends ConfigurationBuilder {

  /** The configuration key used for the address of the NameNode UI. */
  public static final String NAME_NODE_UI_ADDRESS_CONF = "dfs.http.address";

  /** A resource containing a usage comment for the file. */
  private static final String HDFS_SITE_COMMENT_RESOURCE = "org/kiji/bento/hdfs-site-comment";

  /**
   * Constructs a builder.
   */
  public HdfsSiteConfBuilder() {
    super("hdfs-site", HDFS_SITE_COMMENT_RESOURCE);
  }

  /**
   * Uses the specified port for the namenode UI in the configuration.
   *
   * @param port The namenode UI port.
   * @return This builder, so configuration can be chained.
   */
  public HdfsSiteConfBuilder withNameNodeUIPort(int port) {
    return withLocalAddressAtPort(NAME_NODE_UI_ADDRESS_CONF, port);
  }
}

