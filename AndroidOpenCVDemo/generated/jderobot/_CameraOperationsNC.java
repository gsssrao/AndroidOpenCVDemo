// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `camera.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Camera interface
 **/
public interface _CameraOperationsNC extends _ImageProviderOperationsNC
{
    CameraDescription getCameraDescription();

    int setCameraDescription(CameraDescription description);

    String startCameraStreaming();

    void stopCameraStreaming();

    void reset();
}