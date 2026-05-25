package javax.sound.sampled;

public interface SourceDataLine extends DataLine {
    @Override
    void open() throws LineUnavailableException;

    void open(AudioFormat format) throws LineUnavailableException;
    void open(AudioFormat format, int bufferSize) throws LineUnavailableException;

    int write(byte[] b, int off, int len);
}
