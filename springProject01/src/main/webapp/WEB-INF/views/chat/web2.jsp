<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
 *  Copyright (c) 2018 The WebRTC project authors. All Rights Reserved.
 *
 *  Use of this source code is governed by a BSD-style license
 *  that can be found in the LICENSE file in the root of the source
 *  tree.
-->
<html>
<head>

  <meta charset="utf-8">
  <meta name="description" content="WebRTC code samples">
  <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1, maximum-scale=1">
  <meta itemprop="description" content="Client-side WebRTC code samples">
  <meta itemprop="image" content="../../../images/webrtc-icon-192x192.png">
  <meta itemprop="name" content="WebRTC code samples">
  <meta name="mobile-web-app-capable" content="yes">
  <meta id="theme-color" name="theme-color" content="#ffffff">

  <base target="_blank">

  <title>getDisplayMedia</title>

  <link rel="icon" sizes="192x192" href="../../../images/webrtc-icon-192x192.png">
  <link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/web2.css">

</head>

<body>

  <div id="container">
    <h1><a href="//webrtc.github.io/samples/" title="WebRTC samples homepage">WebRTC samples</a> <span>getDisplayMedia</span></h1>

    <video id="gum-local" autoplay playsinline muted></video>
    <button id="startButton">Start</button>

    <div id="errorMsg"></div>

    <p>Display the screensharing stream from <code>getDisplayMedia()</code> in a video element.</p>

    <a href="https://github.com/webrtc/samples/tree/gh-pages/src/content/getusermedia/getdisplaymedia" title="View source for this page on GitHub" id="viewSource">View source on GitHub</a>
  </div>

  <script src="https://webrtc.github.io/adapter/adapter-latest.js"></script>
  <script src="js/web2.js"></script>

  <script src="${pageContext.request.contextPath}/js/ga.js"></script>

</body>
</html>