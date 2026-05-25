package java.applet;

import java.awt.Panel;

public class Applet extends Panel {
    private static final long serialVersionUID = -5836846270535785031L;

    public AppletStub stub;

    public Applet() {}
    public void setStub(AppletStub stub) { this.stub = stub; }
    public AppletStub getStub() { return stub; }

    // The patched OSRS client reads its server endpoint and login parameters
    // (worldid, jav_config keys, etc.) through these methods. RuneLite wires its
    // RSAppletStub via setStub before init(), so we must delegate everything to it
    // — returning null forces the client onto stale defaults and the live server
    // returns "RuneScape has been updated" at login.
    public boolean isActive()         { return stub != null && stub.isActive(); }
    public java.net.URL getDocumentBase() { return stub == null ? null : stub.getDocumentBase(); }
    public java.net.URL getCodeBase()     { return stub == null ? null : stub.getCodeBase(); }
    public String getParameter(String name) { return stub == null ? null : stub.getParameter(name); }
    public AppletContext getAppletContext() { return stub == null ? null : stub.getAppletContext(); }

    public void resize(int width, int height) { setSize(width, height); }
    public void resize(java.awt.Dimension d) { setSize(d); }
    public String getAppletInfo() { return null; }
    public String[][] getParameterInfo() { return new String[0][]; }
    public void init() {}
    public void start() {}
    public void stop() {}
    public void destroy() {}
}
