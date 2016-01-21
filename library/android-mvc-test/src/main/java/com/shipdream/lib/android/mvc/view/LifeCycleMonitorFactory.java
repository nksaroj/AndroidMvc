/*
 * Copyright 2016 Kejun Xia
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

package com.shipdream.lib.android.mvc.view;

import com.shipdream.lib.android.mvc.view.help.LifeCycleMonitor;
import com.shipdream.lib.android.mvc.view.help.LifeCycleMonitorA;
import com.shipdream.lib.android.mvc.view.help.LifeCycleMonitorB;
import com.shipdream.lib.android.mvc.view.help.LifeCycleMonitorC;
import com.shipdream.lib.android.mvc.view.help.LifeCycleMonitorD;

public interface LifeCycleMonitorFactory {
    LifeCycleMonitor provideLifeCycleMonitor();
    LifeCycleMonitorA provideLifeCycleMonitorA();
    LifeCycleMonitorB provideLifeCycleMonitorB();
    LifeCycleMonitorC provideLifeCycleMonitorC();
    LifeCycleMonitorD provideLifeCycleMonitorD();
}
