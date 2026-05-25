package javax.sound.sampled;

import java.io.IOException;
import java.io.InputStream;

public class AudioInputStream extends InputStream {
    private final InputStream stream;
    private final AudioFormat format;
    private final long length;
    private long pos;

    public AudioInputStream(InputStream stream, AudioFormat format, long length) {
        this.stream = stream;
        this.format = format;
        this.length = length;
    }

    public AudioInputStream(TargetDataLine line) {
        this.stream = null;
        this.format = line.getFormat();
        this.length = AudioSystem.NOT_SPECIFIED;
    }

    public AudioFormat getFormat() { return format; }
    public long getFrameLength()   { return length; }

    @Override public int read() throws IOException { pos++; return stream == null ? -1 : stream.read(); }
    @Override public int read(byte[] b, int off, int len) throws IOException {
        int n = stream == null ? -1 : stream.read(b, off, len);
        if (n > 0) pos += n;
        return n;
    }
    @Override public long skip(long n) throws IOException { return stream == null ? 0 : stream.skip(n); }
    @Override public int available() throws IOException { return stream == null ? 0 : stream.available(); }
    @Override public void close() throws IOException { if (stream != null) stream.close(); }
}
