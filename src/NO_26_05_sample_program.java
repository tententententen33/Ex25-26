public class NO_26_05_sample_program {
	public enum OrderStatus {
		WAITING_PAYMENT(201, "支払い待ち"), 
		PREPARING_ITEM(202, "商品準備中"), 
		SHIPPED_ITEM(203, "発送済み"), 
		DELIVERED_ITEM(204, "配達完了");

		private int statusNumber;
		private String statusNameJp;

		private OrderStatus(int statusNumber, String statusNameJp) {
			this.statusNumber = statusNumber;
			this.statusNameJp = statusNameJp;
		}

		public int getStatusNumber() {
			return statusNumber;
		}

		public String getStatusNameJp() {
			return statusNameJp;
		}
	}

	public static void main(String[] args) {
		OrderStatus sample_status = OrderStatus.SHIPPED_ITEM;
		System.out.println(sample_status);
		System.out.println(sample_status.getStatusNumber());
		System.out.println(sample_status.getStatusNameJp());
	}
}
