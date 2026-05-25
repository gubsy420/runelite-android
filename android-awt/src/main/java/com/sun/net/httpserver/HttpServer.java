package com.sun.net.httpserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

/**
 * Stub of {@code com.sun.net.httpserver.HttpServer}. Android has no JEP-7-style HTTP
 * server; methods throw at runtime, but the class is present so callers (e.g.
 * {@code SessionManager}) load.
 */
public abstract class HttpServer {
    protected HttpServer() {}

    public static HttpServer create() throws IOException {
        return create(null, 0);
    }

    public static HttpServer create(InetSocketAddress addr, int backlog) throws IOException {
        return new StubServer(addr);
    }

    public abstract void bind(InetSocketAddress addr, int backlog) throws IOException;
    public abstract InetSocketAddress getAddress();
    public abstract HttpContext createContext(String path, HttpHandler handler);
    public abstract HttpContext createContext(String path);
    public abstract void removeContext(String path);
    public abstract void removeContext(HttpContext context);
    public abstract void setExecutor(Executor executor);
    public abstract Executor getExecutor();
    public abstract void start();
    public abstract void stop(int delay);

    private static final class StubServer extends HttpServer {
        private InetSocketAddress address;
        private Executor executor;

        StubServer(InetSocketAddress addr) { this.address = addr; }

        @Override public void bind(InetSocketAddress addr, int backlog) { this.address = addr; }
        @Override public InetSocketAddress getAddress() {
            return address != null ? address : new InetSocketAddress("localhost", 0);
        }
        @Override public HttpContext createContext(String path, HttpHandler handler) { return new HttpContext() {}; }
        @Override public HttpContext createContext(String path) { return new HttpContext() {}; }
        @Override public void removeContext(String path) {}
        @Override public void removeContext(HttpContext context) {}
        @Override public void setExecutor(Executor executor) { this.executor = executor; }
        @Override public Executor getExecutor() { return executor; }
        @Override public void start() {}
        @Override public void stop(int delay) {}
    }
}
