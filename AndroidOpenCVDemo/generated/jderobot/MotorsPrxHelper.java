// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `motors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Gazebo Motors Actuators interaction.
 **/
public final class MotorsPrxHelper extends Ice.ObjectPrxHelperBase implements MotorsPrx
{
    private static final String __getL_name = "getL";

    public float getL()
    {
        return getL(null, false);
    }

    public float getL(java.util.Map<String, String> __ctx)
    {
        return getL(__ctx, true);
    }

    private float getL(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getL", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getL");
                    __delBase = __getDelegate(false);
                    _MotorsDel __del = (_MotorsDel)__delBase;
                    return __del.getL(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getL()
    {
        return begin_getL(null, false, null);
    }

    public Ice.AsyncResult begin_getL(java.util.Map<String, String> __ctx)
    {
        return begin_getL(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getL(Ice.Callback __cb)
    {
        return begin_getL(null, false, __cb);
    }

    public Ice.AsyncResult begin_getL(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getL(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getL(Callback_Motors_getL __cb)
    {
        return begin_getL(null, false, __cb);
    }

    public Ice.AsyncResult begin_getL(java.util.Map<String, String> __ctx, Callback_Motors_getL __cb)
    {
        return begin_getL(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getL(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getL_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getL_name, __cb);
        try
        {
            __result.__prepare(__getL_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public float end_getL(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getL_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            float __ret;
            __ret = __is.readFloat();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getV_name = "getV";

    public float getV()
    {
        return getV(null, false);
    }

    public float getV(java.util.Map<String, String> __ctx)
    {
        return getV(__ctx, true);
    }

    private float getV(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getV", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getV");
                    __delBase = __getDelegate(false);
                    _MotorsDel __del = (_MotorsDel)__delBase;
                    return __del.getV(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getV()
    {
        return begin_getV(null, false, null);
    }

    public Ice.AsyncResult begin_getV(java.util.Map<String, String> __ctx)
    {
        return begin_getV(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getV(Ice.Callback __cb)
    {
        return begin_getV(null, false, __cb);
    }

    public Ice.AsyncResult begin_getV(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getV(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getV(Callback_Motors_getV __cb)
    {
        return begin_getV(null, false, __cb);
    }

    public Ice.AsyncResult begin_getV(java.util.Map<String, String> __ctx, Callback_Motors_getV __cb)
    {
        return begin_getV(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getV(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getV_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getV_name, __cb);
        try
        {
            __result.__prepare(__getV_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public float end_getV(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getV_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            float __ret;
            __ret = __is.readFloat();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getW_name = "getW";

    public float getW()
    {
        return getW(null, false);
    }

    public float getW(java.util.Map<String, String> __ctx)
    {
        return getW(__ctx, true);
    }

    private float getW(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getW", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getW");
                    __delBase = __getDelegate(false);
                    _MotorsDel __del = (_MotorsDel)__delBase;
                    return __del.getW(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getW()
    {
        return begin_getW(null, false, null);
    }

    public Ice.AsyncResult begin_getW(java.util.Map<String, String> __ctx)
    {
        return begin_getW(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getW(Ice.Callback __cb)
    {
        return begin_getW(null, false, __cb);
    }

    public Ice.AsyncResult begin_getW(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getW(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getW(Callback_Motors_getW __cb)
    {
        return begin_getW(null, false, __cb);
    }

    public Ice.AsyncResult begin_getW(java.util.Map<String, String> __ctx, Callback_Motors_getW __cb)
    {
        return begin_getW(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getW(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getW_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getW_name, __cb);
        try
        {
            __result.__prepare(__getW_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public float end_getW(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getW_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            float __ret;
            __ret = __is.readFloat();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __setL_name = "setL";

    public int setL(float l)
    {
        return setL(l, null, false);
    }

    public int setL(float l, java.util.Map<String, String> __ctx)
    {
        return setL(l, __ctx, true);
    }

    private int setL(float l, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setL", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setL");
                    __delBase = __getDelegate(false);
                    _MotorsDel __del = (_MotorsDel)__delBase;
                    return __del.setL(l, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_setL(float l)
    {
        return begin_setL(l, null, false, null);
    }

    public Ice.AsyncResult begin_setL(float l, java.util.Map<String, String> __ctx)
    {
        return begin_setL(l, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setL(float l, Ice.Callback __cb)
    {
        return begin_setL(l, null, false, __cb);
    }

    public Ice.AsyncResult begin_setL(float l, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setL(l, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setL(float l, Callback_Motors_setL __cb)
    {
        return begin_setL(l, null, false, __cb);
    }

    public Ice.AsyncResult begin_setL(float l, java.util.Map<String, String> __ctx, Callback_Motors_setL __cb)
    {
        return begin_setL(l, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setL(float l, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setL_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setL_name, __cb);
        try
        {
            __result.__prepare(__setL_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeFloat(l);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setL(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setL_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __setV_name = "setV";

    public int setV(float v)
    {
        return setV(v, null, false);
    }

    public int setV(float v, java.util.Map<String, String> __ctx)
    {
        return setV(v, __ctx, true);
    }

    private int setV(float v, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setV", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setV");
                    __delBase = __getDelegate(false);
                    _MotorsDel __del = (_MotorsDel)__delBase;
                    return __del.setV(v, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_setV(float v)
    {
        return begin_setV(v, null, false, null);
    }

    public Ice.AsyncResult begin_setV(float v, java.util.Map<String, String> __ctx)
    {
        return begin_setV(v, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setV(float v, Ice.Callback __cb)
    {
        return begin_setV(v, null, false, __cb);
    }

    public Ice.AsyncResult begin_setV(float v, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setV(v, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setV(float v, Callback_Motors_setV __cb)
    {
        return begin_setV(v, null, false, __cb);
    }

    public Ice.AsyncResult begin_setV(float v, java.util.Map<String, String> __ctx, Callback_Motors_setV __cb)
    {
        return begin_setV(v, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setV(float v, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setV_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setV_name, __cb);
        try
        {
            __result.__prepare(__setV_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeFloat(v);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setV(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setV_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __setW_name = "setW";

    public int setW(float w)
    {
        return setW(w, null, false);
    }

    public int setW(float w, java.util.Map<String, String> __ctx)
    {
        return setW(w, __ctx, true);
    }

    private int setW(float w, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setW", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setW");
                    __delBase = __getDelegate(false);
                    _MotorsDel __del = (_MotorsDel)__delBase;
                    return __del.setW(w, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_setW(float w)
    {
        return begin_setW(w, null, false, null);
    }

    public Ice.AsyncResult begin_setW(float w, java.util.Map<String, String> __ctx)
    {
        return begin_setW(w, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setW(float w, Ice.Callback __cb)
    {
        return begin_setW(w, null, false, __cb);
    }

    public Ice.AsyncResult begin_setW(float w, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setW(w, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setW(float w, Callback_Motors_setW __cb)
    {
        return begin_setW(w, null, false, __cb);
    }

    public Ice.AsyncResult begin_setW(float w, java.util.Map<String, String> __ctx, Callback_Motors_setW __cb)
    {
        return begin_setW(w, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setW(float w, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setW_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setW_name, __cb);
        try
        {
            __result.__prepare(__setW_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeFloat(w);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setW(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setW_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static MotorsPrx checkedCast(Ice.ObjectPrx __obj)
    {
        MotorsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof MotorsPrx)
            {
                __d = (MotorsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    MotorsPrxHelper __h = new MotorsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static MotorsPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        MotorsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof MotorsPrx)
            {
                __d = (MotorsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    MotorsPrxHelper __h = new MotorsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static MotorsPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        MotorsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    MotorsPrxHelper __h = new MotorsPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static MotorsPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        MotorsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    MotorsPrxHelper __h = new MotorsPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static MotorsPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        MotorsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof MotorsPrx)
            {
                __d = (MotorsPrx)__obj;
            }
            else
            {
                MotorsPrxHelper __h = new MotorsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static MotorsPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        MotorsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            MotorsPrxHelper __h = new MotorsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::Motors"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _MotorsDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _MotorsDelD();
    }

    public static void __write(IceInternal.BasicStream __os, MotorsPrx v)
    {
        __os.writeProxy(v);
    }

    public static MotorsPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            MotorsPrxHelper result = new MotorsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
