/**
 * Copyright 2012 StackMob
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

package com.stackmob.example

import com.stackmob.core.jar.JarEntryObject
import com.stackmob.core.customcode.CustomCodeMethod
import java.util.{List => JList}
import scala.collection.JavaConverters._

class EntryPointExtender extends JarEntryObject {

  override def methods(): JList[CustomCodeMethod] = {
    List[CustomCodeMethod](new HelloWorld).asJava
  }

}
