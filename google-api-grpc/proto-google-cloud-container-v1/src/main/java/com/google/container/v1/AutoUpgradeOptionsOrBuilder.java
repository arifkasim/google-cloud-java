// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface AutoUpgradeOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AutoUpgradeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the approximate start time for the upgrades, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string auto_upgrade_start_time = 1;</code>
   */
  java.lang.String getAutoUpgradeStartTime();
  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the approximate start time for the upgrades, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string auto_upgrade_start_time = 1;</code>
   */
  com.google.protobuf.ByteString
      getAutoUpgradeStartTimeBytes();

  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the description of the upgrade.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the description of the upgrade.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
