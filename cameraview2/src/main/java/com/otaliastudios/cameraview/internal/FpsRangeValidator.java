package com.otaliastudios.cameraview.internal;

import android.os.Build;
import android.util.Range;

import androidx.annotation.RequiresApi;

import com.otaliastudios.cameraview.CameraLogger;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
public class FpsRangeValidator {

    private final static CameraLogger LOG = CameraLogger.create("FpsRangeValidator");
    private final static Map<String, List<Range<Integer>>> sIssues = new HashMap<>();

    static {
        sIssues.put("Google Pixel 4", Collections.singletonList(new Range<>(15, 60)));
    }

    public static boolean validate(Range<Integer> range) {
        LOG.i("Build.MODEL:", Build.MODEL, "Build.BRAND:", Build.BRAND, "Build.MANUFACTURER:", Build.MANUFACTURER);
        String descriptor = Build.MANUFACTURER + " " + Build.MODEL;
        List<Range<Integer>> ranges = sIssues.get(descriptor);
        if (ranges != null && ranges.contains(range)) {
            LOG.i("Dropping range:", range);
            return false;
        }
        return true;
    }
}
