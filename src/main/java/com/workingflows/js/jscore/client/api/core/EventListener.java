/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.core;

import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.JsObject;

/**
 *
 * @author iron
 */
@JsType
public interface EventListener<E extends JsObject> {

    void onEvent(E event);
}
