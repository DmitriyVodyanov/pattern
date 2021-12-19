package adapter;

public class Usb implements ReaderDevice{

	@Override
	public String read() {
		return " from usb";
	}
}
