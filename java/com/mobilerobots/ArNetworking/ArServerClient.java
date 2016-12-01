/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2014 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerClient {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerClient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerClient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerClient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging, String serverClientName, boolean logPasswordFailureVerbosely, boolean allowSlowPackets, boolean allowIdlePackets, String enforceProtocolVersion, ArServerCommands.Type enforceType) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_0(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging, serverClientName, logPasswordFailureVerbosely, allowSlowPackets, allowIdlePackets, enforceProtocolVersion, enforceType.swigValue()), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging, String serverClientName, boolean logPasswordFailureVerbosely, boolean allowSlowPackets, boolean allowIdlePackets, String enforceProtocolVersion) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_1(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging, serverClientName, logPasswordFailureVerbosely, allowSlowPackets, allowIdlePackets, enforceProtocolVersion), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging, String serverClientName, boolean logPasswordFailureVerbosely, boolean allowSlowPackets, boolean allowIdlePackets) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_2(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging, serverClientName, logPasswordFailureVerbosely, allowSlowPackets, allowIdlePackets), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging, String serverClientName, boolean logPasswordFailureVerbosely, boolean allowSlowPackets) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_3(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging, serverClientName, logPasswordFailureVerbosely, allowSlowPackets), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging, String serverClientName, boolean logPasswordFailureVerbosely) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_4(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging, serverClientName, logPasswordFailureVerbosely), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging, String serverClientName) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_5(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging, serverClientName), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString, boolean debugLogging) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_6(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString, debugLogging), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting, String rejectingString) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_7(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting, rejectingString), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo, int rejecting) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_8(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo, rejecting), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey, ArServerUserInfo userInfo) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_9(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey, ArServerUserInfo.getCPtr(userInfo), userInfo), true);
  }

  public ArServerClient(ArSocket tcpSocket, long udpPort, int authKey, int introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t sendUdpCallback, SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t dataMap, String passwordKey, String serverKey) {
    this(ArNetworkingJavaJNI.new_ArServerClient__SWIG_10(ArSocket.getCPtr(tcpSocket), tcpSocket, udpPort, authKey, introKey, SWIGTYPE_p_ArRetFunctor2T_bool_ArNetPacket_p_sockaddr_in_p_t.getCPtr(sendUdpCallback), SWIGTYPE_p_std__mapT_unsigned_int_ArServerData_p_t.getCPtr(dataMap), passwordKey, serverKey), true);
  }

  public boolean tcpCallback() {
    return ArNetworkingJavaJNI.ArServerClient_tcpCallback(swigCPtr, this);
  }

  public boolean slowPacketCallback() {
    return ArNetworkingJavaJNI.ArServerClient_slowPacketCallback(swigCPtr, this);
  }

  public boolean idlePacketCallback() {
    return ArNetworkingJavaJNI.ArServerClient_idlePacketCallback(swigCPtr, this);
  }

  public void setBackupTimeout(double timeoutInMins) {
    ArNetworkingJavaJNI.ArServerClient_setBackupTimeout(swigCPtr, this, timeoutInMins);
  }

  public void processPacket(ArNetPacket packet, boolean tcp) {
    ArNetworkingJavaJNI.ArServerClient_processPacket__SWIG_0(swigCPtr, this, ArNetPacket.getCPtr(packet), packet, tcp);
  }

  public void processPacket(ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerClient_processPacket__SWIG_1(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public boolean sendPacketTcp(ArNetPacket packet) {
    return ArNetworkingJavaJNI.ArServerClient_sendPacketTcp(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public boolean sendPacketUdp(ArNetPacket packet) {
    return ArNetworkingJavaJNI.ArServerClient_sendPacketUdp(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public boolean hasGroupAccess(String group) {
    return ArNetworkingJavaJNI.ArServerClient_hasGroupAccess(swigCPtr, this, group);
  }

  public void broadcastPacketTcp(ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerClient_broadcastPacketTcp(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public void broadcastPacketUdp(ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerClient_broadcastPacketUdp(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public void logTracking(boolean terse) {
    ArNetworkingJavaJNI.ArServerClient_logTracking(swigCPtr, this, terse);
  }

  public void resetTracking() {
    ArNetworkingJavaJNI.ArServerClient_resetTracking(swigCPtr, this);
  }

  public String getIPString() {
    return ArNetworkingJavaJNI.ArServerClient_getIPString(swigCPtr, this);
  }

  public ArServerClientIdentifier getIdentifier() {
    return new ArServerClientIdentifier(ArNetworkingJavaJNI.ArServerClient_getIdentifier(swigCPtr, this), true);
  }

  public void setIdentifier(ArServerClientIdentifier identifier) {
    ArNetworkingJavaJNI.ArServerClient_setIdentifier(swigCPtr, this, ArServerClientIdentifier.getCPtr(identifier), identifier);
  }

  public void shutdown() {
    ArNetworkingJavaJNI.ArServerClient_shutdown(swigCPtr, this);
  }

  public void setUdpAddress(SWIGTYPE_p_sockaddr_in sin) {
    ArNetworkingJavaJNI.ArServerClient_setUdpAddress(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(sin));
  }

  public SWIGTYPE_p_sockaddr_in getUdpAddress() {
    long cPtr = ArNetworkingJavaJNI.ArServerClient_getUdpAddress(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_sockaddr_in(cPtr, false);
  }

  public int getAuthKey() {
    return ArNetworkingJavaJNI.ArServerClient_getAuthKey(swigCPtr, this);
  }

  public void processAuthPacket(ArNetPacket packet, SWIGTYPE_p_sockaddr_in sin) {
    ArNetworkingJavaJNI.ArServerClient_processAuthPacket(swigCPtr, this, ArNetPacket.getCPtr(packet), packet, SWIGTYPE_p_sockaddr_in.getCPtr(sin));
  }

  public void handleRequests() {
    ArNetworkingJavaJNI.ArServerClient_handleRequests(swigCPtr, this);
  }

  public ArSocket getTcpSocket() {
    long cPtr = ArNetworkingJavaJNI.ArServerClient_getTcpSocket(swigCPtr, this);
    return (cPtr == 0) ? null : new ArSocket(cPtr, false);
  }

  public void forceDisconnect(boolean quiet) {
    ArNetworkingJavaJNI.ArServerClient_forceDisconnect(swigCPtr, this, quiet);
  }

  public int getFrequency(int command) {
    return ArNetworkingJavaJNI.ArServerClient_getFrequency(swigCPtr, this, command);
  }

  public void useTcpOnly() {
    ArNetworkingJavaJNI.ArServerClient_useTcpOnly(swigCPtr, this);
  }

  public boolean isTcpOnly() {
    return ArNetworkingJavaJNI.ArServerClient_isTcpOnly(swigCPtr, this);
  }

  public ArServerClient.ServerState getState() {
    return ArServerClient.ServerState.swigToEnum(ArNetworkingJavaJNI.ArServerClient_getState(swigCPtr, this));
  }

  public boolean hasSlowPackets() {
    return ArNetworkingJavaJNI.ArServerClient_hasSlowPackets(swigCPtr, this);
  }

  public boolean hasIdlePackets() {
    return ArNetworkingJavaJNI.ArServerClient_hasIdlePackets(swigCPtr, this);
  }

  public void startRequestTransaction() {
    ArNetworkingJavaJNI.ArServerClient_startRequestTransaction(swigCPtr, this);
  }

  public boolean endRequestTransaction() {
    return ArNetworkingJavaJNI.ArServerClient_endRequestTransaction(swigCPtr, this);
  }

  public int getRequestTransactionCount() {
    return ArNetworkingJavaJNI.ArServerClient_getRequestTransactionCount(swigCPtr, this);
  }

  public long findCommandFromName(String commandName) {
    return ArNetworkingJavaJNI.ArServerClient_findCommandFromName(swigCPtr, this, commandName);
  }

  public ArTime getCreationTime() {
    return new ArTime(ArNetworkingJavaJNI.ArServerClient_getCreationTime(swigCPtr, this), true);
  }

  public final static class ServerState {
    public final static ServerState STATE_SENT_INTRO = new ServerState("STATE_SENT_INTRO");
    public final static ServerState STATE_REJECTED = new ServerState("STATE_REJECTED");
    public final static ServerState STATE_CONNECTED = new ServerState("STATE_CONNECTED");
    public final static ServerState STATE_DISCONNECTED = new ServerState("STATE_DISCONNECTED");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ServerState swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ServerState.class + " with value " + swigValue);
    }

    private ServerState(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ServerState(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ServerState(String swigName, ServerState swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ServerState[] swigValues = { STATE_SENT_INTRO, STATE_REJECTED, STATE_CONNECTED, STATE_DISCONNECTED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}