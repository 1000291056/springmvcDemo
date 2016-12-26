package threadtest.errorthought;

import java.util.ArrayList;
import java.util.List;


public class GoodsManager {
	private ArrayList listC = new ArrayList<ConsumeRunnable>();
	private ArrayList listP = new ArrayList<ProductRunnable>();

	public List<ConsumeRunnable> getListC() {
		return listC;
	}

	public void setListC(ArrayList<ConsumeRunnable> listC) {
		this.listC = listC;
	}

	public List<ProductRunnable> getListP() {
		return listP;
	}

	public void setListP(ArrayList<ProductRunnable> listP) {
		this.listP = listP;
	}

	/**
	 *֪ͨ����
	 */
	public void signalConsume() {
		for (int i = 0; i < listC.size(); i++) {
			ConsumeRunnable runnable = (ConsumeRunnable) listC.get(i);
			runnable.resume();
		}
	}

	/**
	 * ??֪ͨ����
	 */
	public void signalProduct() {
		for (int i = 0; i < listP.size(); i++) {
			ProductRunnable runnable = (ProductRunnable) listP.get(i);
			runnable.resume();
		}
	}
	/**
	 * ??��ͣ����
	 */
	public void awaitConsume() {
		for (int i = 0; i < listC.size(); i++) {
			ConsumeRunnable runnable = (ConsumeRunnable) listC.get(i);
			runnable.pause();
		}
	}

	/**
	 * ??��ͣ����
	 */
	public void awaitProduct() {
		for (int i = 0; i < listP.size(); i++) {
			ProductRunnable runnable = (ProductRunnable) listP.get(i);
			runnable.pause();
		}
	}
	public void singnalAll() {
		signalConsume();
		signalProduct();
	}
}
