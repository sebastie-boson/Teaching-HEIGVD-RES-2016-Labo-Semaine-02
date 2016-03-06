package ch.heigvd.res.io.util;

/**
 * @author Sebastien Boson
 * @since 05.03.2016
 *
 * Interface for the data of an experiment
 */
public interface IData {
    void addData(String operation, String strategy, int blockSize, long fileSizeInBytes, long durationInMs);
    Object getValue(Object key);
}
