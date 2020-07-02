package com.testwork.demo.lesson3;

import com.testwork.demo.lesson3.comment.MockController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockRunwith {

    private MockController mockController;

    @Before
    public void init(){
        mockController = mock(MockController.class);

        when(mockController.test()).thenReturn("index");
    }

    @Test
    public void testTest(){
        System.out.println(mockController.test());
        assertEquals("index", mockController.test());
    }
}
