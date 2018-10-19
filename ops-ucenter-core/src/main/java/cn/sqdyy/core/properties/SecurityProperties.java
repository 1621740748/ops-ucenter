package cn.sqdyy.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * description: security 配置信息，可以将properties或者yml配置的对应参数直接转到本对象中
 * date: 2018/7/21 15:44
 * @author <a href="http://sqdyy.cn">神奇的鸭鸭·韦耿林</a>
 */
@ConfigurationProperties(prefix = "ops-ucenter")
public class SecurityProperties {
    private BrowserProperties browser = new BrowserProperties();
    private ValidateCodeProperties code = new ValidateCodeProperties();
    public SecurityProperties(){
    	
    }
	public BrowserProperties getBrowser() {
		return browser;
	}
	public void setBrowser(BrowserProperties browser) {
		this.browser = browser;
	}
	public ValidateCodeProperties getCode() {
		return code;
	}
	public void setCode(ValidateCodeProperties code) {
		this.code = code;
	}
    
}
