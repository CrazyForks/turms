/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.access.client.dto.model.conference;

public final class MeetingOuterClass {
    private MeetingOuterClass() {
    }

    static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
                com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
                /* major= */ 4,
                /* minor= */ 27,
                /* patch= */ 2,
                /* suffix= */ "",
                MeetingOuterClass.class.getName());
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor internal_static_im_turms_proto_Meeting_descriptor;
    static final com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_im_turms_proto_Meeting_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static final com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = {"\n\036model/conference/meeting.proto\022\016im.tur"
                + "ms.proto\032\030model/common/value.proto\"\215\003\n\007M"
                + "eeting\022\n\n\002id\030\001 \001(\003\022\024\n\007user_id\030\002 \001(\003H\000\210\001\001"
                + "\022\025\n\010group_id\030\003 \001(\003H\001\210\001\001\022\022\n\ncreator_id\030\004 "
                + "\001(\003\022\031\n\014access_token\030\005 \001(\tH\002\210\001\001\022\021\n\004name\030\006"
                + " \001(\tH\003\210\001\001\022\022\n\005intro\030\007 \001(\tH\004\210\001\001\022\025\n\010passwor"
                + "d\030\010 \001(\tH\005\210\001\001\022\022\n\nstart_date\030\t \001(\003\022\025\n\010end_"
                + "date\030\n \001(\003H\006\210\001\001\022\030\n\013cancel_date\030\013 \001(\003H\007\210\001"
                + "\001\0220\n\021custom_attributes\030\017 \003(\0132\025.im.turms."
                + "proto.ValueB\n\n\010_user_idB\013\n\t_group_idB\017\n\r"
                + "_access_tokenB\007\n\005_nameB\010\n\006_introB\013\n\t_pas"
                + "swordB\013\n\t_end_dateB\016\n\014_cancel_dateB@\n9im"
                + ".turms.server.common.access.client.dto.m"
                + "odel.conferenceP\001\272\002\000b\006proto3"};
        descriptor = com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[]{
                        im.turms.server.common.access.client.dto.model.common.ValueOuterClass
                                .getDescriptor(),});
        internal_static_im_turms_proto_Meeting_descriptor = getDescriptor().getMessageTypes()
                .getFirst();
        internal_static_im_turms_proto_Meeting_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                        internal_static_im_turms_proto_Meeting_descriptor,
                        new java.lang.String[]{"Id",
                                "UserId",
                                "GroupId",
                                "CreatorId",
                                "AccessToken",
                                "Name",
                                "Intro",
                                "Password",
                                "StartDate",
                                "EndDate",
                                "CancelDate",
                                "CustomAttributes",});
        descriptor.resolveAllFeaturesImmutable();
        im.turms.server.common.access.client.dto.model.common.ValueOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}