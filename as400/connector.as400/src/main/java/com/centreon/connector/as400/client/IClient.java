/*
 * Copyright 2021 Centreon (http://www.centreon.com/)
 *
 * Centreon is a full-fledged industry-strength solution that meets
 * the needs in IT infrastructure and application monitoring for
 * service performance.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package com.centreon.connector.as400.client;

import com.centreon.connector.as400.dispatcher.check.ResponseData;

/**
 * @author Lamotte Jean-Baptiste
 */
public interface IClient {
    String getRawRequest();

    void writeAnswer(ResponseData answer);

    void parseRequest() throws Exception;

    String getAs400Host();

    String getAs400Login();

    String getAs400Password();

    String getAs400CheckType();

    Integer getAs400Ssl();

    Object getAs400Arg(String key);
}
