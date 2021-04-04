package com.otaliastudios.cameraview;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CameraExceptionTest {

    @Test
    public void testConstructor() {
        RuntimeException cause = new RuntimeException("Error");
        CameraException camera = new CameraException(cause);
        assertEquals(cause, camera.getCause());
    }
}
