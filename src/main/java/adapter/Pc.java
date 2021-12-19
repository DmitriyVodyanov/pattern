package adapter;

public class Pc {

	public void read(ReaderDevice readerDevice) {
		System.out.printf("read %s\n", readerDevice.read());
	}
}
