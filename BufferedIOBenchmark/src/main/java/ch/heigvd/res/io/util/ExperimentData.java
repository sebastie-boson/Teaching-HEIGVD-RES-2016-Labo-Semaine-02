package ch.heigvd.res.io.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastien Boson
 * @since 05.03.2016
 *
 * Class that will collect the data of an experiment.
 */
public class ExperimentData implements IData {
    // map to associate a specific value to a key
    private Map<String, Object> values;

    public ExperimentData() {
        values = new HashMap<>();
    }

    /**
     * This method will add the data (parameters)
     * in the object ExperimentData.
     */
    @Override
    public void addData(String operation, String strategy, int blockSize, long fileSizeInBytes, long durationInMs) {
        values.put("operation", operation);
        values.put("strategy", strategy);
        values.put("blockSize", blockSize);
        values.put("fileSizeInBytes", fileSizeInBytes);
        values.put("durationInMs", durationInMs);
    }

    /**
     * This method returns the object (String) at the specified key (parameter).
     */
    @Override
    public Object getValue(Object key) {
        return values.get(key);
    }
}
