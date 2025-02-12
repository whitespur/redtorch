/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcErrOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcErrOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v13x64apiJNI.delete_CThostFtdcErrOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v3v13x64apiJNI.CThostFtdcErrOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcErrOrderActionField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcErrOrderActionField(), true);
  }

}
