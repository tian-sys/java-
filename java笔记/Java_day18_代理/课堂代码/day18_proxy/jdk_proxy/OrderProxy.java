package com.chixing.day18_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*

    JDK动态代理
    该类是 订单操作代理类

 */
public class OrderProxy implements InvocationHandler {
    private Object target;

    public OrderProxy(Object target) {
        this.target = target;
    }

    /**
     *  生成代理对象
     *  @return  返回对应代理对象
     */
    public Object newProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                      target.getClass().getInterfaces(),
                                     this);

    }


    //2. 实现业务增强（在订单创建、删除之后，添加日志）
    // orderApiImpl.xx()
    // proxy.xx()

    /**
     *
     * @param proxy 代理对象
     * @param method    目标对象调用的方法 (目标方法)(orderApi.saveOrder , orderApi.deleteOrder.....)
     * @param args 目标方法的参数列表
     * @return 返回目标方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            proxy = target;
            Object result =  method.invoke(proxy,args);  // 目标方法调用

            if(method.getName().equals("saveOrder") || method.getName().equals("deleteOrder")  ){
                Log log = new Log(); // 增强实现（添加日志）
                log.addLog();
            }

        return result;
    }








}
