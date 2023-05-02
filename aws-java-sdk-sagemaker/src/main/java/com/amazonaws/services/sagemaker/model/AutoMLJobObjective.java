/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a metric to minimize or maximize as the objective of a job. V2 API jobs (for example jobs created by
 * calling <code>CreateAutoMLJobV2</code>), support <code>Accuracy</code> only.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobObjective" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * For the list of all available metrics supported by Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics</a>.
     * </p>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * For the list of all available metrics supported by Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics</a>.
     * </p>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system.
     *        During training, the model's parameters are updated iteratively to optimize its performance based on the
     *        feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *        <p>
     *        For the list of all available metrics supported by Autopilot, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *        >Autopilot metrics</a>.
     *        </p>
     *        <p>
     *        If you do not specify a metric explicitly, the default behavior is to automatically use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MSE</code>: for regression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>F1</code>: for binary classification
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Accuracy</code>: for multiclass classification.
     *        </p>
     *        </li>
     * @see AutoMLMetricEnum
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * For the list of all available metrics supported by Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics</a>.
     * </p>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the objective metric used to measure the predictive quality of a machine learning system.
     *         During training, the model's parameters are updated iteratively to optimize its performance based on the
     *         feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *         <p>
     *         For the list of all available metrics supported by Autopilot, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *         >Autopilot metrics</a>.
     *         </p>
     *         <p>
     *         If you do not specify a metric explicitly, the default behavior is to automatically use:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MSE</code>: for regression.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>F1</code>: for binary classification
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Accuracy</code>: for multiclass classification.
     *         </p>
     *         </li>
     * @see AutoMLMetricEnum
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * For the list of all available metrics supported by Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics</a>.
     * </p>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system.
     *        During training, the model's parameters are updated iteratively to optimize its performance based on the
     *        feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *        <p>
     *        For the list of all available metrics supported by Autopilot, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *        >Autopilot metrics</a>.
     *        </p>
     *        <p>
     *        If you do not specify a metric explicitly, the default behavior is to automatically use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MSE</code>: for regression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>F1</code>: for binary classification
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Accuracy</code>: for multiclass classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public AutoMLJobObjective withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. During
     * training, the model's parameters are updated iteratively to optimize its performance based on the feedback
     * provided by the objective metric when evaluating the model on the validation dataset.
     * </p>
     * <p>
     * For the list of all available metrics supported by Autopilot, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     * >Autopilot metrics</a>.
     * </p>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system.
     *        During training, the model's parameters are updated iteratively to optimize its performance based on the
     *        feedback provided by the objective metric when evaluating the model on the validation dataset.</p>
     *        <p>
     *        For the list of all available metrics supported by Autopilot, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-metrics-validation.html#autopilot-metrics"
     *        >Autopilot metrics</a>.
     *        </p>
     *        <p>
     *        If you do not specify a metric explicitly, the default behavior is to automatically use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MSE</code>: for regression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>F1</code>: for binary classification
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Accuracy</code>: for multiclass classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public AutoMLJobObjective withMetricName(AutoMLMetricEnum metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobObjective == false)
            return false;
        AutoMLJobObjective other = (AutoMLJobObjective) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobObjective clone() {
        try {
            return (AutoMLJobObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
