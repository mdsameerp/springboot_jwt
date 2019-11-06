package com.ipigeon.app.util;

import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.stereotype.Component;

@Component("myRequestCache")
public class MyRequestCache extends HttpSessionRequestCache {
    public MyRequestCache() {
        super();
    }
}