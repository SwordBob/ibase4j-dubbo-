package org.ibase4j.core;

import org.ibase4j.core.base.BaseProviderImpl;
import org.ibase4j.provider.ISysProvider;

import com.alibaba.dubbo.config.annotation.Service;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@Service(interfaceClass = ISysProvider.class)
public class SysProviderImpl extends BaseProviderImpl implements ISysProvider {

}