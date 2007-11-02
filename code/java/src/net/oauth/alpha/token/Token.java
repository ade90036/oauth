/*
 * Copyright 2007 Sxip Identity Corporation
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

package net.oauth.alpha.token;

import java.util.HashMap;

public interface Token {
    String getType();

    String getToken();
    void setToken(String token);

    String getSecret();
    void setSecret(String secret);

    HashMap<String,String> getAdditionalParams();
    void setAdditionalParams(HashMap<String,String> additionalParams);

    // These are really only for Request Tokens
    boolean getAuthorized();
    void setAuthorized(boolean authorized);

    boolean getExchanged();
    void setExchanged(boolean exchanged);
}