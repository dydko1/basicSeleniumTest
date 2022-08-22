package pl.sii.javaBeginers.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLiberty implements Iterator<String> {
    private LinkedList<String> urls = new LinkedList<>();


    public UrlLiberty() {
        urls.addAll(Arrays.asList("url1", "url2", "url3"));
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
