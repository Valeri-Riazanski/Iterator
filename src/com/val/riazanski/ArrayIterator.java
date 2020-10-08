package com.val.riazanski;

import java.util.Iterator;

class ArrayIterator implements Iterator {
    //fields
    String[] str;
    int position = 0;
    //constructors
    public ArrayIterator(String[] s) {
        this.str = s;
    }
    //methods
    @Override
    public String next() {
        String string = str[position];
        position++;
        return string;
    }
    @Override
    public boolean hasNext() {
        if (position >= str.length || str[position] == null) {
            return false;
        } else {
            return true;
        }
    }


}
