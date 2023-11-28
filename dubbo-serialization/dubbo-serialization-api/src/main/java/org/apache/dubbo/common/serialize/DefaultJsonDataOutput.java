/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.common.serialize;

import java.io.IOException;

/**
 * Basic default json type input interface.
 */
public interface DefaultJsonDataOutput extends ObjectOutput {

    default void writeBool(boolean v) throws IOException {
        writeObject(v);
    }

    default void writeByte(byte v) throws IOException {
        writeObject(v);
    }

    default void writeShort(short v) throws IOException {
        writeObject(v);
    }

    default void writeInt(int v) throws IOException {
        writeObject(v);
    }

    @Override
    default void writeLong(long v) throws IOException {
        writeObject(v);
    }

    @Override
    default void writeFloat(float v) throws IOException {
        writeObject(v);
    }

    @Override
    default void writeDouble(double v) throws IOException {
        writeObject(v);
    }

    @Override
    default void writeUTF(String v) throws IOException {
        writeObject(v);
    }
}
