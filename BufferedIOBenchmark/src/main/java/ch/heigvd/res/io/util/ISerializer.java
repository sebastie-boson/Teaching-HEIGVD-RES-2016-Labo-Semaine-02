package ch.heigvd.res.io.util;

import java.io.OutputStream;

/**
 * @author Sebastien Boson
 * @since 05.03.2016
 *
 * Interface for the serializer of the experiment
 */
public interface ISerializer {
    void serialize(IData data, OutputStream os);
}
