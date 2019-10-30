package com.tk.cor.demo;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void remove(Filter filter) {
        filters.remove(filter);
    }

    @Override
    public boolean doFilter(Msg msg) {
        for(Filter filter: filters) {
            if (!filter.doFilter(msg))
            return false;
        }
        return true;
    }
}
