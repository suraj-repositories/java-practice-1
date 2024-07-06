package Bro_codes_java_reloaded;

public class Sh_71_Create___exe____ {
	public static void main(String[] args) {
		
		// STEPS ...
		
		/*
		 * 
		Create an executable jar with Eclipse IDE
		-----------------------------------------------------------------------------------
		1. Right click on java project (pick a project with a GUI)
		2. Export 
		3. Java > Runnable Jar file
		4. At Launch configuration select your project
		5. At expory destination, select where you want this jar file exported to 
		6. finish
		
		Create an Executable jar file IntelliJ
		------------------------------------------------------------------------------------
		1. File > Project Structure > Artifacts > (+) > JAR > jar from module with dependencies
		2. Main Class : select the class containing your main method
		3. OK
		4. Change output directory to where you want this JAR saved to 
		5. Apply > OK
		6. Build (top of window in IntelliJ) > Build Artifacts > Build
		
		If you want an icon, convert an image to a .ico file
		------------------------------------------------------------------------------------
		1. https://iconconvert.com/   (this is a decent site);
		2. Choose your Image(file type may vary)
		3. Upload
		4. Convert to ICON
		5. Download your icon
		
		Use Launch4j to create an .exe with custom icon 
		-------------------------------------------------------------------------------------
		1. Install Launch4j http://launch4j.sourceforge.net/
		2. Output file: browse for the output destination and name your file ending with .exe
		3. Jar: browse for where you saved your jar or executable jar file
		4. (Optional) icon : browse for your custom icon (must be .ico)
		5. navigate to JRE tab
		6. Bundled JRE path: Browse for location of your jdk (Example === C:\Program Files\Java\jdk-14.0.1)
		7. At the top of window , click the Build Wrapper (gear icon)
		8. name and save the Launch4j config file where you want 
		9. Your application .exe should be saved to your output filelocation (no longer need previous files)
		*
		*/
	}

}
