package cn.sqdyy.core.properties;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: <TODO>
 * date: 2018/7/21 18:58
 *
 * @author <a href="http://sqdyy.cn">神奇的鸭鸭·韦耿林</a>
 */
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();
    public ValidateCodeProperties(){
    	
    }
	public ImageCodeProperties getImage() {
		return image;
	}
	public void setImage(ImageCodeProperties image) {
		this.image = image;
	}
    
}
