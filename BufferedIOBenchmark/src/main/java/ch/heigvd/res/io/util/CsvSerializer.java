package ch.heigvd.res.io.util;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Sebastien Boson
 * @since 05.03.2016
 *
 * Class that will serialize the data in a csv file format.
 */
public class CsvSerializer implements ISerializer {
    /**
     * This method serializes the data and written it
     * in the specified OutputStream (parameters).
     */
    @Override
    public void serialize(IData data, OutputStream os) {
        try {
            os.write((data.getValue("operation") + ",").getBytes());
            os.write((data.getValue("strategy") + ",").getBytes());
            os.write((data.getValue("blockSize") + ",").getBytes());
            os.write((data.getValue("fileSizeInBytes") + ",").getBytes());
            os.write((data.getValue("durationInMs") + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
