/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.b2bi.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum X12TransactionSet {

    X12_110("X12_110"),
    X12_180("X12_180"),
    X12_204("X12_204"),
    X12_210("X12_210"),
    X12_211("X12_211"),
    X12_214("X12_214"),
    X12_215("X12_215"),
    X12_259("X12_259"),
    X12_260("X12_260"),
    X12_266("X12_266"),
    X12_269("X12_269"),
    X12_270("X12_270"),
    X12_271("X12_271"),
    X12_274("X12_274"),
    X12_275("X12_275"),
    X12_276("X12_276"),
    X12_277("X12_277"),
    X12_278("X12_278"),
    X12_310("X12_310"),
    X12_315("X12_315"),
    X12_322("X12_322"),
    X12_404("X12_404"),
    X12_410("X12_410"),
    X12_417("X12_417"),
    X12_421("X12_421"),
    X12_426("X12_426"),
    X12_810("X12_810"),
    X12_820("X12_820"),
    X12_824("X12_824"),
    X12_830("X12_830"),
    X12_832("X12_832"),
    X12_834("X12_834"),
    X12_835("X12_835"),
    X12_837("X12_837"),
    X12_844("X12_844"),
    X12_846("X12_846"),
    X12_849("X12_849"),
    X12_850("X12_850"),
    X12_852("X12_852"),
    X12_855("X12_855"),
    X12_856("X12_856"),
    X12_860("X12_860"),
    X12_861("X12_861"),
    X12_864("X12_864"),
    X12_865("X12_865"),
    X12_869("X12_869"),
    X12_870("X12_870"),
    X12_940("X12_940"),
    X12_945("X12_945"),
    X12_990("X12_990"),
    X12_997("X12_997"),
    X12_999("X12_999");

    private String value;

    private X12TransactionSet(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return X12TransactionSet corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static X12TransactionSet fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (X12TransactionSet enumEntry : X12TransactionSet.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
