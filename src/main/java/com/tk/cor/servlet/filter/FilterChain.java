package com.tk.cor.servlet.filter;

import com.tk.cor.servlet.object.Msg;
import com.tk.cor.servlet.object.Request;
import com.tk.cor.servlet.object.Response;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void remove(Filter filter) {
        filters.remove(filter);
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
        return;
    }
}
