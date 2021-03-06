/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.test.persistence.scripts.quartzdialects;

import java.sql.Types;

import org.hibernate.dialect.SQLServer2008Dialect;

public class SQLServerCustomDialect extends SQLServer2008Dialect {

    public SQLServerCustomDialect() {
        registerColumnType(Types.BLOB, "image");
        registerColumnType(Types.BOOLEAN, "varchar(1)");
    }
}
