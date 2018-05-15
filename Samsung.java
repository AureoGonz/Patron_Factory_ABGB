package factory;

public class Samsung implements Mobile{
	private int ramSize;
	private String processor;

    public Samsung(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
	
	
}
