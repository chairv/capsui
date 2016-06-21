package com.capsui.weixin.API;

import java.io.IOException;

import com.capsui.utils.HttpLocal;
import com.squareup.okhttp.Response;

/**
 * Created by tancw on 2016/6/21.
 */
public class TempAPI {
	private static String URL = "https://api.weixin.qq.com/cgi-bin/template/get_all_private_template?access_token=";

	public static String getTemps(String access_token) {
		String result = null;
		try {
			Response response = HttpLocal.get(URL + access_token);
            if(response.isSuccessful()){
                result = response.body().string();
            }
		} catch (IOException e) {
			// e.printStackTrace();
		}
		return result;
	}
}
