package sharpen.ui.tests;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.*;


public class AnnotationsTestCase extends AbstractConversionTestCase {

	@Test
	public void testSimpleAnnotation() throws IOException, CoreException {
		runResourceTestCase("SimpleAnnotation");
	}

    @Test
    public void testSimpleAnnotationMapping() throws IOException, CoreException {
        runResourceTestCase("SimpleAnnotationMapping");
    }

    @Test
    public void testMethodAnnotationMapping() throws IOException, CoreException {
        runResourceTestCase("MethodAnnotation");
    }
	
	@Test
	public void testCompilerAnnotations() throws IOException, CoreException {
		runResourceTestCase("CompilerAnnotations");
	}
	
	@Override
	protected void runResourceTestCase(String resourceName) throws IOException, CoreException {
		super.runResourceTestCase("annotations/" + resourceName);
	}
	
	@Override
	protected Configuration getConfiguration() {
	    final Configuration config = super.getConfiguration();
	    config.enableNativeInterfaces();
        config.mapType("annotations.AnnotationToMap", "annotations.MappedAnnotation");
		return config;
	}
}
