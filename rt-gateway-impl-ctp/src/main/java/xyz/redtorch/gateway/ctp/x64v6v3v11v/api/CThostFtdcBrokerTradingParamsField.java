/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcBrokerTradingParamsField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerTradingParamsField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerTradingParamsField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcBrokerTradingParamsField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_InvestorID_get(swigCPtr, this);
  }

  public void setMarginPriceType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_set(swigCPtr, this, value);
  }

  public char getMarginPriceType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_get(swigCPtr, this);
  }

  public void setAlgorithm(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_Algorithm_set(swigCPtr, this, value);
  }

  public char getAlgorithm() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_Algorithm_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_get(swigCPtr, this);
  }

  public void setOptionRoyaltyPriceType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_set(swigCPtr, this, value);
  }

  public char getOptionRoyaltyPriceType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerTradingParamsField_AccountID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerTradingParamsField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcBrokerTradingParamsField(), true);
  }

}
