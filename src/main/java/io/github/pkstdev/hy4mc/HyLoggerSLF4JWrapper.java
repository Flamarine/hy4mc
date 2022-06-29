package io.github.pkstdev.hy4mc;

import org.hydev.logger.HyLogger;
import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.Arrays;

public class HyLoggerSLF4JWrapper implements Logger {
    private final String name;
    private final HyLogger internalLogger;

    public HyLoggerSLF4JWrapper(String name) {
        this.name = name;
        this.internalLogger = new HyLogger(name);
    }

    public HyLoggerSLF4JWrapper(HyLogger loggerToWrap) {
        this.name = loggerToWrap.getPrefix();
        this.internalLogger = loggerToWrap;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void trace(String msg) {
        internalLogger.error(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        internalLogger.error(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        internalLogger.error(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        internalLogger.error(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        internalLogger.error(msg);
        internalLogger.error(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return true;
    }

    @Override
    public void trace(Marker marker, String msg) {
        internalLogger.error(msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        internalLogger.error(format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        internalLogger.error(format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        internalLogger.error(format, argArray);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        internalLogger.error(msg);
        internalLogger.error(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public void debug(String msg) {
        internalLogger.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        internalLogger.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        internalLogger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        internalLogger.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        internalLogger.debug(msg);
        internalLogger.debug(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return true;
    }

    @Override
    public void debug(Marker marker, String msg) {
        internalLogger.debug(msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        internalLogger.debug(format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        internalLogger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        internalLogger.debug(format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        internalLogger.debug(msg);
        internalLogger.debug(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    @Override
    public void info(String msg) {
        internalLogger.log(msg);
    }

    @Override
    public void info(String format, Object arg) {
        internalLogger.log(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        internalLogger.log(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        internalLogger.log(format, arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        internalLogger.log(msg);
        internalLogger.log(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return true;
    }

    @Override
    public void info(Marker marker, String msg) {
        internalLogger.log(msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        internalLogger.log(format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        internalLogger.log(format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        internalLogger.log(format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        internalLogger.log(msg);
        internalLogger.log(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    @Override
    public void warn(String msg) {
        internalLogger.warning(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        internalLogger.warning(format, arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        internalLogger.warning(format, arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        internalLogger.warning(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        internalLogger.warning(msg);
        internalLogger.warning(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return true;
    }

    @Override
    public void warn(Marker marker, String msg) {
        internalLogger.warning(msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        internalLogger.warning(format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        internalLogger.warning(format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        internalLogger.warning(format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        internalLogger.warning(msg);
        internalLogger.warning(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    @Override
    public void error(String msg) {
        internalLogger.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        internalLogger.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        internalLogger.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        internalLogger.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        internalLogger.error(msg);
        internalLogger.error(Arrays.toString(t.getStackTrace()));
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return true;
    }

    @Override
    public void error(Marker marker, String msg) {
        internalLogger.error(msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        internalLogger.error(format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        internalLogger.error(format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        internalLogger.error(format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        internalLogger.error(msg);
        internalLogger.error(Arrays.toString(t.getStackTrace()));
    }
}
