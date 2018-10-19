package cn.sqdyy.core.properties;

import cn.sqdyy.core.constants.SecurityConstants;
import cn.sqdyy.core.enums.ResponseType;
import lombok.Data;

/**
 * description: 浏览器端配置信息
 * date: 2018/7/21 15:47
 * @author <a href="http://sqdyy.cn">神奇的鸭鸭·韦耿林</a>
 */
public class BrowserProperties {

    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;
    private ResponseType loginType = ResponseType.JSON;
    
    public BrowserProperties(){
    	
    }

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public ResponseType getLoginType() {
		return loginType;
	}

	public void setLoginType(ResponseType loginType) {
		this.loginType = loginType;
	}
    
}
