package adapter;

public class UsbAdapter implements ReaderDevice {
	protected SdCard sdCard;

	public UsbAdapter(SdCard sdCard) {
		this.sdCard = sdCard;
	}


	@Override
	public String read() {
		return sdCard.sdCardRead();
	}
}
