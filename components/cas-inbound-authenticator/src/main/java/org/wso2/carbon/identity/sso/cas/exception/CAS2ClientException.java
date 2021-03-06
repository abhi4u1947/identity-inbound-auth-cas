/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.sso.cas.exception;

import org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkClientException;

public class CAS2ClientException extends FrameworkClientException {

    private String acsUrl;
    private String serviceTicketId;
    private String exceptionStatus;
    private String exceptionMessage;

    protected CAS2ClientException(String errorDesciption) {
        super(errorDesciption);
    }

    protected CAS2ClientException(String errorDescription, String exceptionStatus, String exceptionMessage, String acsUrl, String serviceTicketId) {
        super(errorDescription);
        this.acsUrl = acsUrl;
        this.serviceTicketId = serviceTicketId;
        this.exceptionMessage = exceptionMessage;
        this.exceptionStatus = exceptionStatus;
    }

    protected CAS2ClientException(String errorDescription, Throwable cause) {
        super(errorDescription, cause);
    }

    public static CAS2ClientException error(String errorDescription) {
        return new CAS2ClientException(errorDescription);
    }

    public static CAS2ClientException error(String errorDescription, Throwable cause) {
        return new CAS2ClientException(errorDescription, cause);
    }

    public static CAS2ClientException error(String errorDescription, String exceptionStatus, String exceptionMessage, String acsUrl, String serviceTicketId) {
        return new CAS2ClientException(errorDescription, exceptionStatus, exceptionMessage, acsUrl, serviceTicketId);
    }

    public String getAcsUrl() {
        return acsUrl;
    }

    public String getServiceTicketId() {
        return serviceTicketId;
    }

    public String getExceptionStatus() {
        return exceptionStatus;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
