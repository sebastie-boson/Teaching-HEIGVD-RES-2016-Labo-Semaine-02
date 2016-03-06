package ch.heigvd.res.io.util;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Sebastien Boson
 * @since 05.03.2016
 *
 * Class that will initialize a BufferedOutputStream with the path of a file
 * and will be used to record data from an ExperimentData object in a specific
 * serializer.
 */
public class FileRecorder implements IRecorder {
    private String fileName;
    private ISerializer serializer;
    // OutputStream to write data in
    private OutputStream osFile;

    // first line of the csv file
    private final static String FIRST_LINE_CSV_FILE = "operation,strategy,blockSize,fileSizeInBytes,durationInMs\n";

    /**
     * Constructor of FileRecorder class
     */
    public FileRecorder(String fileName, ISerializer serializer) {
        this.fileName = fileName;
        this.serializer = serializer;
    }

    /**
     * This method initializes a BufferedOutputStream
     * with the path of the file given in the constructor.
     */
    @Override
    public void init() {
        try {
            osFile = new FileOutputStream(fileName);
            osFile = new BufferedOutputStream(osFile);
            // write the first line of the csv file
            osFile.write(FIRST_LINE_CSV_FILE.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method records data from an IData object (parameter).
     */
    @Override
    public void record(IData data) {
        // serialize the data in a csv file format
        serializer.serialize(data, osFile);
    }

    /**
     * This method closes the BufferedOutputStream.
     */
    @Override
    public void close() {
        try {
            osFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
