// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

public final class RouteGuideProto {
  private RouteGuideProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_routeguide_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_routeguide_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_routeguide_RouteNote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_routeguide_RouteNote_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021route_guide.proto\022\nrouteguide\",\n\005Point" +
      "\022\020\n\010latitude\030\001 \001(\005\022\021\n\tlongitude\030\002 \001(\005\"A\n" +
      "\tRouteNote\022#\n\010location\030\001 \001(\0132\021.routeguid" +
      "e.Point\022\017\n\007message\030\002 \001(\t2M\n\nRouteGuide\022?" +
      "\n\tRouteChat\022\025.routeguide.RouteNote\032\025.rou" +
      "teguide.RouteNote\"\000(\0010\001B6\n\033io.grpc.examp" +
      "les.routeguideB\017RouteGuideProtoP\001\242\002\003RTGb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_routeguide_Point_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_routeguide_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_routeguide_Point_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_routeguide_RouteNote_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_routeguide_RouteNote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_routeguide_RouteNote_descriptor,
        new java.lang.String[] { "Location", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
