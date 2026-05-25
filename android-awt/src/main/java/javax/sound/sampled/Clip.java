package javax.sound.sampled;

import java.io.IOException;

public interface Clip extends DataLine {
    int LOOP_CONTINUOUSLY = -1;

    void open(AudioFormat format, byte[] data, int offset, int bufferSize) throws LineUnavailableException;
    void open(AudioInputStream stream) throws LineUnavailableException, IOException;

    int getFrameLength();
    long getMicrosecondLength();

    void setMicrosecondPosition(long microseconds);
    void setFramePosition(int frames);

    void setLoopPoints(int start, int end);
    void loop(int count);
}
