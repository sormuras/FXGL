/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package com.almasb.fxgl.notification.view

import com.almasb.fxgl.core.Updatable
import com.almasb.fxgl.notification.Notification
import javafx.scene.layout.Pane
import javafx.scene.paint.Color

/**
 * A notification view / pane is added when a notification is pushed and is being
 * displayed.
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
abstract class NotificationView : Pane(), Updatable {

    var backgroundColor = Color.LIGHTGREEN
    var textColor = Color.WHITE
    //var position = Position.TOP

    /**
     * Called when view is added to scene.
     */
    abstract fun playInAnimation()

    /**
     * Called when the next notification should be displayed.
     */
    abstract fun push(notification: Notification)

    /**
     * Called when view is being removed from scene.
     */
    abstract fun playOutAnimation()
}