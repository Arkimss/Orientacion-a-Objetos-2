package paquete.Ejercicio5;

public class VideoStreamAdapter implements Media{
	private VideoStream video;
	public void play() {
		this.video.reproduce();
	}
}
