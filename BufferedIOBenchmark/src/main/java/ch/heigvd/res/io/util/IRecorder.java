package ch.heigvd.res.io.util;

/**
 * @author Sebastien Boson
 * @since 05.03.2016
 *
 * Interface for the recorder of an experiment
 */
public interface IRecorder {
    void init();
    void record(IData data);
    void close();
}
