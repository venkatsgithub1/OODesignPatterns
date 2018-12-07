package learning.dps.creational.abstractFactory;

public class PC extends Computer {

	private String ram;
	private String cpu;
	private String hdd;

	public PC(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getCPU() {
		return cpu;
	}

	@Override
	public String getHDD() {
		return hdd;
	}

}
