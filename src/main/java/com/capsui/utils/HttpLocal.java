package com.capsui.utils;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by tancw on 2016/6/21.
 */
public class HttpLocal {
	private static final OkHttpClient $http = new OkHttpClient();

	public static Response get(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();
		return $http.newCall(request).execute();
	}
}
