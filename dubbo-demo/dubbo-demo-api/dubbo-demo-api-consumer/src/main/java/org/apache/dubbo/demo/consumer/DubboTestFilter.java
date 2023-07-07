package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

/**
 * @author liuzhifei
 * @since 1.0
 */
@Activate(group = {CommonConstants.CONSUMER}, order = 1000)
public class DubboTestFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("remote addr:"+RpcContext.getServiceContext().getRemoteAddressString());
        System.out.println("remote addr:"+RpcContext.getServiceContext().getRemoteApplicationName());
        return invoker.invoke(invocation);
    }
}
