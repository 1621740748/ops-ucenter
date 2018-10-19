package cn.sqdyy.core.properties;

import lombok.Data;

/**
 * description: 图片验证码配置文件
 * date: 2018/7/21 18:59
 * @author <a href="http://sqdyy.cn">神奇的鸭鸭·韦耿林</a>
 */
public class ImageCodeProperties  {
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	public int getMinLength() {
		return minLength;
	}
	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}
	public int getExpireIn() {
		return expireIn;
	}
	public void setExpireIn(int expireIn) {
		this.expireIn = expireIn;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ImageCodeProperties(){
		
	}
    /** 图片宽度 */
    private int width = 67;
    /** 图片高度 */
    private int height = 23;
    /** 字符最大长度 */
    private int maxLength = 6;
    /** 字符最小长度 */
    private int minLength = 4;
    /** 过期时间 */
    private int expireIn = 60;
    /** 验证码rgb */
    private int r = 16;
    /** 验证码rgb */
    private int g = 142;
    /** 验证码rgb */
    private int b = 233;
    /** 需要使用图片验证码的URL，如果有多个URL使用,分隔 */
    private String url;

    

}
