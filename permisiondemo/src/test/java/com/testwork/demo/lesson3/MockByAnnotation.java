package com.testwork.demo.lesson3;

import com.testwork.demo.lesson3.comment.MockController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockByAnnotation {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private MockController mockController;

    @Test
    public void testTest(){
        System.out.println(mockController.test());
    }
}
