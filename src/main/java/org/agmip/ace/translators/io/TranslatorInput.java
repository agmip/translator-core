package org.agmip.ace.translators.io;

import java.io.File;
import java.io.IOException;
import org.agmip.ace.AceDataset;

/**
 * The {@code TranslatorInput} interface provides methods for converting 
 * model-specific data to ACE data.
 */
public interface TranslatorInput {
    /**
     * This method reads the model input files from the <pre>inputDirectory</pre> 
     * and translate to AceDataSet format.
     *
     * @param  inputDirectory the directory which contains the model-specific data files.
     * @return the translated ACE data.
     */
    public AceDataset read(File outputDirectory) throws IOException;
}
