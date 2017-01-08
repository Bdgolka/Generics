package com.bdgolka.test;

import com.bdgolka.CircularBuffer;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.*;

public class CircularBufferTest {

    private CircularBuffer buffer = new CircularBuffer(2);

    @Test
    public void shouldOfferPollableElement(){

        assertTrue(buffer.offer(1));

        assertEquals(1, buffer.pool());
        assertNull(buffer.pool());
    }

    @Test
    public void shouldNotOfferWhenBufferIsFull(){

        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertFalse(buffer.offer(3));
    }

    @Test
    public void shouldNotOfferWhenBufferIsEmpty(){
         assertNull(buffer.pool());
    }

    @Test
    public void shouldRecycleBuffer(){

        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertEquals(1, buffer.pool());
        assertTrue(buffer.offer(3));
        assertEquals(2, buffer.pool());
        assertEquals(3, buffer.pool());
    }
}