
public class LongWrapper {

	private long l;
	private Object mutex = new Object();

	public LongWrapper(long l) {
		this.l = l;
	}

	public synchronized void incrementValueSynchronized() {
		l = l + 1;
	}

	public void incrementValueSyncUsingObjectKey() {
		synchronized (mutex) {
			l = l + 1;
		}
		
	}

	public void incrementValue() {
		l = l + 1;
	}

	public long getValue() {
		return l;
	}

}
