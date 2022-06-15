package com.sapient.asde.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Junit5DemoTest {
    private String[] words={"cali","mali","dani","valli"};

    @ParameterizedTest
    @ValueSource(strings={"cali","mali","dani","valli"})
    void endsWithi(String string){
        assertTrue(string.endsWith("i"));
    }



//    @ParameterizedTest
//    @ArraySources(
//            arrays = {
//                    @ArraySource(array = {"cali","mali","dani","valli"})
//            }
//    )
//    void arrayTest(String[] array){
//        for(String s: array){
//            assertTrue(s.endsWith("i"));
//        }
//    }

    @RepeatedTest(value = 5)
    @DisplayName("Repeating test")
    void customDisplayName(RepetitionInfo repInfo, TestInfo info){
        int i=6;
        assertNotEquals(repInfo.getCurrentRepetition(),i);

    }

}
