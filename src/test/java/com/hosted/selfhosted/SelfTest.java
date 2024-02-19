package com.hosted.selfhosted;

import org.junit.jupiter.api.Test;


public class SelfTest {

    @Test
    void failure_Test(){
        //실패하는 테스트
        throw new RuntimeException();
    }
}
