package com.sun.net.httpserver;

public abstract class Authenticator {
    public abstract Result authenticate(HttpExchange exch);

    public abstract static class Result {}
    public static class Success extends Result {}
    public static class Retry extends Result {
        public Retry(int responseCode) {}
    }
    public static class Failure extends Result {
        public Failure(int responseCode) {}
    }
}
