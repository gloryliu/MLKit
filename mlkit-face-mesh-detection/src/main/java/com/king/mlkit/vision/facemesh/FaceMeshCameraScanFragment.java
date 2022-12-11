package com.king.mlkit.vision.facemesh;

import com.google.mlkit.vision.facemesh.FaceMesh;
import com.king.mlkit.vision.camera.BaseCameraScanFragment;
import com.king.mlkit.vision.camera.analyze.Analyzer;
import com.king.mlkit.vision.facemesh.analyze.FaceMeshDetectionAnalyzer;

import java.util.List;

import androidx.annotation.Nullable;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public abstract class FaceMeshCameraScanFragment extends BaseCameraScanFragment<List<FaceMesh>> {

    @Nullable
    @Override
    public Analyzer<List<FaceMesh>> createAnalyzer() {
        return new FaceMeshDetectionAnalyzer();
    }

}
