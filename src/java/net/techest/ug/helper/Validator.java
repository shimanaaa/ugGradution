/*  Copyright 2010 princehaku
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  Created on : Sep 13, 2011, 9:16:27 PM
 *  Author     : princehaku
 */
package net.techest.ug.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author princehaku
 */
public class Validator {
    /**验证一个字符串是否匹配对应的正则
     * 
     * @param sourceString
     * @param regxp
     * @return 
     */
    public static boolean validate(String sourceString,String regxp){
        Pattern pn=Pattern.compile(regxp);
        Matcher mc=pn.matcher(sourceString);
        return mc.matches();
    }
}
