/**
 * -----------------------------------------------------------------------------
 *  Copyright (c) 2014 Swathi Venkatachala
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 *to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *copies of the Software, and to permit persons to whom the Software is
 *furnished to do so, subject to the following conditions:
 *
 *The above copyright notice and this permission notice shall be included in
 *all copies or substantial portions of the Software.
 *
 *THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *THE SOFTWARE.
 *
 *---------------------------END COPYRIGHT--------------------------------------
 */
package com.anoni.mouse.logging;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * LoggingManager Class uses java.util.logging for logging in the application.
 * 
 * @author Swathi Venkatachala
 * 
 */
public final class LoggingManager {

    /**
     * Default Constructor.
     */
    private LoggingManager() {
    }

    /**
     * Logging mapper.
     */
    private static Map<Class<?>, Logger> loggerMap = new HashMap<Class<?>, Logger>();

    /**
     * Get the logger instance.
     * 
     * @param thisClass
     *            class name
     * @return logger instance
     */
    private static Logger getLogger(Class<?> thisClass) {
        if (loggerMap.get(thisClass) == null) {
            synchronized (loggerMap) {
                if (loggerMap.get(thisClass) == null) {
                    loggerMap.put(thisClass, Logger.getLogger(thisClass.toString()));
                }
            }
        }
        return loggerMap.get(thisClass);
    }

    /**
     * Method to log with the priority and message.
     * 
     * @param priority
     *            levels of priority {@link Level}
     * @param thisClass
     *            class name
     * @param message
     *            message of the log
     */
    public static void log(Level priority, Class<?> thisClass, Object message) {
        Logger logger = getLogger(thisClass);
        synchronized (logger) {
            if (logger.isLoggable(priority)) {
                logger.log(priority, (String) message);
            }
        }
    }

    /**
     * Method to log with the priority, message and throwable clause.
     * 
     * @param priority
     *            levels of priority {@link Level}
     * @param thisClass
     *            class name
     * @param message
     *            message of the log
     * @param t
     *            throwable instance
     * 
     */
    public static void log(Level priority, Class<?> thisClass, Object message, Throwable t) {
        Logger logger = getLogger(thisClass);
        synchronized (logger) {
            if (logger.isLoggable(priority)) {
                logger.log(priority, (String) message, t);
            }
        }
    }

    /**
     * Method to log with the debug mode and the message.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message of the log
     */
    public static void debug(Class<?> thisClass, Object message) {
        log(Level.FINEST, thisClass, message);
    }

    /**
     * Method to log with the debug mode, the message and throwable instance.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     * @param t
     *            throwable instance
     */
    public static void debug(Class<?> thisClass, Object message, Throwable t) {
        log(Level.FINEST, thisClass, message, t);
    }

    /**
     * Method to log with the info mode, the message.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     */
    public static void info(Class<?> thisClass, Object message) {
        log(Level.INFO, thisClass, message);
    }

    /**
     * Method to log with the info mode, the message and throwable instance.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     * @param t
     *            throwable instance
     */
    public static void info(Class<?> thisClass, Object message, Throwable t) {
        log(Level.INFO, thisClass, message, t);
    }

    /**
     * Method to log with the warn mode, the message and throwable instance.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     */
    public static void warn(Class<?> thisClass, Object message) {
        log(Level.WARNING, thisClass, message);
    }

    /**
     * Method to log with the warn mode, the message and throwable instance.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     * @param t
     *            throwable instance
     */
    public static void warn(Class<?> thisClass, Object message, Throwable t) {
        log(Level.WARNING, thisClass, message, t);
    }

    /**
     * Method to log with the severe mode, the message and throwable instance.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     */
    public static void severe(Class<?> thisClass, Object message) {
        log(Level.SEVERE, thisClass, message);
    }

    /**
     * Method to log with the severe mode, the message and throwable instance.
     * 
     * @param thisClass
     *            class name
     * @param message
     *            message
     * @param t
     *            throwable instance
     */
    public static void severe(Class<?> thisClass, Object message, Throwable t) {
        log(Level.SEVERE, thisClass, message);
    }

}
