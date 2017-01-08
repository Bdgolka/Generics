package com.bdgolka;

/**
 * Created by bdgolka on 08.01.2017.
 */
public class CircularBuffer {

    private Object[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size) {
        buffer = new Object[size];
    }

    public Object pool() {

        final Object value = buffer[readCursor];
        if(value != null){
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    public boolean offer(Object value) {
        if(buffer[writeCursor] != null){
            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);

        return true;
    }

    private int next (int index){
        return (index + 1)%buffer.length;
    }

}
