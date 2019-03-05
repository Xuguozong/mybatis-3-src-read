/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 *
 * 数据源是实际开发中常用的组件之一。
 * 现在开源的数据源都提供了比较丰富的功能，例如，连接池功能、检测连接状态等，
 * 选择性能优秀的数据源组件对于提升 ORM 框架乃至整个应用的性能都是非常重要的。
 *
 * MyBatis 自身提供了相应的数据源实现，当然 MyBatis 也提供了与第三方数据源集成的接口，这些功能都位于数据源模块之中。
 * Base package for Datasources
 */
package org.apache.ibatis.datasource;
