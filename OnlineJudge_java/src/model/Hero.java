package model;

public class Hero extends Character {
	private boolean isFlying;
	
	public Hero(String name) {
		setName(name);
		
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	// �߻� �޼ҵ�� ��� ���� �ʿ��� ������ ������ ������Ѵ�.
	@Override
	public void attack(Hero hero) {
		System.out.println(this.getName() + "�� " + hero.getName() + "�� �ο��� �ߴ�.");
		
	}
	

}
