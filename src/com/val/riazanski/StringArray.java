package com.val.riazanski;

public class StringArray {
    //fields
    private String[] str;
    //constructors
    public StringArray(String[] s) {
        this.str = s;
    }
    //methods
    public ArrayIterator createIterator() {
        return new ArrayIterator(this.str);
    }
}
