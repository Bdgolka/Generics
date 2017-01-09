package com.bdgolka;

/**
 * Created by bdgolka on 08.01.2017.
 */
public class StringCircularBuffer {

    private String[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public StringCircularBuffer(int size) {
        buffer = new String[size];
    }

    public String pool() {

        final String value = buffer[readCursor];
        if(value != null){
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    public boolean offer(String value) {
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
