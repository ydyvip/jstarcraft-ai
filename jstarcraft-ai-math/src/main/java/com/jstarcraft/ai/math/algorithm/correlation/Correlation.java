package com.jstarcraft.ai.math.algorithm.correlation;

import com.jstarcraft.ai.math.structure.matrix.MathMatrix;
import com.jstarcraft.ai.math.structure.matrix.SymmetryMatrix;
import com.jstarcraft.ai.math.structure.vector.MathVector;

/**
 * 相关度
 * 
 * @author Birdy
 *
 */
public interface Correlation {

    /**
     * 根据分数矩阵计算相关度矩阵
     * 
     * @param scoreMatrix
     * @param transpose
     * @param scale
     * @return
     */
    SymmetryMatrix makeCorrelationMatrix(MathMatrix scoreMatrix, boolean transpose, float scale);

    /**
     * 获取两个向量的相关系数
     * 
     * @param leftVector
     * @param rightVector
     * @param scale
     * @return
     */
    float getCoefficient(MathVector leftVector, MathVector rightVector, float scale);

    /**
     * 获取恒等系数
     * 
     * @return
     */
    default float getIdentical() {
        return 1F;
    }

}
