package org.agmip.ace.translators.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.agmip.ace.AceBaseComponentType;
import org.agmip.ace.AceDataset;

/**
 * The {@code TranslatorOutput} interface provides methods for converting ACE data to
 * model-specific data.
 */
public interface TranslatorOutput {
    /**
     * Write the specified component(s) of an AceDataset to the <pre>outputDirectory</pre>
     *
     * This method writes out the specified component(s) an AceDataset to the
     * <pre>outputDirectory</pre> in a model-specific format.
     *
     * @param  outputDirectory the directory to ouput the translated files.
     * @param  dataset         the source ACE Dataset
     * @param  ...             subcomponents to translate
     * 
     * @return the list of generated files
     */
    public List<File> write(File outputDirectory, AceDataset dataset, AceBaseComponentType... components) throws IOException;
}
