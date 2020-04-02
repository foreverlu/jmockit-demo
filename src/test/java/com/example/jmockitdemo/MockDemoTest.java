package com.example.jmockitdemo;

import com.example.jmockitdemo.mock.APP;
import com.example.jmockitdemo.mock.Dependency;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;

public class MockDemoTest {

    @Mocked
    Dependency dependency;

   @Test
    public void test1(){
        new Expectations(){
            {
                dependency.getNum();
                result = 5;
            }
        };

        new APP().printNum();

        new Verifications(){{
//           dependency.getNum();
           times=1;
        }};

    }

}
