/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcReserveOpenAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReserveOpenAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReserveOpenAccountField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcReserveOpenAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_TID_get(swigCPtr, this);
  }

  public void setReserveOpenAccStas(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_set(swigCPtr, this, value);
  }

  public char getReserveOpenAccStas() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReserveOpenAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcReserveOpenAccountField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcReserveOpenAccountField(), true);
  }

}
