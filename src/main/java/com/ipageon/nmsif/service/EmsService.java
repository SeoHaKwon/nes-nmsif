package com.ipageon.nmsif.service;


public interface EmsService {
    void alarmEvent(String payload) throws Exception;
    void statusEvent(String payload) throws Exception;
}
