/**
 * 
 */
/**
 * 
 */
module AimsProject {
	requires java.desktop;
	requires javafx.swing;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.base;
	
	opens hust.soict.dsai.aims.screen to javafx.fxml;
	opens hust.soict.dsai.aims.media to javafx.base;
	
	exports hust.soict.dsai.aims.screen;
}