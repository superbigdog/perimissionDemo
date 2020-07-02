package com.testwork.demo.lesson3;

import com.testwork.demo.lesson3.comment.MockController;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.*;

public class MockByRule {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private MockController mockController;

    @Test
    public void testTest(){
//        mockController = mock(MockController.class);
        System.out.println(mockController.test());
    }
}
