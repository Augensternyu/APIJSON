/*Copyright (C) 2020 Tencent.  All rights reserved.

This source code is licensed under the Apache License Version 2.0.*/


package apijson.orm;

import java.util.List;

/**来访者
 * @author Lemon
 */
public interface Visitor<T> {

	T getId();

	List<T> getContactIdList();

}
