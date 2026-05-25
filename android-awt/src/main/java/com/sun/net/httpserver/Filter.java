package com.sun.net.httpserver;

import java.io.IOException;

public abstract class Filter {
    protected Filter() {}

    public abstract void doFilter(HttpExchange exchange, Chain chain) throws IOException;
    public abstract String description();

    public static class Chain {
        public void doFilter(HttpExchange exchange) throws IOException {}
    }
}
