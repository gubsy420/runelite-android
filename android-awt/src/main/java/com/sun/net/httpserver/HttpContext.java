package com.sun.net.httpserver;

import java.util.List;
import java.util.Map;

public abstract class HttpContext {
    protected HttpContext() {}

    public HttpHandler getHandler() { return null; }
    public void setHandler(HttpHandler h) {}
    public String getPath() { return "/"; }
    public HttpServer getServer() { return null; }
    public Map<String, Object> getAttributes() { return java.util.Collections.emptyMap(); }
    public List<Filter> getFilters() { return java.util.Collections.emptyList(); }
    public Authenticator setAuthenticator(Authenticator auth) { return null; }
    public Authenticator getAuthenticator() { return null; }
}
