package io.swagger.codegen.javaPlayFramework;

import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.java.JavaClientOptionsTest;
import io.swagger.codegen.languages.JavaPlayFrameworkCodegen;
import io.swagger.codegen.options.JavaPlayFrameworkOptionsProvider;
import mockit.Expectations;
import mockit.Tested;

public class JavaPlayFrameworkOptionsTest extends JavaClientOptionsTest {

    @Tested
    private JavaPlayFrameworkCodegen clientCodegen;

    public JavaPlayFrameworkOptionsTest() {
        super(new JavaPlayFrameworkOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return clientCodegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(clientCodegen) {{
            clientCodegen.setModelPackage(JavaPlayFrameworkOptionsProvider.MODEL_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setApiPackage(JavaPlayFrameworkOptionsProvider.API_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setSortParamsByRequiredFlag(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.SORT_PARAMS_VALUE));
            times = 1;
            clientCodegen.setInvokerPackage(JavaPlayFrameworkOptionsProvider.INVOKER_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setGroupId(JavaPlayFrameworkOptionsProvider.GROUP_ID_VALUE);
            times = 1;
            clientCodegen.setArtifactId(JavaPlayFrameworkOptionsProvider.ARTIFACT_ID_VALUE);
            times = 1;
            clientCodegen.setArtifactVersion(JavaPlayFrameworkOptionsProvider.ARTIFACT_VERSION_VALUE);
            times = 1;
            clientCodegen.setSourceFolder(JavaPlayFrameworkOptionsProvider.SOURCE_FOLDER_VALUE);
            times = 1;
            clientCodegen.setLocalVariablePrefix(JavaPlayFrameworkOptionsProvider.LOCAL_PREFIX_VALUE);
            times = 1;
            clientCodegen.setSerializableModel(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.SERIALIZABLE_MODEL_VALUE));
            times = 1;
            clientCodegen.setFullJavaUtil(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.FULL_JAVA_UTIL_VALUE));
            times = 1;
            clientCodegen.setTitle(JavaPlayFrameworkOptionsProvider.TITLE);
            times = 1;
            clientCodegen.setConfigPackage(JavaPlayFrameworkOptionsProvider.CONFIG_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setBasePackage(JavaPlayFrameworkOptionsProvider.BASE_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setControllerOnly(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.CONTROLLER_ONLY));
            times = 1;
            clientCodegen.setSingleContentTypes(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.SINGLE_CONTENT_TYPES));
            times = 1;
            clientCodegen.setResponseWrapper(JavaPlayFrameworkOptionsProvider.RESPONSE_WRAPPER);
            times = 1;
            clientCodegen.setUseTags(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.USE_TAGS));
            times = 1;
            clientCodegen.setUseBeanValidation(Boolean.valueOf(JavaPlayFrameworkOptionsProvider.USE_BEANVALIDATION));
            times = 1;
        }};
    }
}
