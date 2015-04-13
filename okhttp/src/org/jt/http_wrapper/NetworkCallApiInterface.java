package org.jt.http_wrapper;

import java.io.IOException;

/**
 * Created by jtliew on 4/13/15.
 */
public interface NetworkCallApiInterface {
    <T> void getData(String url, String tag, Class<T> responseClass, ApiCallback callback);

    <T> void getData(String url, Class<T> responseClass, ApiCallback callback);

    <T> void postData(String url, String tag, T postData, Class<T> responseClass, ApiCallback callback) throws IOException;

    <T> void postData(String url, T postData, Class<T> responseClass, ApiCallback callback) throws IOException;
}
