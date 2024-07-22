package media;

import Properties.mediapage;
import POM.media;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class media_001 extends BaseClass {
	
	@Test
	public static void media() throws InterruptedException {
	
		click(media_Pom.managecontent_side);
		Thread.sleep(1000);
		
		click(media_Pom.media_menu_pom);
		Thread.sleep(1000);
		
		click(media_Pom.upload_media_pom);
		Thread.sleep(1000);
		
		sendData(media_Pom.choose_file_pom, mediapage_details.mediapath());
		Thread.sleep(1000);
		
		click(media_Pom.upload_btn_pom);


	}
}
