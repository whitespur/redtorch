/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcCommRateModelField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCommRateModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCommRateModelField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcCommRateModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcCommRateModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcCommRateModelField_BrokerID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcCommRateModelField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcCommRateModelField_CommModelID_get(swigCPtr, this);
  }

  public void setCommModelName(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcCommRateModelField_CommModelName_set(swigCPtr, this, value);
  }

  public String getCommModelName() {
    return jctpv6v3v13x64apiJNI.CThostFtdcCommRateModelField_CommModelName_get(swigCPtr, this);
  }

  public CThostFtdcCommRateModelField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcCommRateModelField(), true);
  }

}
