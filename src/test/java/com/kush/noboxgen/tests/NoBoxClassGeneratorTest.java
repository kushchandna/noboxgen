package com.kush.noboxgen.tests;

import org.junit.Test;

import com.kush.noboxgen.NoBoxClassGenerator;
import com.kush.noboxgen.Templates;
import com.kush.noboxgen.tests.sample1.NBG_TYPENAME_DummyOptional;

public class NoBoxClassGeneratorTest {

    @Test
    public void testName() throws Exception {
        NoBoxClassGenerator generator = new NoBoxClassGenerator();
        generator.generate(Templates.fromClass(NBG_TYPENAME_DummyOptional.class));
    }
}
