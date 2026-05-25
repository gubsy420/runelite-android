package javax.sound.sampled;

public interface TargetDataLine extends DataLine {
    @Override void open() throws LineUnavailableException;
    void open(AudioFormat format) throws LineUnavailableException;
    void open(AudioFormat format, int bufferSize) throws LineUnavailableException;
    int read(byte[] b, int off, int len);
}
