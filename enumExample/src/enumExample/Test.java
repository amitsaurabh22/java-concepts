package enumExample;

public class Test {

	public static enum MigrationStatus {
		IN_PROGRESS("in-progress"), COMPLETE("complete"), PAUSED("paused"), CANCELLED("cancelled"), COMMITTED(
				"committed"), READY("ready"), ERROR("error"), PARTIALLY_COMMITTED(
						"partially-committed"), PARTIALLY_CANCELLED("partially-cancelled"), QUEUED("queued");

		String _status;

		public String get_status() {
			return _status;
		}

		public void set_status(String _status) {
			this._status = _status;
		}

		MigrationStatus(String status) {
			_status = status;

		}
	}

	public static void main(String[] args) {

		String jobStstus = "cancelled";
		if (MigrationStatus.CANCELLED.get_status().equals(jobStstus)) {
			
			System.out.println("job is cancelled");
		}
		

		// TODO Auto-generated method stub

	}

}
