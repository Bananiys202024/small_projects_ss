package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable {

	@FXML
	private MediaView mv;
	
	private MediaPlayer mp;
	private Media me;
	
	@FXML
	private Slider volume_slider;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		File path = new File("src/media/video.mp4");
		me = new Media(new File("src/media/video.mp4").toURI().toString());
		mp = new MediaPlayer(me);
		mv.setMediaPlayer(mp);
		DoubleProperty width = mv.fitWidthProperty();
		DoubleProperty height = mv.fitHeightProperty();
		width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
		volume_slider.setValue(mp.getVolume()*100);
		volume_slider.valueProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable observable) {
				
				mp.setVolume(volume_slider.getValue() / 100);
		
			}
			
		});
	}
	
	public void play(ActionEvent event)
	{
		mp.play();
		mp.setRate(1);
	}
	
	public void pause(ActionEvent event)
	{
		mp.pause();
	}
	
	public void fast(ActionEvent event)
	{
		mp.setRate(2);
	}
	
	public void slow(ActionEvent event)
	{
		mp.setRate(.5);
	}
	
	public void reload(ActionEvent event)
	{
		mp.seek(mp.getStartTime());
		mp.play();
	}

	public void start(ActionEvent event)
	{
		mp.seek(mp.getStartTime());
		mp.stop();
	}

	public void last(ActionEvent event)
	{
		mp.seek(mp.getTotalDuration());
		mp.stop();
	}

}
