// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.orientsec.grpc.service.routeguide;

public interface FeatureDatabaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.orientsec.grpc.service.routeguide.FeatureDatabase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.orientsec.grpc.service.routeguide.Feature feature = 1;</code>
   */
  java.util.List<Feature>
      getFeatureList();
  /**
   * <code>repeated .com.orientsec.grpc.service.routeguide.Feature feature = 1;</code>
   */
  Feature getFeature(int index);
  /**
   * <code>repeated .com.orientsec.grpc.service.routeguide.Feature feature = 1;</code>
   */
  int getFeatureCount();
  /**
   * <code>repeated .com.orientsec.grpc.service.routeguide.Feature feature = 1;</code>
   */
  java.util.List<? extends FeatureOrBuilder>
      getFeatureOrBuilderList();
  /**
   * <code>repeated .com.orientsec.grpc.service.routeguide.Feature feature = 1;</code>
   */
  FeatureOrBuilder getFeatureOrBuilder(
          int index);
}
