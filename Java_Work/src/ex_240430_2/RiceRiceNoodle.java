package ex_240430_2;

public class RiceRiceNoodle implements RiceNoodle {

	@Override
	public void boiledNoodle(String boiledTime) {
		System.out.println("면을 " + boiledTime + "분 동안 끓이기");
	}

	@Override
	public void addTopping(String[] ToppingSources) {
		for (int i = 0; i < ToppingSources.length; i++) {
			System.out.println("토핑 추가" + i + " : " + ToppingSources[i]);
		}
	}

	@Override
	public void makeSoup(String[] SoupSources) {
		for (int i = 0; i < SoupSources.length; i++) {
			System.out.println("육수 재료 추가" + i + " : " + SoupSources[i]);
		}
	}

	@Override
	public void makeSource(String[] Sources) {
		for (int i = 0; i < Sources.length; i++) {
			System.out.println("양념 재료 추가" + i + " : " + Sources[i]);
		}
	}

	@Override
	public void selectNoodleSize(int selectNoodleSizeNumber) {
		if(selectNoodleSizeNumber == 1) {
			System.out.println("가는 면으로 할게요.");
		} else {
			System.out.println("굵은 면으로 할게요.");
		}
	}
	
}
