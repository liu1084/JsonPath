/*
 * Copyright 2011 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jayway.jsonpath.spi.json;

public enum Mode {

    SLACK(-1),
    STRICT(1);

    private final int mode;

    Mode(int mode) {
        this.mode = mode;
    }

    public int intValue() {
        return mode;
    }

    public Mode parse(int mode) {
        if (mode == -1) {
            return SLACK;
        } else if (mode == 1) {
            return STRICT;
        } else {
            throw new IllegalArgumentException("Mode " + mode + " not supported");
        }
    }


}
