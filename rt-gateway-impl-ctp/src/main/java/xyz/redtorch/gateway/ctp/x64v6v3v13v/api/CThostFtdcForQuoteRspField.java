/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcForQuoteRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcForQuoteRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteRspField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcForQuoteRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setForQuoteTime(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ForQuoteTime_set(swigCPtr, this, value);
  }

  public String getForQuoteTime() {
    return jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ForQuoteTime_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ActionDay_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcForQuoteRspField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteRspField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcForQuoteRspField(), true);
  }

}
